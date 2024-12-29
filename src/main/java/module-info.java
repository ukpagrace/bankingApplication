module org.example.bankingapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens org.example.bankingapplication to javafx.fxml;

//    opens model to java.base;
    exports org.example.bankingapplication;
    exports org.example.bankingapplication.Controllers;
    exports org.example.bankingapplication.Controllers.Admin;
    exports org.example.bankingapplication.Controllers.Client;
    exports org.example.bankingapplication.Models;
    exports org.example.bankingapplication.Views;
}