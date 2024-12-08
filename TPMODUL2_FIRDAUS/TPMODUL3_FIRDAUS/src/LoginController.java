import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    public void login() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("admin") && password.equals("admin")) {
            // Jika login berhasil, buka halaman Inventory
            App.setRoot("inventory");
        } else {
            // Tampilkan error alert
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText("Autentikasi Gagal");
            alert.setContentText("Username atau password salah.");
            alert.showAndWait();
        }
    }
}
