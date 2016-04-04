package GUI;

import fuzzysys.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Nick Taylor on 3/20/2016.
 */
public class MainController extends Application {

    //private member variables
    //window components
    @FXML
    private Slider patienceSlider;
    @FXML
    private Slider reactionTimeSlider;
    @FXML
    private Slider competitivenessSlider;
    @FXML
    private Slider attentionToDetailSlider;
    @FXML
    private Slider anxietySlider;
    @FXML
    private Slider planningSlider;
    @FXML
    private Slider cooperationSlider;
    @FXML
    private Slider excitementSlider;
    @FXML
    private Slider persistenceSlider;


    @FXML
    private ChoiceBox<String> genreBox;
    @FXML
    private ChoiceBox<String> traitBox;
    @FXML
    private ChoiceBox<String> reviewBox;


    @FXML
    private Label topChoiceLabel;
    @FXML
    private Label secondChoiceLabel;
    @FXML
    private Label thirdChoiceLabel;
    @FXML
    private Label recommendedGameLabel;

    //working memory variables
    private double patience;
    private double reactionTime;
    private double competitiveness;
    private double attentionToDetail;
    private double anxiety;
    private double planning;
    private double cooperation;
    private double excitement;
    private double persistence;


    private Stage primaryStage;
    private BorderPane rootLayout;

    private String selectedTrait;


    private static GenreEngine engine;


    public static void main(String[] args)
    {
        engine = new GenreEngine();
        launch(args);

        //Start fuzzy engine

    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Fuzzy Game Genre Picker");

        showInputWindow();

    }


    //opens the window initially
    public void showInputWindow() {
        try {
            // Load input window.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("InputWindow.fxml"));
            AnchorPane windowOverview = (AnchorPane) loader.load();
            Scene mainScene = new Scene(windowOverview);
            primaryStage.setScene(mainScene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //getters

    public double getPatience() {
        return patience;
    }

    public double getReactionTime() {
        return reactionTime;
    }

    public double getCompetitiveness() {
        return competitiveness;
    }

    public double getCooperation() {
        return cooperation;
    }

    public double getAttentionToDetail() {
        return attentionToDetail;
    }

    public double getAnxiety() {
        return anxiety;
    }

    public double getPlanning() {
        return planning;
    }

    public double getPersistence() {
        return persistence;
    }

    public double getExcitement() {
        return excitement;
    }

    //controls the save button functionality
    //updates all trait variables
    //TODO add code to show output of GenreEngine
    //TODO add code to adjust labels showing top genres
    //TODO add code to randomly grab a game in the top genre
    @FXML
    private void handleSaveButton() {

        anxiety = anxietySlider.getValue();
        attentionToDetail = attentionToDetailSlider.getValue();
        patience = patienceSlider.getValue();
        reactionTime = reactionTimeSlider.getValue();
        persistence = persistenceSlider.getValue();
        excitement = excitementSlider.getValue();
        competitiveness = competitivenessSlider.getValue();
        planning = planningSlider.getValue();
        cooperation = cooperationSlider.getValue();

        calculateRanks();

    }

    @FXML
    private void updateReviewBox()
    {

        //find selected trait
        String selectedTrait = traitBox.getValue();


        String[] reviewBoxChoices = new String[2];
        switch (selectedTrait)
        {
            case "Patience":
                reviewBoxChoices[0] = "Game was too slow";
                reviewBoxChoices[1] = "Game was too fast";
                break;
            case "Reaction Time":
                reviewBoxChoices[0] = "Game moved too slow";
                reviewBoxChoices[1] = "Game moved too fast";
                break;
            case "Competitiveness":
                reviewBoxChoices[0] = "Game wasn't competitive enough";
                reviewBoxChoices[1] = "Game was too competitive";
                break;
            case "Attention To Detail":
                reviewBoxChoices[0] = "Game wasn't complex enough";
                reviewBoxChoices[1] = "Game was too complex";
                break;
            case "Anxiety":
                reviewBoxChoices[0] = "Game wasn't relaxing enough";
                reviewBoxChoices[1] = "Game was too relaxing";
                break;
            case "Planning":
                reviewBoxChoices[0] = "Game didn't require enough thinking";
                reviewBoxChoices[1] = "Game had too much planning involved";
                break;
            case "Cooperation":
                reviewBoxChoices[0] = "Game was too individual";
                reviewBoxChoices[1] = "Game wasn't individual enough";
                break;
            case "Excitement":
                reviewBoxChoices[0] = "Game was too boring";
                reviewBoxChoices[1] = "Game was too exciting";
                break;
            case "Persistence":
                reviewBoxChoices[0] = "Game was too short";
                reviewBoxChoices[1] = "Game was too long";
                break;
            default:
                reviewBoxChoices[0] = "Game was too short";
                reviewBoxChoices[1] = "Game was too long";
                break;

        }
        reviewBox.setItems(FXCollections.observableArrayList(reviewBoxChoices));

    }



    public void calculateRanks()
    {
        //Fuzzy engine stuff

        //Throw values from GUI into GenreEngine
        ArrayList<Rank> list = engine.getGenreList(anxiety, attentionToDetail, patience,
                reactionTime, persistence, excitement, competitiveness, planning, cooperation);

        //test print the rank list
        int counter = 0;
        String topGenre = "";
        for (Rank rank : list) {
            System.out.println(rank.toString());
            if(counter == 0)
            {
                topChoiceLabel.setText("Top Choice: " + rank.getGenre());
                topGenre = rank.getGenre();
            }
            else if(counter == 1)
            {
                secondChoiceLabel.setText("2nd Choice: " + rank.getGenre());
            }
            else if(counter == 2)
            {
                thirdChoiceLabel.setText("3rd Choice: " + rank.getGenre());
            }
            counter++;
        }

        //set recommended game
        String randomGame = pickRandomGameFromGenre(topGenre);
        recommendedGameLabel.setText(randomGame);

    }

    //TODO add learning file stuff here
    @FXML
    public void handleFinalLearningButton()
    {
        String path = genreBox.getValue();
        switch(genreBox.getValue()){
            case "FirstPersonShooter":
                path = Genre.SHOOTER.getFile_name();
                break;
            case "RealTimeStrategy":
                path = Genre.STRATEGYRTS.getFile_name();
                break;
            case "TurnBasedStrategy":
                path = Genre.STRATEGYTURNBASED.getFile_name();
                break;
            case "Simulation":
                path = Genre.SIMULATION.getFile_name();
                break;
            case "Sport":
                path = Genre.SPORTS.getFile_name();
                break;
            case "RoleplayingGame":
                path = Genre.ROLEPLAYING.getFile_name();
                break;
            case "Fighting":
                path = Genre.FIGHTING.getFile_name();
                break;
        }

        String[] loveList, likeList, hateList;
        String[] newloveList, newlikeList, newhateList;

        newloveList=new String[9];
        newlikeList=new String[9];
        newhateList=new String[9];

        loveList = FuzzyFileWriter.getLoveList(path);
        likeList = FuzzyFileWriter.getlikeList(path);
        hateList = FuzzyFileWriter.gethateList(path);

        for(int i=0;i<9;i++){

            newloveList[i]=loveList[i+1];
            newlikeList[i]=likeList[i+1];
            newhateList[i]=hateList[i+1];
        }

       //atribue input order is (1)anxiety,(2)attention to detale, (3)patience, (4)reaction time, (5)persistance, (6)exitment, (7)competitiveness, (8)planning, (9)teamwork
        switch (traitBox.getValue())
        {
            case "Patience":
                if(reviewBox.getValue().equals("Game was too slow")){

                    newloveList[2]=dec(loveList[2+1]);
                    newlikeList[2]=dec(likeList[2+1]);
                    newhateList[2]=inc(hateList[2+1]);
                }else{
                    newloveList[2]=inc(loveList[2+1]);
                    newlikeList[2]=inc(likeList[2+1]);
                    newhateList[2]=dec(hateList[2+1]);
                }

                break;
            case "Reaction Time":

                if(reviewBox.getValue().equals("Game moved too slow")){

                    newloveList[3]=dec(loveList[3+1]);
                    newlikeList[3]=dec(likeList[3+1]);
                    newhateList[3]=inc(hateList[3+1]);
                }else{
                    newloveList[3]=inc(loveList[3+1]);
                    newlikeList[3]=inc(likeList[3+1]);
                    newhateList[3]=dec(hateList[3+1]);
                }
                break;
            case "Competitiveness":

                if(reviewBox.getValue().equals("Game wasn't competitive enough")){

                    newloveList[6]=dec(loveList[6+1]);
                    newlikeList[6]=dec(likeList[6+1]);
                    newhateList[6]=inc(hateList[6+1]);
                }else{
                    newloveList[6]=inc(loveList[6+1]);
                    newlikeList[6]=inc(likeList[6+1]);
                    newhateList[6]=dec(hateList[6+1]);
                }
                break;
            case "Attention To Detail":

                if(reviewBox.getValue().equals("Game wasn't complex enough")){

                    newloveList[1]=dec(loveList[1+1]);
                    newlikeList[1]=dec(likeList[1+1]);
                    newhateList[1]=inc(hateList[1+1]);
                }else{
                    newloveList[1]=inc(loveList[1+1]);
                    newlikeList[1]=inc(likeList[1+1]);
                    newhateList[1]=dec(hateList[1+1]);
                }
                break;
            case "Anxiety":

                if(reviewBox.getValue().equals("Game wasn't relaxing enough")){
                    newloveList[0]=dec(loveList[0+1]);
                    newlikeList[0]=dec(likeList[0+1]);
                    newhateList[0]=inc(hateList[0+1]);

                }else{
                    newloveList[0]=inc(loveList[0+1]);
                    newlikeList[0]=inc(likeList[0+1]);
                    newhateList[0]=dec(hateList[0+1]);
                }
                break;
            case "Planning":
                if(reviewBox.getValue().equals("Game didn't require enough thinking")){

                    newloveList[7]=dec(loveList[7+1]);
                    newlikeList[7]=dec(likeList[7+1]);
                    newhateList[7]=inc(hateList[7+1]);
                }else{
                    newloveList[7]=inc(loveList[7+1]);
                    newlikeList[7]=inc(likeList[7+1]);
                    newhateList[7]=dec(hateList[7+1]);
                }
                break;
            case "Cooperation":

                if(reviewBox.getValue().equals("Game was too individual")){

                    newloveList[8]=dec(loveList[8+1]);
                    newlikeList[8]=dec(likeList[8+1]);
                    newhateList[8]=inc(hateList[8+1]);

                }else{
                    newloveList[8]=inc(loveList[8+1]);
                    newlikeList[8]=inc(likeList[8+1]);
                    newhateList[8]=dec(hateList[8+1]);
                }
                break;
            case "Excitement":

                if(reviewBox.getValue().equals("Game was too boring")){

                    newloveList[5]=dec(loveList[5+1]);
                    newlikeList[5]=dec(likeList[5+1]);
                    newhateList[5]=inc(hateList[5+1]);
                }else{
                    newloveList[5]=inc(loveList[5+1]);
                    newlikeList[5]=inc(likeList[5+1]);
                    newhateList[5]=dec(hateList[5+1]);
                }
                break;
            case "Persistence":

                if(reviewBox.getValue().equals("Game was too short")){
                    newloveList[4]=dec(loveList[4+1]);
                    newlikeList[4]=dec(likeList[4+1]);
                    newhateList[4]=inc(hateList[2+1]);
                }else{
                    newloveList[4]=inc(loveList[4+1]);
                    newlikeList[4]=inc(likeList[4+1]);
                    newhateList[4]=dec(hateList[4+1]);
                }
                break;
            default:

                break;

        }
        FuzzyFileWriter.writeFisFile(path,genreBox.getValue(),newloveList,newlikeList,newhateList);

    }
    private String inc(String thing){
        if(thing.equals("low")){
            return "medium";
        }else if(thing.equals("medium")){
            return "high";
        }else{
            return thing;
        }
    }
    private String dec(String thing){
        if(thing.equals("high")){
            return "medium";
        }else if(thing.equals("medium")){
            return "low";
        }else{
            return thing;
        }
    }

    public String pickRandomGameFromGenre(String topGenre)
    {
        String gameTitle = "";
        Random RNG = new Random();
        int chosenNum = RNG.nextInt(7);

        switch(topGenre)
        {
            case "ROLEPLAYING":
            {
                String[] RPGList = new String[7];
                RPGList[0] = "Dragon Age: Inquisition";
                RPGList[1] = "Dark Souls";
                RPGList[2] = "Pokemon X";
                RPGList[3] = "Elder Scrolls V: Skyrim";
                RPGList[4] = "Legend of Zelda: Ocarina of Time";
                RPGList[5] = "Mass Effect 2";
                RPGList[6] = "Final Fantasy VII";

                gameTitle = RPGList[chosenNum];
            }
            break;

            case "SHOOTER":
            {
                String[] FPSList = new String[7];
                FPSList[0] = "Halo 2";
                FPSList[1] = "Destiny";
                FPSList[2] = "Call of Duty 4";
                FPSList[3] = "Star Wars: Battlefront";
                FPSList[4] = "Titanfall";
                FPSList[5] = "Counterstrike: Global Offensive";
                FPSList[6] = "Metro: Last Light";

                gameTitle = FPSList[chosenNum];
            }
            break;

            case "STRATEGYRTS":
            {
                String[] RTSList = new String[7];
                RTSList[0] = "Starcraft II";
                RTSList[1] = "Command and Conquor: Red Alert 2";
                RTSList[2] = "Age of Empires 2";
                RTSList[3] = "Age of Mythology";
                RTSList[4] = "Star Wars: Empire at War";
                RTSList[5] = "Warcraft III";
                RTSList[6] = "Supreme Commander";

                gameTitle = RTSList[chosenNum];
            }
            break;

            case "STRATEGYTURNBASED":
            {
                String[] TBSList = new String[7];
                TBSList[0] = "Civilization V";
                TBSList[1] = "Galactic Civilization II";
                TBSList[2] = "Advance Wars: Dual Strike";
                TBSList[3] = "Fire Emblem: Awakening";
                TBSList[4] = "Final Fantasy Tactics";
                TBSList[5] = "Crusader Kings II";
                TBSList[6] = "Heroes of Might and Magic V";

                gameTitle = TBSList[chosenNum];
            }
            break;

            case "SIMULATION":
            {
                String[] SimList = new String[7];
                SimList[0] = "Sim City 4";
                SimList[1] = "Euro Truck Simulator 2";
                SimList[2] = "Farm Simulator 2016";
                SimList[3] = "Street Cleaner Simulator";
                SimList[4] = "Microsoft Flight Simulator X";
                SimList[5] = "Ski Region Simulator";
                SimList[6] = "Roller Coaster Tycoon";

                gameTitle = SimList[chosenNum];
            }
            break;

            case "SPORTS":
            {
                String[] SportList = new String[7];
                SportList[0] = "MLB The Show 16";
                SportList[1] = "FIFA 16";
                SportList[2] = "NHL 16";
                SportList[3] = "NBA 2K16";
                SportList[4] = "Forza Motorsport 6";
                SportList[5] = "Madden NFL 16";
                SportList[6] = "Tony Hawk's Pro Skater";

                gameTitle = SportList[chosenNum];
            }
            break;

            case "FIGHTING":
            {
                String[] FightList = new String[7];
                FightList[0] = "Super Smash Bros Melee";
                FightList[1] = "Killer Instinct";
                FightList[2] = "Mortal Combat X";
                FightList[3] = "Street Fighter V";
                FightList[4] = "Divekick";
                FightList[5] = "Soulcalibur V";
                FightList[6] = "Injustice: Gods Among Us";

                gameTitle = FightList[chosenNum];
            }
            break;

            default: break;
        }

        return gameTitle;
    }
}
