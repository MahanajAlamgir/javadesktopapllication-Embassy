package Mahanaj_Alamgir_2320688;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class EmergencyServicesController {

    @FXML
    private TableView<Client> clientTableView;

    @FXML
    private TextField countryTF;

    @FXML
    private TextField currentIssueTF;

    @FXML
    private TextField currentMedicationTF;

    @FXML
    private TextField emailTF;

    @FXML
    private TextField embassyNumberTF;

    @FXML
    private TableColumn<Client,String> emergencyTableColumn;

    @FXML
    private TextField emergencynameTF;

    @FXML
    private TextField emergencyphoneTF;

    @FXML
    private TextField fullNameTF;

    @FXML
    private TableColumn<Client,String> fullNameTableColumn;

    @FXML
    private CheckBox legalCB;

    @FXML
    private TextField locationTF;

    @FXML
    private TableColumn<Client,String> locationTableColumn;

    @FXML
    private DatePicker lossDateDP;

    @FXML
    private CheckBox lossPassportCheckBox;

    @FXML
    private CheckBox medicalEmergencyCB;

    @FXML
    private TextField natureOfIssueTF;

    @FXML
    private CheckBox otherCB;

    @FXML
    private TextField passportNumberTF;

    @FXML
    private TextField phoneNumberTF;

    @FXML
    private TableColumn<Client,String> phoneNumberTableColumn;

    @FXML
    private TextField relationshipTF;

    ArrayList<Client> clientlist;
    @FXML
    void confirmOnAction(ActionEvent event) {

        ArrayList<String>EmergencyTypeSet  = new ArrayList<String>();
        if(lossPassportCheckBox.isSelected()&& medicalEmergencyCB.isSelected()&& legalCB.isSelected()&& otherCB.isSelected()){
            EmergencyTypeSet.add(" Lost Passport");
            EmergencyTypeSet.add("Medical Emergency");
            EmergencyTypeSet.add("Legal Assistance");
            EmergencyTypeSet.add("Other");
        }

        else if (lossPassportCheckBox.isSelected())
            EmergencyTypeSet.add("Lost Passport");
        else if (medicalEmergencyCB.isSelected())
            EmergencyTypeSet.add("Medical Emergency");
        else if (legalCB.isSelected())
            EmergencyTypeSet.add("Legal Assistance");
        else if (otherCB.isSelected())
            EmergencyTypeSet.add("Other");



    }

}
