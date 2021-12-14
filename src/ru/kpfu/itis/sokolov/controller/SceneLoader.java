package ru.kpfu.itis.sokolov.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import ru.kpfu.itis.sokolov.model.Player;

import java.io.IOException;

public class SceneLoader {

    public static void showWaitingController(Stage primaryStage, int PORT) throws IOException {
        FXMLLoader loader = new FXMLLoader(SceneLoader.class.getResource("../view/waiting.fxml"));
        Parent root = loader.load();

        WaitingController waitingController = (WaitingController) loader.getController();
        waitingController.init(primaryStage, PORT);

        primaryStage.setTitle("ATARI PONG");
        primaryStage.getScene().setRoot(root);
        primaryStage.show();
    }
}