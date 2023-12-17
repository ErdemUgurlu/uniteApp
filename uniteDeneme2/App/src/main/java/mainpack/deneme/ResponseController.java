package mainpack.deneme;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.scene.Parent;

public class ResponseController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button backButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    public void onBackButtonClick() {
        try {
            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/forumview.fxml"));
            primaryStage.setTitle("Forum");
            primaryStage.setScene(new Scene(root,900,600));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception
        }
    }
}