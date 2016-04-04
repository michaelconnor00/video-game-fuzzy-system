package GUI;

import fuzzysys.BehaviouralTraits;
import fuzzysys.GenreEngine;
import fuzzysys.Rank;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

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
                reviewBoxChoices[0] = "Game was too slow";
                reviewBoxChoices[1] = "Game was too fast";
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
        System.out.println(anxiety);
        System.out.println(attentionToDetail);
        System.out.println(patience);
        System.out.println(reactionTime);
        System.out.println(persistence);
        System.out.println(excitement);

        //Fuzzy engine stuff

        //Throw values from GUI into GenreEngine
        ArrayList<Rank> list = engine.getGenreList(anxiety, attentionToDetail, patience,
                reactionTime, persistence, excitement, competitiveness, planning, cooperation);

        //test print the rank list
        for (Rank rank : list) {
            System.out.println(rank.toString());
        }
    }
}
