package Mahanaj_Alamgir_2320688;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

public class CitizenshipServicesController {
@javafx.fxml.FXML
private TextField phoneNumberTextField;
@javafx.fxml.FXML
private RadioButton marriedRadioButton;
@javafx.fxml.FXML
private RadioButton noRB;
@javafx.fxml.FXML
private TextField emailTextField;
@javafx.fxml.FXML
private TextField nidNumberTextField;
@javafx.fxml.FXML
private TableView <Client >citizenshipTableView;
@javafx.fxml.FXML
private TextField passPortNoTextField;
@javafx.fxml.FXML
private RadioButton yesRB;
@javafx.fxml.FXML
private TextField bankTextField;
@javafx.fxml.FXML
private TableColumn<Client,String > passNoTC;
@javafx.fxml.FXML
private CheckBox spanishCheckBox;
@javafx.fxml.FXML
private TextField legalResiTextField;
@javafx.fxml.FXML
private TableColumn <Client,String >communityInvolvTC;
@javafx.fxml.FXML
private TableColumn<Client,String > fullNameTC;
@javafx.fxml.FXML
private CheckBox englishCheckBox;
@javafx.fxml.FXML
private TextField haveKidsTextField;
@javafx.fxml.FXML
private TextField birthCertificateTextField;
@javafx.fxml.FXML
private TextField curAddressTextField;
@javafx.fxml.FXML
private TextField travelRecordsTextField;
@javafx.fxml.FXML
private TextField detailsOfCurVisaTF;
@javafx.fxml.FXML
private RadioButton singleRadioButton;
@javafx.fxml.FXML
private TextField incomeTextField;
@javafx.fxml.FXML
private TextField communityInvolvTextField;
@javafx.fxml.FXML
private TableColumn <Client,String >legalResiTC;
@javafx.fxml.FXML
private CheckBox banglaCheckBox;
@javafx.fxml.FXML
private TextField dobTextField;
@javafx.fxml.FXML
private TextField fullNameTextField;
@javafx.fxml.FXML
private TextField preAddressTextField;
@javafx.fxml.FXML
private RadioButton separatedRadioButton;
@javafx.fxml.FXML
private TableColumn<Client,String > curAddressTC;
@javafx.fxml.FXML
private TextField mothersNameTextField;
@javafx.fxml.FXML
private TextField mothersNationTextField;
@javafx.fxml.FXML
private TextField fathersNationTextField;
@javafx.fxml.FXML
private TextField fathersNameTextField;

ArrayList<Client> clientlist;
ToggleGroup tg;

@javafx.fxml.FXML
public void initialize() {
    tg = new ToggleGroup();
    marriedRadioButton.setToggleGroup(tg);
    separatedRadioButton.setToggleGroup(tg);
    singleRadioButton.setToggleGroup(tg);

}

@javafx.fxml.FXML
public void confirmApplicationOnMouseClicked(ActionEvent actionEvent) {
    String Marital_Status="";
    if(marriedRadioButton.isSelected())
        Marital_Status="Married";
    else if (separatedRadioButton.isSelected())
        Marital_Status="Separated";
    else if (singleRadioButton.isSelected())
        Marital_Status="Single";


    String criminal_records="";
    if(yesRB.isSelected())
        criminal_records="YES";
    else if (noRB.isSelected())
        criminal_records="NO";

    ArrayList<String>languageSet = new ArrayList<String>();
    if(englishCheckBox.isSelected()&& banglaCheckBox.isSelected()&& spanishCheckBox.isSelected()){
        languageSet.add("English");
        languageSet.add("Bangla");
        languageSet.add("Spanish");
    }

    else if (englishCheckBox.isSelected())
        languageSet.add("English");
    else if (banglaCheckBox.isSelected())
        languageSet.add("Bangla");
    else if (spanishCheckBox.isSelected())
        languageSet.add("Spanish");

    Client clientToBeCitizen = new Client(


    );


}
