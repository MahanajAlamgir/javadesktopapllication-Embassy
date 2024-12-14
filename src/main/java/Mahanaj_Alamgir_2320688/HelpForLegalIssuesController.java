package Mahanaj_Alamgir_2320688;

//package oop.group45embassyproject.user1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelpForLegalIssuesController {

    @FXML
    private TableColumn<Client,String> caseNatureTC;

    @FXML
    private TextField caseNatureTF;

    @FXML
    private DatePicker dateDP;

    @FXML
    private TableColumn<Client,String> dateTC;

    @FXML
    private TextField emailTF;

    @FXML
    private TableColumn<Client,String> fullNameTC;

    @FXML
    private TextField fullNameTF;

    @FXML
    private TableView<Client> helpviewTableView;

    @FXML
    private RadioButton inPersonRB;

    @FXML
    private TextField locatioTF;

    @FXML
    private TableColumn<Client,String> locationTC;

    @FXML
    private RadioButton onlineRB;

    @FXML
    private TextField passPortNoTF;

    @FXML
    private TableColumn<Client,String> passportNoTC;

    @FXML
    private TextField phoneNumberTF;

    @FXML
    private TextField previousAttemptsTF;

    @FXML
    private TextField questionTF;

    @FXML
    private TextField urgencyTF;

    @FXML
    void confirmOnAction(ActionEvent event) {

    }

}
