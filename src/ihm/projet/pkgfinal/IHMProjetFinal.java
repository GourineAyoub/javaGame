
package ihm.projet.pkgfinal;

import java.awt.Panel;
import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class IHMProjetFinal extends Application {
    
    public static Stage primaryStage;
    public static AnchorPane mainPanel;
    public static Scene scene;
    
    @Override
    public void start(Stage stage) throws Exception {
       
        primaryStage = stage;
        primaryStage.setOnHidden(e -> Platform.exit());
        makeView("GameLuncher.fxml");
    }

         
    public static void makeView(String viewUrl) throws IOException{
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(IHMProjetFinal.class.getResource(viewUrl));
        mainPanel = loader.load();
        scene = new Scene(mainPanel);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bombs And Numbers");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
