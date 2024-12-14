module oop.group45embassyproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens oop.group45embassyproject to javafx.fxml;
    exports oop.group45embassyproject.user1 to javafx.fxml;
    exports Mahanaj_Alamgir_2320688;
    opens Mahanaj_Alamgir_2320688 to javafx.fxml;
}