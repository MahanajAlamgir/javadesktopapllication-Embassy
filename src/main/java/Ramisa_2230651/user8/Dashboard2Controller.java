package Ramisa_2230651.user8;


import com.oop.cse213.embassyproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Dashboard2Controller {

    @FXML
    private AnchorPane anchorpanelFxid;

    @FXML
    private BorderPane borderpaneFxid;

    @FXML
    private Label labelnotiyFxid;

    @FXML
    private VBox vboxFxid;

    @FXML
    void CrisisManagementButtonOnAction(ActionEvent event) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/CrisisManagement.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void DecisionsButtonOnAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Decisions.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }
    }

    @FXML
    void DiplomaticEngDashboardButtonOnAction(ActionEvent event) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Dashboard2.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void DiplomaticEngagementsButtonOnAction(ActionEvent event) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/DiplomaticEngagements.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void DiplomaticRelationsButtonOnAction(ActionEvent event) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/DiplomaticRelations.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void EmbassyOperationsButtonOnAction(ActionEvent event) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/EmbassyOperations.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }


    }

    @FXML
    void MediaRelationsButtonOnAction(ActionEvent event) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/MediaRelations.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void OfficialMeetingsAmButtonOnAction(ActionEvent event) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/OfficialMeetings.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

    @FXML
    void ReportingButtonOnAction(ActionEvent event) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Reporting.fxml"));
            borderpaneFxid.setCenter(fxmlLoader.load());

        }
        catch(Exception e){

        }

    }

}
