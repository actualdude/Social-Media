/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataBase.OracleConnector;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Pair;
import javax.swing.JOptionPane;
import sem_prace_idas_emerson.Sem_Prace_IDAS_EMERSON;

/**
 *
 * @author Hidden Treasure
 */
public class RadioButtons {

    OracleConnector conn;
    public TextField username;
    PasswordField password;
    public static int user_id;

    public void userLogin() throws IOException {
        // Create the custom dialog.
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Login Dialog");

        ButtonType loginButtonType = new ButtonType("LOGIN", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        username = new TextField();
        username.setPromptText("Username");
        password = new PasswordField();
        password.setPromptText("Password");

        grid.add(new Label("USERNAME :"), 0, 0);
        grid.add(username, 1, 0);
        grid.add(new Label("PASSWORD :"), 0, 1);
        grid.add(password, 1, 1);

        Node loginButton = dialog.getDialogPane().lookupButton(loginButtonType);
        loginButton.setDisable(true);

        username.textProperty().addListener((observable, oldValue, newValue) -> {
            loginButton.setDisable(newValue.trim().isEmpty());
        });

        dialog.getDialogPane().setContent(grid);

// Request focus on the username field by default.
        Platform.runLater(() -> username.requestFocus());

// Convert the result to a username-password-pair when the login button is clicked.
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair<>(username.getText(), password.getText());
            }
            return null;
        });

        Optional<Pair<String, String>> result = dialog.showAndWait();

        if (result.isPresent()) {

            PreparedStatement st;
            ResultSet rs;

            // get the username & password
            String user = username.getText();
            String pass = String.valueOf(password.getText());

            //create a select query to check if the username and the password exist in the database
            String query = "SELECT user_id, username, password FROM USERS WHERE username = ? AND password = ?";

            // show a message if the username or the password fields are empty
            if (user.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter Your Username", "Empty Username", 2);
            } else if (pass.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter Your Password", "Empty Password", 2);
            } else {

                try {
                    st = conn.getConnection().prepareStatement(query);

                    st.setString(1, user);
                    st.setString(2, pass);
                    rs = st.executeQuery();

                    if (rs.next()) {

                        user_id = rs.getInt("user_id");

                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("/GUI/FXMLMedia.fxml"));
                        Parent parent = loader.load();

                        Stage stage = new Stage();
                        stage.initModality(Modality.APPLICATION_MODAL);
                        stage.initOwner(Sem_Prace_IDAS_EMERSON.stage);
                        stage.setTitle("W E L C O M E  -> " + username.getText());

                        Scene scene = new Scene(parent);
                        scene.setRoot(parent);
                        stage.setScene(scene);
                        stage.show();

                    } else {
                        // error message
                        JOptionPane.showMessageDialog(null, "Invalid Username / Password", "Login Error", 2);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(RadioButtons.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

}
