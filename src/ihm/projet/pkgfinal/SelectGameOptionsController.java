
package ihm.projet.pkgfinal;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class SelectGameOptionsController implements Initializable {


    // declaring the scene elements.
    @FXML JFXButton selectButton;
    @FXML JFXComboBox<String> dificultyComboBox;
    @FXML JFXTextField playerNameTextFiled;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //set the dificultyCombobox items.
        dificultyComboBox.getItems().addAll("Easy","Hard","Expert");
        dificultyComboBox.getSelectionModel().selectFirst();
    }    
    
    
    public void selectOptions() throws IOException{
        
        // get the selected options and send it to the game scene (GameViewControlleur).
        if (playerNameTextFiled.getText().equals("")) {
            GameViewController.playerName = "Uknown";
        }else{
            GameViewController.playerName = playerNameTextFiled.getText();
        }
        
        GameViewController.dificulty = dificultyComboBox.getSelectionModel().getSelectedItem();
        GameViewController.newGame = true;
        GameViewController.gameLoaded = false;
        IHMProjetFinal.makeView("gameView.fxml");
        GameLuncherController.newPrimaryStage.close();
        
        
    }
}
