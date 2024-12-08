import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    public void login() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("uus") && password.equals("passwd")) {
            try {
                Stage stage = (Stage) usernameField.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("InventoryController.fxml"));
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Gagal");
            alert.setHeaderText("Invalid Credentials");
            alert.setContentText("Username or password is incorrect.");
            alert.showAndWait();
        }
    }
}