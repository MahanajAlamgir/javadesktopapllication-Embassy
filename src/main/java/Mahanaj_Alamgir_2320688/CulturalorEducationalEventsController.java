package Mahanaj_Alamgir_2320688;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CulturalorEducationalEventsController {

    @FXML
    private TextField PhoneNumTF;

    @FXML
    private TextField accessibilityNeedsTF;

    @FXML
    private TextField companionsTF;

    @FXML
    private TableColumn<Client, String> dateTC;

    @FXML
    private TableColumn<Client, String> detailsTC;

    @FXML
    private TextField dietaryPreferencesTF;

    @FXML
    private TextField emailTF;

    @FXML
    private TextField evenDetailsTF;

    @FXML
    private TextField evenTimeTF;

    @FXML
    private DatePicker eventDateDP;

    @FXML
    private TableView<Client> eventdetailsTableView;

    @FXML
    private TableColumn<Client, String> fullNameTC;

    @FXML
    private TextField fullNameTF;

    @FXML
    private TextField pOATF;

    @FXML
    private TextField passportNoTF;

    @FXML
    private TableColumn<Client, String> timeTC;

    @FXML
    void confirmOnAction(ActionEvent event) {

    }

}
