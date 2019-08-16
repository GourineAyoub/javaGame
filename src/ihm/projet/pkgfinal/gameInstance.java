package ihm.projet.pkgfinal;


import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class gameInstance extends RecursiveTreeObject<gameInstance> {
    
    
    StringProperty gameID;
    StringProperty gameDate;
    StringProperty gameScore;
    StringProperty gamePlayer;
    
    public gameInstance(String gameID,String gameDate,String gameScore,String gamePlayer){
        
        this.gameID = new SimpleStringProperty(gameID);
        this.gameDate = new SimpleStringProperty(gameDate);
        this.gameScore = new SimpleStringProperty(gameScore);
        this.gamePlayer = new SimpleStringProperty(gamePlayer);
    }
    
}
