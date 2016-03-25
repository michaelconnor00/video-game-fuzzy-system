package GUI;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Fuzzy Game Genre Picker");
        //primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
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


}
