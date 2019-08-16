
package ihm.projet.pkgfinal;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.util.Callback;


public class SelectGameInstanceController implements Initializable {
  
    // declare the scene graphic elements.
    @FXML JFXButton selectGameButton;
    @FXML JFXTreeTableView<gameInstance> savedGamesTable;
    
    // list containes all the saved games.
    static ObservableList<gameInstance> savedGamesList = null;
    static int choosedSavedGameCounter = 0;
    // boolean that indcates if it's just a scoreBoard show or it's for picking a saved game.
    static boolean pickSavedGame = true;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // creat the table columns and add it to the treeTabelView.
        JFXTreeTableColumn<gameInstance,String> gameID = new JFXTreeTableColumn<>("gameID");
        gameID.setPrefWidth(140);
        gameID.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<gameInstance, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<gameInstance, String> param) {
                return param.getValue().getValue().gameID;
            }
        });
        
        JFXTreeTableColumn<gameInstance,String> gameDate = new JFXTreeTableColumn<>("gameDate");
        gameDate.setPrefWidth(140);
        gameDate.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<gameInstance, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<gameInstance, String> param) {
                return param.getValue().getValue().gameDate;
            }
        });
        
        JFXTreeTableColumn<gameInstance,String> gameScore = new JFXTreeTableColumn<>("gameScore");
        gameScore.setPrefWidth(140);
        gameScore.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<gameInstance, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<gameInstance, String> param) {
                return param.getValue().getValue().gameScore;
            }
        });
        
        JFXTreeTableColumn<gameInstance,String> gamePlayer = new JFXTreeTableColumn<>("gamePlayer");
        gamePlayer.setPrefWidth(140);
        gamePlayer.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<gameInstance, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<gameInstance, String> param) {
                return param.getValue().getValue().gamePlayer;
            }
        });
        
        // get the informations from the database using the methode getSavedGames().
        try {
            if (pickSavedGame == true) {
               savedGamesList = DataBaseConnection.getSavedGames(); 
            }else{
                // case whene it's just a scoreBoard show.
                savedGamesList = DataBaseConnection.getGamesResult();
                selectGameButton.setDisable(true); // disable the select button.
            }
            
        } catch (Exception ex) {
            Logger.getLogger(SelectGameInstanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        final TreeItem<gameInstance> treeTableViewitems = 
                new RecursiveTreeItem<gameInstance>(savedGamesList,RecursiveTreeObject::getChildren);
        savedGamesTable.getColumns().addAll(gameID,gamePlayer,gameScore,gameDate);
        savedGamesTable.setRoot(treeTableViewitems);
        savedGamesTable.setShowRoot(false);
        
       
        savedGamesTable.setOnMouseClicked((event) -> {
            
            // set the id of the saved game.
            int i = savedGamesTable.getSelectionModel().getSelectedIndex();
            GameViewController.loadedGameID =  savedGamesList.get(i).gameID.getValue();
            
            choosedSavedGameCounter++;
        });
        
        
    }
    
    public void selectSavedGame() throws IOException, SQLException{
        
        //check if the user picked some game or not.
        if (choosedSavedGameCounter > 0) {
            // reinitilize the important variables.
        GameViewController.newGame = false;
        GameViewController.gameLoaded = false;
        //load the game informations from the database.
        DataBaseConnection.loadGame();
        //refrech the scene.
        IHMProjetFinal.makeView("gameView.fxml");
        }
        
    }

  
}
