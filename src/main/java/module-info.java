module aydin.firebasedemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires firebase.admin;
    requires com.google.auth;
    requires com.google.auth.oauth2;
    requires google.cloud.firestore;
    requires google.cloud.core;
    requires com.google.api.apicommon;


    opens aydin.firebasedemo to javafx.fxml;
    exports aydin.firebasedemo;
    exports aydin.firebasedemo.Model;
    opens aydin.firebasedemo.Model to javafx.fxml;
    exports aydin.firebasedemo.ViewModel;
    opens aydin.firebasedemo.ViewModel to javafx.fxml;

}
