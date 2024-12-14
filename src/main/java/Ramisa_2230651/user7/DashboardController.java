package Ramisa_2230651.user7;

import com.oop.cse213.embassyproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class DashboardController {

    @FXML
    private AnchorPane anchorpanelFxid;

    @FXML
    private BorderPane borderpaneFxid;

    @FXML
    private Label labelnotiyFxid;

    @FXML
    private VBox vboxFxid;

    @FXML
    void CulturalButtonOnAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/culturalExchange.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void DashboardButtonOnAction(ActionEvent event) {

    }

    @FXML
    void EmergencyAssistanceButtonOnAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/EmergencyAssistance.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void GovernmentLiaisonButtonOnAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/GovernmentLiaison.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void LegalDocsButtonOnAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/LegalDocumentation.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void OfficialMeetingsButtonOnAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/OfficialMeetings.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void VisaInterviewsButtonOnAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/VisaInterviews.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void tradeInitiativesButtonOnAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/TradeInitiatives.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void visaApplicationsButtonOnAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/VisaApplications.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

}
