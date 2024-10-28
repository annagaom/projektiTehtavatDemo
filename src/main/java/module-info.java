module data.projektitehtavatdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens data.projektitehtavatdemo to javafx.fxml;
    exports data.projektitehtavatdemo;
}