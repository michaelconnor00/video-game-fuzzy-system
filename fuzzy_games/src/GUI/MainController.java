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
    private int patience;
    private int reactionTime;
    private int competitiveness;
    private int attentionToDetail;
    private int anxiety;
    private int planning;
    private int cooperation;
    private int excitement;
    private int persistence;


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

    public int getPatience()
    {
        return patience;
    }

    public int getReactionTime()
    {
        return reactionTime;
    }

    public int getCompetitiveness()
    {
        return competitiveness;
    }

    public int getCooperation()
    {
        return cooperation;
    }

    public int getAttentionToDetail()
    {
        return attentionToDetail;
    }

    public int getAnxiety()
    {
        return anxiety;
    }

    public int getPlanning()
    {
        return planning;
    }

    public int getPersistence()
    {
        return persistence;
    }

    public int getExcitement()
    {
        return excitement;
    }

    //controls the save button functionality
    //updates all trait variables
    @FXML
    private void handleSaveButton()
    {
        patience = (int) patienceSlider.getValue();
        reactionTime = (int) reactionTimeSlider.getValue();
        competitiveness = (int) competitivenessSlider.getValue();
        attentionToDetail = (int) attentionToDetailSlider.getValue();
        anxiety = (int) anxietySlider.getValue();
        planning = (int) planningSlider.getValue();
        cooperation = (int) cooperationSlider.getValue();
        excitement = (int) excitementSlider.getValue();
        persistence = (int) persistenceSlider.getValue();
    }



}
