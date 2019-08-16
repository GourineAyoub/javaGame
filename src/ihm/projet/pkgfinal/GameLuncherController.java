
package ihm.projet.pkgfinal;

import com.jfoenix.controls.JFXButton;
import static ihm.projet.pkgfinal.GameViewController.gameLoaded;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class GameLuncherController implements Initializable {
    

    // declare the graphical elements.
    @FXML JFXButton newGameButton;
    @FXML JFXButton loadGameButton;
    @FXML JFXButton scoreBoardButton;
    @FXML JFXButton exitButton;
    @FXML ImageView backgroundImage;
    
    static Stage newPrimaryStage = new Stage();  //elements 
    static AnchorPane newMainPanel; // to create
    static Scene newScene; // the chooseOptions window (new Game).
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // connect to the database.
        DataBaseConnection.connect();
        
    }    
    
    public void newGame() throws IOException{
        
        // reset the values to default.
        GameViewController.newGame = true;
        gameLoaded = false;
        // go to selection deificulty scene .
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("selectGameOptions.fxml"));
        newMainPanel = loader.load();
        newScene = new Scene(newMainPanel);
        newPrimaryStage.setScene(newScene);
        newPrimaryStage.setTitle("Select The Game Options");
        newPrimaryStage.show();
        
    }
    
    public void loadGame() throws IOException{
        
       //show the saved game in the database then lunch the picked one .
       SelectGameInstanceController.pickSavedGame = true;
       // go to selection game scene .
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("selectGameInstance.fxml"));
       newMainPanel = loader.load();
       newScene = new Scene(newMainPanel);
       newPrimaryStage.setScene(newScene);
       newPrimaryStage.setTitle("Select The Game Options");
       newPrimaryStage.show();
                     
    }
    
    public void scoreBoard() throws IOException{
        
        // show all te saved game from the database.
        //show the saved game results (score board) .
        SelectGameInstanceController.pickSavedGame = false;
        // go to selection game scene .
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("selectGameInstance.fxml"));
        newMainPanel = loader.load();
        newScene = new Scene(newMainPanel);
        newPrimaryStage.setScene(newScene);
        newPrimaryStage.setTitle("Games Score Board");
        newPrimaryStage.show();
        
    }
    
    public void exitGame(){
        
        // exit the game.
        Platform.exit();
    }
    
}
