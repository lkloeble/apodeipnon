package org.orthodoxmusic.apodeipnon;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloWorldApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Apodeipnon mise à jour réussie");
        label.setAlignment(Pos.CENTER);
        primaryStage.setScene(new Scene(label, 300, 250));
        primaryStage.setTitle("Apodeipnon Application");
        primaryStage.show();
    }
}
