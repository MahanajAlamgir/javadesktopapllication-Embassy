package Ramisa_2230651.user8;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class EmbassyOperationsController {

    @FXML
    private ComboBox<?> manageEmbassyOperationsComboboxFxid;

    @FXML
    void initialize(){
         manageEmbassyOperationsComboboxFxid.getItems().addAll("review reports", "implement operational improvement");

     }



}
