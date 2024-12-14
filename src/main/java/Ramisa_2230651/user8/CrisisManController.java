package Ramisa_2230651.user8;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class CrisisManController {

    @FXML
    private ComboBox<?> ManagingCrisesComboboxFxid;
    @FXML
    void initialize(){
        ManagingCrisesComboboxFxid.getItems().addAll("coordinating responses", "communicating with affected citizens");

    }

}
