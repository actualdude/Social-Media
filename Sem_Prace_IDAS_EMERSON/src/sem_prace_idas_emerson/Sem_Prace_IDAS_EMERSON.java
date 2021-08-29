/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem_prace_idas_emerson;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Hidden Treasure
 */
public class Sem_Prace_IDAS_EMERSON extends Application {
    
    public static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {

            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

            Scene scene = new Scene(root);

            stage.setScene(scene);
            Sem_Prace_IDAS_EMERSON.stage = stage;
            stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  launch(args);

    }

}
