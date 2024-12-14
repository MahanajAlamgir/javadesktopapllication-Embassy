package Ramisa_2230651.user7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class VisaInterviewController {

    @FXML
    private TableColumn<?, ?> TimeTableViewFxid;

    @FXML
    private TableColumn<?, ?> interviewDateTableViewFxid;
    @FXML
    private TableColumn<?, ?> resultTableViewFxid1;

    String Result = "";
                if(DenyRadioFxid1.isSelected())
    Result  = "Denied";
                else if (approveRadioFxid.isSelected())
    Result = "Approved";

    @FXML
    private TableColumn<?, ?> visaInterviewEmailTableViewFxid;

    @FXML
    private TableColumn<?, ?> visaInterviewIdTableViewFxid;

    @FXML
    private TableColumn<?, ?> visaInterviewNameTableViewFxid;

    @FXML
    private TableView<?> visaInterviewTableViewFxid;

    @FXML
    private TableColumn<?, ?> visaInterviewVisaTypeTableViewFxid;
    ArrayList<ApproveOrDeny> ApproveOrDenyList;
    ToggleGroup tg;

    @FXML
    void sendApprovalEmailOnAction(ActionEvent event) {

    }
    @FXML
    void showOnlyApprovedOnAction(ActionEvent event) {
        visaInterviewTableViewFxid.getItems().clear();
        for(ApproveOrDeny s:ApproveOrDenyList){
            if (s.getApproveOrDeny().equals("Approve")){
                visaInterviewTableViewFxid.getItems().add(s);

            }
        }




    }
    @FXML
    void void initialize(){
        ApproveOrDenyList = new ArrayList<>();
        idTextFieldFxid.setEditable(false);
        tg = new ToggleGroup();
        DenyRadioFxid1.setToggleGroup(tg);
        approveRadioFxid.setToggleGroup(tg);

        interviewDateDatePicker.setValue(LocalDate.now());
        visaTypeComboBoxFxid.getItems().addAll("Student Visa", "Medical Visa", "Tourist Visa","Business Visa");

        visaInterviewIdTableViewFxid.setCellValueFactory(new PropertyValueFactory<ApproveOrDeny, int>("id"));
        visaInterviewNameTableViewFxid.setCellValueFactory(new PropertyValueFactory<ApproveOrDeny, String>("name"));
        visaInterviewEmailTableViewFxid.setCellValueFactory(new PropertyValueFactory<ApproveOrDeny, String>("email"));
        visaInterviewVisaTypeTableViewFxid.setCellValueFactory(new PropertyValueFactory<ApproveOrDeny, String>("visaType"));
        resultTableViewFxid1.setCellValueFactory(new PropertyValueFactory<ApproveOrDeny, String>("result"));
        interviewDateTableViewFxid.setCellValueFactory(new PropertyValueFactory<ApproveOrDeny, LocalDate>("interviewDate"));
        TimeTableViewFxid.setCellValueFactory(new PropertyValueFactory<ApproveOrDeny, float>("time"));


    }


}

