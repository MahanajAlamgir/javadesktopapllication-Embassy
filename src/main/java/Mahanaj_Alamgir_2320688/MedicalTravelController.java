package Mahanaj_Alamgir_2320688;

//package oop.group45embassyproject.user1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MedicalTravelController {

    @FXML
    private TableColumn<?, ?> addressTC;

    @FXML
    private TextField addressTF;

    @FXML
    private TableView<?> clientTableView;

    @FXML
    private TableColumn<?, ?> countryNameTC;

    @FXML
    private TextField countryNameTF;

    @FXML
    private TableColumn<?, ?> deatailsTC;

    @FXML
    private TextField detailsTF;

    @FXML
    private TableColumn<?, ?> fullNameTC;

    @FXML
    private TextField fullNameTF;

    @FXML
    private CheckBox mERCheckBox;

    @FXML
    private CheckBox tARCheckBox;

    @FXML
    private CheckBox wACheckBox;

    @FXML
    void confirmOnAction(ActionEvent event) {

    }

}
