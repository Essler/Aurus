package Aurus;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        // Set up Grid Pane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(gridPane, 400, 200);
        //gridPane.setGridLinesVisible(true); // For visual debugging.

        primaryStage.setTitle("Hello World");
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);

        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("DC");
        //gridPane.add(di);

        // Set up Controls
        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridPane.add(sceneTitle, 0, 0, 2, 1);

        // -- Username
        Label userName = new Label("User Name:");
        gridPane.add(userName, 0, 1);

        TextField userTextField = new TextField();
        gridPane.add(userTextField, 1, 1);

        // -- Password
        Label password = new Label("Password:");
        gridPane.add(password, 0, 2);

        PasswordField passwordField = new PasswordField();
        gridPane.add(passwordField, 1, 2);

        // Signin Text
        final Text signinTextField = new Text();
        gridPane.add(signinTextField,2,4);

        // Hello button
        Button helloButton = new Button("Say 'Hello World'");
        helloButton.setOnAction(event -> System.out.println("Hello World!"));
        gridPane.add(helloButton, 0, 3);

        // Signin Button
        Button signinButton = new Button("Sign In");
        signinButton.setOnAction(event -> {signinTextField.setFill(Color.FIREBRICK); signinTextField.setText("Sign in button pressed");});
        HBox signingHBox = new HBox(10);
        signingHBox.setAlignment(Pos.BOTTOM_RIGHT);
        signingHBox.getChildren().add(signinButton);
        gridPane.add(signingHBox, 2, 3);


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
