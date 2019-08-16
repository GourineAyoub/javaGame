
package ihm.projet.pkgfinal;

import com.jfoenix.controls.JFXButton;
import static ihm.projet.pkgfinal.GameViewController.gameLoaded;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import static ihm.projet.pkgfinal.GameViewController.newMainPanel;
import static ihm.projet.pkgfinal.GameViewController.newScene;
import static ihm.projet.pkgfinal.GameViewController.newPrimaryStage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;


public class GameWinViewController implements Initializable {


    
    
    // declare scene graphic elements.
    @FXML JFXButton saveGame;
    @FXML JFXButton newGame;
    @FXML JFXButton loadGame;
    @FXML Label gameStateSentence;
    @FXML Label gameScore;
    @FXML Label gameTotalTime;
    @FXML Label gameRank;
    @FXML Label gameStars; 
    @FXML Rectangle background1;
    @FXML Ellipse background2;
    @FXML ImageView backgroungIcon;
    
    // game end  statics info.
    static int gameEndScore;
    static String gameEndTotalTime;
    static int gameEndStars;
    static String gameEndRank;
    
    
    static boolean gameState = true; // true for win or false for loose.
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    
        
        // intilize the scene (loose or win ).
        // change the string you win or you loose.
        if (gameState == true) {
            gameStateSentence.setText("You Win !");
        }else{
            gameStateSentence.setText("You Loos ...");
            // disable the button save in case of loose.
            saveGame.setDisable(true);
            // change the color red for loose and blue for win.
            background1.setFill(Paint.valueOf("#c62828"));
            background2.setFill(Paint.valueOf("#c62828"));
            // set the backgroun icon.
            Image image = new Image(GameWinViewController.class.getResourceAsStream("gameOver.png"));
            backgroungIcon.setImage(image);
            
            String newStyle = "-fx-background-color: #c62828;"
                    + "-fx-border-color:  #c62828;"
                    + "-fx-border-width: 0.5px;"
                    + "-fx-background-radius: 100%;"
                    + "-fx-border-radius: 100%;";
            saveGame.setStyle(newStyle);
            newGame.setStyle(newStyle);
            loadGame.setStyle(newStyle);
        }
        // intilize the game end info.
        gameScore.setText(String.valueOf(gameEndScore));
        gameRank.setText(String.valueOf(gameEndRank));
        gameTotalTime.setText(String.valueOf(gameEndTotalTime));
        gameStars.setText(String.valueOf(gameEndStars));
         
    }  
    
    
    public void loadGame() throws IOException{
        
        // go to selection game scene .
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("selectGameInstance.fxml"));
                newMainPanel = loader.load();
                newScene = new Scene(newMainPanel);
                newPrimaryStage.setScene(newScene);
                newPrimaryStage.setTitle("Select The Game Options");
                newPrimaryStage.show();
    }
    
    public void saveGame() throws SQLException{
        
        // save the game result in the score board table.
        DataBaseConnection.saveGameResult();
        
    }
     
    public void newGame() throws IOException{
        
        // lunch a new game and give the player the chnace to change the game options.
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
    
}
