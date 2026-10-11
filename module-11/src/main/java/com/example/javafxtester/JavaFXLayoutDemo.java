/*
    Eric Sengvanhpheng
    October 2026
    CSD 402 Module 10

    JavaFX HBox and VBox
 */

package com.example.javafxtester;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/* HBox and VBox Mechanics */
public class JavaFXLayoutDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        // root container: outer VBox with set spacing between vertical items
        VBox mainVBox = new VBox(20);
        mainVBox.setPadding(new Insets(20)); // 20px margin around edges
        mainVBox.setAlignment(Pos.CENTER); // centers inner layout within primary window

        // Title label
        Label titleLabel = new Label("User Login Form");

        // username row HBox
        HBox usernameRow = new HBox(10);
        usernameRow.setAlignment(Pos.CENTER_LEFT);
        Label userLabel = new Label("Username:");
        TextField userField = new TextField();
        usernameRow.getChildren().addAll(userLabel, userField);

        // password row HBox
        HBox passwordRow = new HBox(10);
        passwordRow.setAlignment(Pos.CENTER_LEFT);
        Label passLabel = new Label("Password:");
        TextField passText = new PasswordField();
        passwordRow.getChildren().addAll(passLabel, passText);

        // give labels a fixed width
        userLabel.setPrefWidth(80);
        passLabel.setPrefWidth(80);

        // button row HBox
        HBox buttonRow = new HBox(10);
        buttonRow.setAlignment(Pos.CENTER);
        Button submitButton = new Button("Submit");
        Button cancelButton = new Button("Cancel");
        buttonRow.getChildren().addAll(submitButton, cancelButton);

        // Scene graph hierarchy: child nodes (labels/fields) are added to sub-containers HBox
        // then added into root container mainVBox
        mainVBox.getChildren().addAll(titleLabel, usernameRow, passwordRow, buttonRow);

        // display stage
        Scene scene = new Scene(mainVBox, 400, 300);
        primaryStage.setTitle("JavaFX Layout Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    // main entry point
    public static void main(String[] args) {
        launch(args);
    }
}
