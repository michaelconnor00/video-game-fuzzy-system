package GUI;

import fuzzysys.BehaviouralTraits;
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
    private ChoiceBox genreBox;
    @FXML
    private ChoiceBox traitBox;
    @FXML
    private ChoiceBox reviewBox;

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

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Fuzzy Game Genre Picker");

        primaryStage.show();

        showInputWindow();
        setupChoiceBoxes();
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


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setupChoiceBoxes()
    {
        genreBox.setItems(FXCollections.observableArrayList("RPG", "FPS", "RTS", "TBS", "SIM", "SPORT", "FIGHT"));
        traitBox.setItems(FXCollections.observableArrayList("Anxiety", "AttentionToDetail", "Patience",
                "ReactionTime", "Persistence", "Excitement", "Competitiveness", "Planning", "Cooperation"));
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
    @FXML
    private void handleSaveButton() {
        patience = patienceSlider.getValue();
        reactionTime = reactionTimeSlider.getValue();
        competitiveness = competitivenessSlider.getValue();
        attentionToDetail = attentionToDetailSlider.getValue();
        anxiety = anxietySlider.getValue();
        planning = planningSlider.getValue();
        cooperation = cooperationSlider.getValue();
        excitement = excitementSlider.getValue();
        persistence = persistenceSlider.getValue();
    }

    @FXML
    private void updateReviewBox()
    {
        //find selected trait
        String selectedTrait = traitBox.getValue().toString();

        String[] reviewBoxChoices = new String[2];
        switch (selectedTrait)
        {
            case "Patience":
                reviewBoxChoices[0] = "Game was too slow";
                reviewBoxChoices[1] = "Game was too fast";
                break;
            case "ReactionTime":
                reviewBoxChoices[0] = "Game was too slow";
                reviewBoxChoices[1] = "Game was too fast";
                break;
            case "Competitiveness":
                reviewBoxChoices[0] = "Game wasn't competitive enough";
                reviewBoxChoices[1] = "Game was too competitive";
                break;
            case "AttentionToDetail":
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
            default: break;

        }
        reviewBox.setItems(FXCollections.observableArrayList(reviewBoxChoices));
    }

}
