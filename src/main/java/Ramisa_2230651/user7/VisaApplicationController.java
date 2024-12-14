package Ramisa_2230651.user7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class VisaApplications {

    @FXML
    private TableColumn<?, ?> visaApplicationEmailTableViewFxid;

    @FXML
    private TableColumn<?, ?> visaApplicationIdTableViewFxid;

    @FXML
    private TableColumn<?, ?> visaApplicationNameTableViewFxid;

    @FXML
    private TableView<?> visaApplicationTableViewFxid;

    @FXML
    private TableColumn<?, ?> visaApplicationVisaTypeTableViewFxid;

    @FXML
    void SelectOnAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ApproveOrDenyController.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage refToCurrentStage = (Stage)((Node)ActionEvent.getSource()).getScene().getWindow();
            refToCurrentStage.setTitle("ApproveOrDeny");
            refToCurrentStage.setScene(nextScene);
            refToCurrentStage.show();

        }
        catch(IOException e){

        }


    }



@FXML
    void initialize() {
        VisaApplicationList = new ArrayList<>();




    }

}
