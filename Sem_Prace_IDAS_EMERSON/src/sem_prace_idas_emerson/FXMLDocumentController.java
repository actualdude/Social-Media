/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem_prace_idas_emerson;

import DataBase.DataBaseHelper;
import GUI.RadioButtons;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Hidden Treasure
 *
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button buttonLogin;
    @FXML
    private TextField usernameText;
    @FXML
    private TextField passwordText;

    public DataBaseHelper dh;
    RadioButtons window = new RadioButtons();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        usernameText.setText("ST52501");
        passwordText.setText("076694350Ejf");
    }

    @FXML
    private void methodLogin(ActionEvent event) throws IOException, SQLException {

        boolean log;

        String name = "ST52501";
        String psw = "076694350Ejf";
        log = login(name, psw);

        if (log == true) {
            if (dh.login(usernameText.getText(), passwordText.getText()) == true) {
                window.userLogin();
            } else {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setContentText("Error showing Interface");
                alert.showAndWait();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("There was a problem with database connection");
            alert.showAndWait();

        }
    }

    public boolean login(String login, String psw) {
        try {
            dh = new DataBaseHelper(login, psw);
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Sem_Prace_IDAS_EMERSON.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void closeLogin() {
        Stage stage = new Stage();
        stage.close();
    }

}
