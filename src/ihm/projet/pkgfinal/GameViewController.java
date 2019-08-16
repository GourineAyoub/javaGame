
package ihm.projet.pkgfinal;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXNodesList;
import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import static ihm.projet.pkgfinal.IHMProjetFinal.mainPanel;
import static ihm.projet.pkgfinal.IHMProjetFinal.primaryStage;
import static ihm.projet.pkgfinal.IHMProjetFinal.scene;
import static ihm.projet.pkgfinal.gameButton.buttonsList;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;



public class GameViewController implements Initializable {

    //connecting the graphic compenents to the controlleur.
    //first the buttons.
    @FXML private JFXButton bt01;
    @FXML private JFXButton bt02;
    @FXML private JFXButton bt03;
    @FXML private JFXButton bt126;
    @FXML private JFXButton bt1112;
    @FXML private JFXButton bt12;
    @FXML private JFXButton bt20;
    @FXML private JFXButton bt1211;
    @FXML private JFXButton bt22;
    @FXML private JFXButton bt13;
    @FXML private JFXButton bt23;
    @FXML private JFXButton bt30;
    @FXML private JFXButton bt31;
    @FXML private JFXButton bt32;
    @FXML private JFXButton bt33;
    @FXML private JFXButton bt04;
    @FXML private JFXButton bt14;
    @FXML private JFXButton bt24;
    @FXML private JFXButton bt34;
    @FXML private JFXButton bt40;
    @FXML private JFXButton bt41;
    @FXML private JFXButton bt42;
    @FXML private JFXButton bt43;
    @FXML private JFXButton bt44;
    @FXML private JFXButton bt45;
    @FXML private JFXButton bt46;
    @FXML private JFXButton bt47;
    @FXML private JFXButton bt48;
    @FXML private JFXButton bt35;
    @FXML private JFXButton bt25;
    @FXML private JFXButton bt15;
    @FXML private JFXButton bt05;
    @FXML private JFXButton bt06;
    @FXML private JFXButton bt16;
    @FXML private JFXButton bt26;
    @FXML private JFXButton bt36;
    @FXML private JFXButton bt17;
    @FXML private JFXButton bt18;
    @FXML private JFXButton bt07;
    @FXML private JFXButton bt08;
    @FXML private JFXButton bt09;
    @FXML private JFXButton bt010;
    @FXML private JFXButton bt011;
    @FXML private JFXButton bt012;
    @FXML private JFXButton bt19;
    @FXML private JFXButton bt110;
    @FXML private JFXButton bt11000;
    @FXML private JFXButton bt210;
    @FXML private JFXButton bt27;
    @FXML private JFXButton bt28;
    @FXML private JFXButton bt38;
    @FXML private JFXButton bt37;
    @FXML private JFXButton bt50;
    @FXML private JFXButton bt60;
    @FXML private JFXButton bt61;
    @FXML private JFXButton bt51;
    @FXML private JFXButton bt62;
    @FXML private JFXButton bt71;
    @FXML private JFXButton bt80;
    @FXML private JFXButton bt90;
    @FXML private JFXButton bt100;
    @FXML private JFXButton bt120;
    @FXML private JFXButton bt29;
    @FXML private JFXButton bt111;
    @FXML private JFXButton bt11111;
    @FXML private JFXButton bt39;
    @FXML private JFXButton bt49;
    @FXML private JFXButton bt54;
    @FXML private JFXButton bt52;
    @FXML private JFXButton bt53;
    @FXML private JFXButton bt112;
    @FXML private JFXButton bt11222;
    @FXML private JFXButton bt55;
    @FXML private JFXButton bt67;
    @FXML private JFXButton bt68;
    @FXML private JFXButton bt212;
    @FXML private JFXButton bt411;
    @FXML private JFXButton bt510;
    @FXML private JFXButton bt58;
    @FXML private JFXButton bt66;
    @FXML private JFXButton bt65;
    @FXML private JFXButton bt75;
    @FXML private JFXButton bt85;
    @FXML private JFXButton bt86;
    @FXML private JFXButton bt76;
    @FXML private JFXButton bt70;
    @FXML private JFXButton bt73;
    @FXML private JFXButton bt64;
    @FXML private JFXButton bt87;
    @FXML private JFXButton bt88;
    @FXML private JFXButton bt312;
    @FXML private JFXButton bt410;
    @FXML private JFXButton bt79;
    @FXML private JFXButton bt77;
    @FXML private JFXButton bt96;
    @FXML private JFXButton bt106;
    @FXML private JFXButton bt108;
    @FXML private JFXButton bt109;
    @FXML private JFXButton bt1010;
    @FXML private JFXButton bt1011;
    @FXML private JFXButton bt114;
    @FXML private JFXButton bt104;
    @FXML private JFXButton bt103;
    @FXML private JFXButton bt102;
    @FXML private JFXButton bt91;
    @FXML private JFXButton bt105;
    @FXML private JFXButton bt710;
    @FXML private JFXButton bt611;
    @FXML private JFXButton bt512;
    @FXML private JFXButton bt712;
    @FXML private JFXButton bt89;
    @FXML private JFXButton bt94;
    @FXML private JFXButton bt84;
    @FXML private JFXButton bt311;
    @FXML private JFXButton bt211;
    @FXML private JFXButton bt310;
    @FXML private JFXButton bt57;
    @FXML private JFXButton bt117;
    @FXML private JFXButton bt97;
    @FXML private JFXButton bt910;
    @FXML private JFXButton bt911;
    @FXML private JFXButton bt1111;
    @FXML private JFXButton bt1110;
    @FXML private JFXButton bt119;
    @FXML private JFXButton bt118;
    @FXML private JFXButton bt116;
    @FXML private JFXButton bt115;
    @FXML private JFXButton bt69;
    @FXML private JFXButton bt83;
    @FXML private JFXButton bt810;
    @FXML private JFXButton bt811;
    @FXML private JFXButton bt912;
    @FXML private JFXButton bt92;
    @FXML private JFXButton bt113;
    @FXML private JFXButton bt128;
    @FXML private JFXButton bt123;
    @FXML private JFXButton bt82;
    @FXML private JFXButton bt72;
    @FXML private JFXButton bt63;
    @FXML private JFXButton bt59;
    @FXML private JFXButton bt56;
    @FXML private JFXButton bt412;
    @FXML private JFXButton bt511;
    @FXML private JFXButton bt610;
    @FXML private JFXButton bt711;
    @FXML private JFXButton bt98;
    @FXML private JFXButton bt1212;
    @FXML private JFXButton bt1012;
    @FXML private JFXButton bt11;
    @FXML private JFXButton bt125;
    @FXML private JFXButton bt121;
    @FXML private JFXButton bt81;
    @FXML private JFXButton bt129;
    @FXML private JFXButton bt1210;
    @FXML private JFXButton bt74;
    @FXML private JFXButton bt124;
    @FXML private JFXButton bt122;
    @FXML private JFXButton bt127;
    @FXML private JFXButton bt21;
    @FXML private JFXButton bt95;
    @FXML private JFXButton bt00;
    @FXML private JFXButton bt10;
    @FXML private JFXButton bt78;
    @FXML private JFXButton bt93;
    @FXML private JFXButton bt107;
    @FXML private JFXButton bt812;
    @FXML private JFXButton bt99;
    @FXML private JFXButton bt101;
    @FXML private JFXButton bt612;
  
    //the rest of the elements.
    @FXML Pane questionPane;
    @FXML Text timerLabel;
    @FXML JFXButton checkAnswerButton;
    @FXML JFXTextField number1;
    @FXML JFXTextField number2;
    @FXML JFXTextField number3;
    @FXML JFXTextField number4;
    @FXML Label opt1;
    @FXML Label opt2;
    @FXML Label opt3;
    @FXML Label equationResultLabel;
    @FXML Label scoreLabel;
    @FXML Label difficultyLabel;
    @FXML Text totalTimeLabel;
    @FXML Label clickedSquaresLabel;
    @FXML Label nonClickedSquaresLabel;
    @FXML JFXProgressBar starProgressBar;
    @FXML Label starNumberLabel;
    @FXML JFXNodesList floatingButtonsList;
    @FXML Pane gameDetailsPane;
    @FXML ImageView bombImage;
    @FXML ImageView rank1ImageView;
    @FXML ImageView rank2ImageView;
    @FXML ImageView rank3ImageView;
    
    
    

    //programme variabels.
    Thread decrementer,gameLoosThread;
    int timer = 30;
    double result;
    static int score = 0;
    static int starsNumber = 0;
    int starsProgress = 0;
    String rank;
    static String dificulty = "Hard";
    static int clickedSquares = 0;
    static int nonClickedSquares = 169;
    int minesNumber;
    int correctResult;
    boolean inQuestion = false; // check if the user is qnswering a qeuestion or no.
    static boolean newGame = true; // check if it's a new game or a saved game
    static boolean gameLoaded = true; // indicate if the game is loaded or not.
    boolean gameStarted = false; // use in the total time thread counter.
    boolean usingStars = false; // check if the user is using a star or not.
    boolean inMine = false; // indicates if the btton has a mine or not.
    int rowPosition;
    int columnPosition;
    int currentClickedButtonValue;
    int firstClicked = 0;// to know the first click to lunch the TotaltimerCounterThread.
    int normalGain = 0;// represent how much point you gain from one click depedns on the difficulty
    int starGain = 0;// represent how much point you gain when you use a star depedns on the difficulty.
    double starProgressBarCounter = 0.0; //a variable that hold the stars progress bar value. 
    static String playerName = "palyerXXXXX"; // indocates the player name(use it in the save process).
    boolean gamePaused = false;
    static String loadedGameID; // to know which game you should load.
    Connection  con; //instance of database connection.
    ResultSet rst; //resultset to get the result from database.
    PreparedStatement prs; //to create requests on the database. 
    static Stage newPrimaryStage = new Stage();  //elements 
    static AnchorPane newMainPanel; // to create
    static Scene newScene ; // the chooseOptions window (new Game).
    
    //create the total time counter thread 
    static int totalTimeCounterMinuts = 0;
    static int totalTimeCounterSeconds = 0;
    String totalTimeSecondsString = "00";
    String totalTimeMinutsString = "00";
    Thread totalTimeCounterThread = new Thread(()->{
            while(true){
                //check if the game is paused or not.
                if (gamePaused == false) {
                  totalTimeCounterSeconds++;  
                }
                if (totalTimeCounterSeconds == 60) {
                    totalTimeCounterMinuts++;
                    totalTimeCounterSeconds = 0;
                }
                if (totalTimeCounterMinuts < 10) {
                    totalTimeMinutsString = "0" + String.valueOf(totalTimeCounterMinuts);
                }else{
                    totalTimeMinutsString = String.valueOf(totalTimeCounterMinuts);
                }
                if (totalTimeCounterSeconds < 10) {
                    totalTimeSecondsString = "0" + String.valueOf(totalTimeSecondsString);
                }else{
                    totalTimeSecondsString =  String.valueOf(totalTimeSecondsString);
                }
                totalTimeLabel.setText(totalTimeCounterMinuts + " : " + totalTimeCounterSeconds);
                
                // update the reference in the database class to use in in the save process.
                DataBaseConnection.totalTime = totalTimeLabel.getText();
                
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                
            }
            });
    

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        // listeners for textfileds numbers.
        number1.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.equals("")) {
                checkAnswerButton.setDisable(true);
            }
            try {
                float a = Float.parseFloat(newValue);
                checkAnswerButton.setDisable(false);
            } catch (NumberFormatException e) {
                checkAnswerButton.setDisable(true);
            }
        });
        
        number2.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.equals("")) {
                checkAnswerButton.setDisable(true);
            }
            try {
                float a = Float.parseFloat(newValue);
                checkAnswerButton.setDisable(false);
            } catch (NumberFormatException e) {
                checkAnswerButton.setDisable(true);
            }
        });
        
        number3.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.equals("")) {
                checkAnswerButton.setDisable(true);
            }
            try {
                float a = Float.parseFloat(newValue);
                checkAnswerButton.setDisable(false);
            } catch (NumberFormatException e) {
                checkAnswerButton.setDisable(true);
            }
        });
        
        number4.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.equals("")) {
                checkAnswerButton.setDisable(true);
                checkAnswerButton.setDisable(false);
            }
            try {
                float a = Float.parseFloat(newValue);
            } catch (NumberFormatException e) {
                checkAnswerButton.setDisable(true);
            }
        });
        
        
        
        //connect to the database.
        DataBaseConnection.connect();
        
        //preparing the game .
        
        //creating the floatingButton subButtons and animate it.
        JFXButton optionButton = new JFXButton();
        optionButton.setMinWidth(70);
        optionButton.setMinHeight(70);
        optionButton.setStyle(
                  "-fx-background-radius: 50px;"
                + "-fx-border-radius: 50px;"
                + "-fx-background-color : #006db3;");
        FontAwesomeIconView optionIcon = new FontAwesomeIconView();
        optionIcon.setIcon(FontAwesomeIcon.ARROW_LEFT);
        optionIcon.setScaleX(4);
        optionIcon.setScaleY(4);
        optionIcon.setFill(Paint.valueOf("#ffffff"));
        optionButton.setGraphic(optionIcon);
        optionButton.setAlignment(Pos.CENTER);
    

        JFXButton saveButton = new JFXButton();
        saveButton.setStyle(optionButton.getStyle());
        saveButton.setPrefWidth(optionButton.getMinWidth());
        saveButton.setPrefHeight(optionButton.getMinHeight());
        FontAwesomeIconView saveIcon = new FontAwesomeIconView();
        saveIcon.setIcon(FontAwesomeIcon.SAVE);
        saveIcon.setScaleX(3);
        saveIcon.setScaleY(3);
        saveIcon.setFill(Paint.valueOf("#ffffff"));
        saveButton.setGraphic(saveIcon);
        saveButton.setAlignment(Pos.CENTER);
        saveButton.addEventFilter(MouseEvent.MOUSE_CLICKED, (e) -> {
            
            //save the necessary infrmations in the database.
            try {
                DataBaseConnection.saveGame();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
           
        });
        

        JFXButton pauseGame = new JFXButton();
        pauseGame.setStyle(optionButton.getStyle());
        pauseGame.setPrefWidth(optionButton.getMinWidth());
        pauseGame.setPrefHeight(optionButton.getMinHeight());
        FontAwesomeIconView pauseGameIcon = new FontAwesomeIconView();
        pauseGameIcon.setIcon(FontAwesomeIcon.PAUSE);
        pauseGameIcon.setScaleX(3);
        pauseGameIcon.setScaleY(3);
        pauseGameIcon.setFill(Paint.valueOf("#ffffff"));
        pauseGame.setGraphic(pauseGameIcon);
        pauseGame.setAlignment(Pos.CENTER);
        pauseGame.addEventFilter(MouseEvent.MOUSE_CLICKED, (e) -> {
            
            if (gamePaused == true) {
                gamePaused = false;
                pauseGameIcon.setIcon(FontAwesomeIcon.PAUSE);
                
            }else{
                gamePaused = true;  
                pauseGameIcon.setIcon(FontAwesomeIcon.REPLY);
            }
            
 
        });
        
        JFXButton newGameFloatingButton = new JFXButton();
        newGameFloatingButton.setStyle(optionButton.getStyle());
        newGameFloatingButton.setPrefWidth(optionButton.getMinWidth());
        newGameFloatingButton.setPrefHeight(optionButton.getMinHeight());
        //set the icon using the fontawesome library.
        FontAwesomeIconView newGameIcon = new FontAwesomeIconView();
        newGameIcon.setIcon(FontAwesomeIcon.PLUS_CIRCLE);
        newGameIcon.setScaleX(3);
        newGameIcon.setScaleY(3);
        newGameIcon.setFill(Paint.valueOf("#ffffff"));
        newGameFloatingButton.setGraphic(newGameIcon);
        newGameFloatingButton.setAlignment(Pos.CENTER);
        newGameFloatingButton.addEventFilter(MouseEvent.MOUSE_CLICKED, (e) -> {
            try {
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
            } catch (Exception ex) {
               ex.printStackTrace();
                       
            }
            
        });
        
        JFXButton loadGame = new JFXButton();
        loadGame.setStyle(optionButton.getStyle());
        loadGame.setMinWidth(optionButton.getMinWidth());
        loadGame.setMinHeight(optionButton.getMinHeight());
        FontAwesomeIconView loadGameIcon = new FontAwesomeIconView();
        loadGameIcon.setIcon(FontAwesomeIcon.CHAIN);
        loadGameIcon.setScaleX(3);
        loadGameIcon.setScaleY(3);
        loadGameIcon.setFill(Paint.valueOf("#ffffff"));
        loadGame.setGraphic(loadGameIcon);
        loadGame.setAlignment(Pos.CENTER);
        loadGame.addEventFilter(MouseEvent.MOUSE_CLICKED, (e) -> {
            try {
                //show the saved game in the database then lunch the picked one .
                // go to selection game scene .
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("selectGameInstance.fxml"));
                newMainPanel = loader.load();
                newScene = new Scene(newMainPanel);
                newPrimaryStage.setScene(newScene);
                newPrimaryStage.setTitle("Select The Game Options");
                newPrimaryStage.show();
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
           
        });
        
        
        floatingButtonsList = new JFXNodesList();
        floatingButtonsList.addAnimatedNode(optionButton);
        floatingButtonsList.addAnimatedNode(saveButton);
        floatingButtonsList.addAnimatedNode(newGameFloatingButton);
        floatingButtonsList.addAnimatedNode(pauseGame);
        floatingButtonsList.addAnimatedNode(loadGame);
        floatingButtonsList.setRotate(90);
        floatingButtonsList.setLayoutX(390);
        floatingButtonsList.setLayoutY(295);
        floatingButtonsList.setSpacing(12);
        
        
        gameDetailsPane.getChildren().add(floatingButtonsList);
        
        
        
        //delete the unecessary field , print the dificulty and set the normalGain value 
        //and the starGain value based on the dificulty choosed
        switch(dificulty){
            case "Easy":{
                //delete 3ed and 4th filedNumber and opt2,opt3 .
                questionPane.getChildren().remove(number3);
                questionPane.getChildren().remove(number4);
                questionPane.getChildren().remove(opt2);
                questionPane.getChildren().remove(opt3);
                // resize the elements to fit in the container.
                number2.setMinWidth(110);
                number1.setMinWidth(110);
                opt1.setLayoutX(opt1.getLayoutX() + 70);
                number2.setLayoutX(number2.getLayoutX()+ 70);
                //print the dificulty
                difficultyLabel.setText("EASY");
                //set the gain value.
                normalGain = 20;
                starGain = 50;
            }break;
            case "Hard":{
                //delete 4th filedNumber and opt3.
                questionPane.getChildren().remove(number4);
                questionPane.getChildren().remove(opt3);
                // resize the elements to fit in the container.
                number1.setMinWidth(80);
                number2.setMinWidth(80);
                number2.setLayoutX(number2.getLayoutX() + 30);
                number3.setMinWidth(80);
                number3.setLayoutX(number3.getLayoutX() + 60);
                opt1.setLayoutX(opt1.getLayoutX() + 30);
                opt2.setLayoutX(opt2.getLayoutX() + 55);
                
                //print the dificulty
                difficultyLabel.setText(dificulty);
                //set the gain value.
                normalGain = 15;
                starGain = 35;
            }break;
            case "Expert":{
                //delete nothing.
                //print the dificulty
                difficultyLabel.setText("EXPERT");
                //set the gain value.
                normalGain = 10;
                starGain = 20;
            }break;
        }
        
        //print the clicked and non clicked button number.
        clickedSquaresLabel.setText(String.valueOf(clickedSquares));
        nonClickedSquaresLabel.setText(String.valueOf(nonClickedSquares));
        //set the score label to 0.
        scoreLabel.setText(String.valueOf(score));
        //initialize the star progressbar.
        starProgressBar.setProgress(0.0);
        // initialize the star number label.
        starNumberLabel.setText("X" + String.valueOf(starsNumber));
        // initilize the totalTime label.
        totalTimeLabel.setText(totalTimeMinutsString + ":" + totalTimeSecondsString);
        
        //check if the game is a new game or a loaded game.
        /*if ( newGame == false && gameLoaded == false) {
            try {
                
                //thene relunch the game to make the changes from the loaded game. 
                gameLoaded = true; // game already loaded to stop the loop of remaking the scene.
                newGame = false; // indicate that it's not a new game.
                DataBaseConnection.loadGame();
                
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }else{*/
        if (newGame == true) { //in case that it'snot a new game but it's already loaded. 
                
                // generate the button state in case of a new game. 
                // buttons values generation base on the difficulty level selected by the user.
                Random randomeGenerator = new Random();
                int[] buttonValues = new int[169];
                for (int i = 0; i < 169; i++) {
                    switch(dificulty){
                        case "Easy":{
                            buttonValues[i] = randomeGenerator.nextInt(20) + 1;
                        }break;
                        case "Hard":{
                            buttonValues[i] = randomeGenerator.nextInt(50) + 1;
                        }break;
                        case "Expert":{
                            buttonValues[i] = randomeGenerator.nextInt(99) + 1;
                        }break;
                        default:{
                            System.err.println("now dificulty chosen"); // for the test.
                        }
                    }
                }

                // mineState generation.
                int minesMaxNumber = 0;
                switch(dificulty){
                    case "Easy":{
                        minesMaxNumber = 10;
                    }break;
                    case "Hard":{
                        minesMaxNumber = 20;
                    }break;
                    case "Expert":{
                        minesMaxNumber = 50;
                    }break;
                }

                boolean[] minesState = new boolean[169];
                int counter = 0;
                int i = 0;
                while (i < 169 ) {  
                    if (counter <= minesMaxNumber) {
                        if (randomeGenerator.nextInt(100) <= 50) {
                        minesState[i] = true;
                        counter++;
                        }
                    }else{
                       minesState[i] = false; 
                    }
                    i++;
                }

                // buttonState generating.
                boolean[] buttonStates = new boolean[169];
                for (int j = 0; j < 169; j++) {
                    buttonStates[j] = false;
                }

                //make the list of the buttons.
                gameButton.makeButtonsList(buttonValues, minesState, buttonStates);
                // test 
                for (gameButton button : gameButton.buttonsList) {
                    System.err.println(button.id + "  " + button.mineState);
                }
        
            }
        
        
        // change the button sate after loading the saved game from the database. 
        if (gameLoaded == false) {
            // reinitilize the button state (value,color).
            JFXButton effectedBtn;
            for (int i = 0; i < gameButton.buttonsList.size(); i++) { 
                
                if (gameButton.buttonsList.get(i).buttonState == true) {
                   // i must use swith cause i can't acsess to the item whith te methode loockUP.
                   makeChangesForButton(buttonsList.get(i).id , buttonsList.get(i).value);
                
                }
            }

            gameLoaded = true; // game is loaded.
        }
        
        
        //make the rows and the columns in the tow cases (loaded or new game).
        gameButton.makeRowsAndColumns();
          
    }  
    
    public void gameButtonClicked(ActionEvent action) throws InterruptedException{
       
       
        //check if the game is in pause mode or not.
        // get the clicked buuton than decide what to do based on the clicked
        // button state.
        JFXButton clickedButton = (JFXButton)action.getTarget();
        if (!clickedButton.getStyle().equals("-fx-background-color: #808e95;") 
                && !inQuestion
                && gamePaused == false
                ){
            
            //indicate the the user clicked the first time tolunch the totaltimerThread.
            if (totalTimeCounterSeconds == 0) {
                totalTimeCounterThread.start();
            }
            
             //animate the question pane.
            TranslateTransition questionAnimation = new TranslateTransition();
            questionAnimation.setDuration(Duration.seconds(0.3));
            questionAnimation.setNode(questionPane); 
            questionAnimation.setToX(-462);
            questionAnimation.setAutoReverse(true);
            questionAnimation.setCycleCount(2);
            questionAnimation.play();
            
         
            // make the boolean true in the case that the user click anothr button
            // enable the check button to check the user answer.
            checkAnswerButton.setDisable(false);
            // whene the question is still running.
            inQuestion = true;
            clickedButton.setStyle("-fx-background-color: #808e95;"); // change the color to red i case of a mine.
            //get the button refernce from the list using the id comparaison between
            //the clicked button and the object stored in the list.
            int index = 0;
            while (!gameButton.buttonsList.get(index).id.equals(clickedButton.getId()) ) {            
                index++;
            }
            // get the value of the button cause it's considerd as the  correct 
            //result of the equation.
            correctResult = gameButton.buttonsList.get(index).value;
            //show the value of the button as a button text .
            currentClickedButtonValue = gameButton.buttonsList.get(index).value;
            clickedButton.setText(String.valueOf(currentClickedButtonValue));
            // make the button state clicked.
            gameButton.buttonsList.get(index).buttonState = true;
            // chack if the buttons has a mine or no.
            inMine = gameButton.buttonsList.get(index).mineState;
            // get the time value taht depends on the mine state.
            if (inMine == true) {
                timer = 20;
            }else{
                timer = 30;
            }    
            
           
            //generate the question.
            //generate the operations and the number of fields.
            Random randomeGenartor = new Random();
            int generatedOperationType;
            for (int i = 0; i < 3; i++) {
                generatedOperationType = randomeGenartor.nextInt(3) ;
                switch(i){
                    case 0:{
                        switch (generatedOperationType){
                            case 0:{
                                opt1.setText("+");
                            }break;
                            case 1:{
                                opt1.setText("*"); 
                            }break;
                            case 2:{
                                opt1.setText("/");
                            }break;
                            case 3:{
                                opt1.setText("-");
                            }break;
                        }
                    }break;
                    case 1:{
                        switch (generatedOperationType){
                            case 0:{
                                opt2.setText("+");
                            }break;
                            case 1:{
                                opt2.setText("/"); 
                            }break;
                            case 2:{
                                opt2.setText("*");
                            }break;
                            case 3:{
                                opt2.setText("-");
                            }break;
                        }
                    }break;
                    case 2:{
                        switch (generatedOperationType){
                            case 0:{
                                opt3.setText("/");
                            }break;
                            case 1:{
                                opt3.setText("+"); 
                            }break;
                            case 2:{
                                opt3.setText("-");
                            }break;
                            case 3:{
                                opt3.setText("*");
                            }break;
                        }
                    }break;
                }
            }
            // show the correct result of the equation ojn the label.
            equationResultLabel.setText(String.valueOf(currentClickedButtonValue));
            // make the qright iconin the question panel based on what cind of question.
            // and if the player is using a star.
            Image iconImage;
            if (usingStars == true) {
                iconImage = new Image(GameViewController.class.getResourceAsStream("star2.png"));
            }else{
                if (inMine == true) {
                    iconImage = new Image(GameViewController.class.getResourceAsStream("bomb.png"));
                }else{
                    iconImage = new Image(GameViewController.class.getResourceAsStream("flag.png"));
                }
            }
            bombImage.setImage(iconImage);
            //get the row and column postion based on the clicked button name.
            // the button bt11111 and bt11000 is a special button caused by the buton names coding.
            if (clickedButton.getId().equals("bt11111") ||
                    clickedButton.getId().equals("bt11000") ||
                    clickedButton.getId().equals("bt11222") ||
                    clickedButton.getId().equals("bt110") ||
                    clickedButton.getId().equals("bt111") ||
                    clickedButton.getId().equals("bt112")) {
                switch( clickedButton.getId()){
                    case "bt11111":{
                         rowPosition = 11;
                         columnPosition = 1; 
                    }break;
                    case "bt11222":{
                        rowPosition = 11;
                        columnPosition = 2;
                    }break;
                    case "bt11000":{
                        rowPosition = 11;
                        columnPosition = 0;
                    }break;
                    case "bt110":{
                        rowPosition = 1;
                        columnPosition = 10;
                    }break;
                    case "bt111":{
                        rowPosition = 1;
                        columnPosition = 11;
                    }break;
                    case "bt112":{
                        rowPosition = 1;
                        columnPosition = 12;
                    }
                }
            }else{
                 switch(clickedButton.getId().length()){
                case 4:{
                    rowPosition = Integer.parseInt(String.valueOf(clickedButton.getId().charAt(2)));
                    columnPosition = Integer.parseInt(String.valueOf(clickedButton.getId().charAt(3)));
                }break;
                case 5:{
                    if (Integer.parseInt(String.valueOf(clickedButton.getId().charAt(2))) != 1) {
                        rowPosition = Integer.parseInt(String.valueOf(clickedButton.getId().charAt(2)));
                        columnPosition = Integer.parseInt(String.valueOf(clickedButton.getId().
                                substring(3,clickedButton.getId().length())));
                    }else{
                      rowPosition = Integer.parseInt(String.valueOf(clickedButton.getId().
                              substring(2, 4)));
                      columnPosition = Integer.parseInt(String.valueOf(clickedButton.getId().charAt(4)));
                    }
                }break;
                case 6:{
                    int a = Integer.parseInt(String.valueOf(clickedButton.getId().
                            substring(2, 4)));
                    int b = Integer.parseInt(String.valueOf(clickedButton.getId().
                            substring(4, clickedButton.getId().length())));
                    rowPosition = a;
                    columnPosition = b;
                }break;
            }
            }
            
            
            //decrement the nonClicked buttons number.
            nonClickedSquares--;
            nonClickedSquaresLabel.setText(String.valueOf(nonClickedSquares));
            //increment the Clicked buttons number.
            clickedSquares++;
            clickedSquaresLabel.setText(String.valueOf(clickedSquares));
            
            
            // creat a UI thread that decrement the time for the question based 
            // on the timer variabel value.
            // chage the color of the timerLabel based on the mineState.
            if (inMine == true) {
                timerLabel.setFill(Paint.valueOf("#d2272d"));
                // mybe add a sound of clock and animate the skil of timerLabel.
            }else{
                timerLabel.setFill(Paint.valueOf("#000000"));
            }
            
            decrementer = new Thread(()->{
                while (timer >= 0) { 
                    if(timer < 10){
                        timerLabel.setText("00:0"+String.valueOf(timer));
                    }else{
                        timerLabel.setText("00:"+String.valueOf(timer));
                    }
                    try {
                       Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //check if the game is paused or not.
                    if (gamePaused == false) {
                        timer--;
                    }
                    } 
                //deactivate the checkAnswer button cause it's too late.
                checkAnswerButton.setDisable(true);
                // make the click avaible for the next question.
                inQuestion = false;
                if (inMine == true) {
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            // we have to use the platformer thread to update the interface fromthis thread.
                            // pass the informations to the loose a page.
                            GameWinViewController.gameEndScore = score;
                            GameWinViewController.gameEndStars = starsNumber;
                            GameWinViewController.gameEndTotalTime = totalTimeLabel.getText();
                            GameWinViewController.gameEndRank = "rank A"; // change the rank to an int ot indacate wich picture.
                            GameWinViewController.gameState = false;
                            // go to the game win page.
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("gameWinView.fxml"));
                            try {
                                newMainPanel = loader.load();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                            newScene = new Scene(newMainPanel);
                            newPrimaryStage.setScene(newScene);
                            newPrimaryStage.setTitle("... THE END ...");
                            newPrimaryStage.show();
                        
                        }
                    });
                }
            });
            decrementer.start(); // start the thread.
        }
            
    }
    
    public void checkAnswer() throws IOException{
        
         // check if the user enterd a data or not.
         if (checkEnterdData() == true) {
            // stop the decrementer thread.
        decrementer.stop();
        // desactivate the button to make only one check.
        checkAnswerButton.setDisable(true);
        
        // get the numbers enterd based on the difficulty (number of fileds).
        float fieldNumber1 = 0 ;
        float fieldNumber2 = 0 ;
        float fieldNumber3 = 0 ;
        float fieldNumber4 = 0 ;
        String operation1 = "";
        String operation2 = "";
        String operation3 = "";
        //int result;
        // remember to check the number entring exception.
        switch(dificulty){
            case "Easy":{
                //check if the user enterd the data or not and if the data is a number.
                fieldNumber1 = Float.parseFloat(number1.getText());
                fieldNumber2 = Float.parseFloat(number2.getText());
                operation1 = opt1.getText();
            }break;
            case "Hard":{
                //check if the user enterd the data or not and if the data is a number.
                fieldNumber1 = Float.parseFloat(number1.getText());
                fieldNumber2 = Float.parseFloat(number2.getText());
                fieldNumber3 = Float.parseFloat(number3.getText());
                operation1 = opt1.getText();
                operation2 = opt2.getText();
            }break;
            case "Expert":{
                //check if the user enterd the data or not and if the data is a number.
                fieldNumber1 = Float.parseFloat(number1.getText());
                fieldNumber2 = Float.parseFloat(number2.getText());
                fieldNumber3 = Float.parseFloat(number3.getText());
                fieldNumber4 = Float.parseFloat(number4.getText());
                operation1 = opt1.getText();
                operation2 = opt2.getText();
                operation3 = opt3.getText();
            }break;
            default:{
                System.err.println("no level selected"); // for the test.
            }
        }
    
        
        // calculate the result and compare it whith the correct one;
        
        switch(dificulty){
            case"Easy":{
                switch(operation1){
                    case "*":{
                        result = fieldNumber1 * fieldNumber2;
                    }break;
                    case "/":{
                        result = fieldNumber1 / fieldNumber2;
                    }break;
                    case "-":{
                        result = fieldNumber1 - fieldNumber2;
                    }break;
                    case "+":{
                        result = fieldNumber1 + fieldNumber2;
                    }
                }break;
            }
            case "Hard":{
                float interm = 0;
                if (operation1.equals("*") || operation1.equals("/")) {
                    if (operation1.equals("*")) {
                        interm = fieldNumber1 * fieldNumber2;
                    }else{
                        interm = fieldNumber1 / fieldNumber2;
                    }
                    switch(operation2){
                        case "*":{
                            result = interm * fieldNumber3  ;
                        }break;
                        case "/":{
                            result = interm / fieldNumber3 ;
                        }break;
                        case "-":{
                            result = interm - fieldNumber1 ;
                        }break;
                        case "+":{
                            result = fieldNumber1 + interm;
                        }break;
                    }
                }else{
                    if (operation2.equals("*") || operation2.equals("/")) {
                         if (operation2.equals("*")) {
                        interm = fieldNumber2 * fieldNumber3;
                    }else{
                        interm = fieldNumber2 / fieldNumber3;
                    }
                    switch(operation1){
                        case "*":{
                            result = fieldNumber1 * interm;
                        }break;
                        case "/":{
                            result = fieldNumber1 / interm;
                        }break;
                        case "-":{
                            result = fieldNumber1 - interm;
                        }break;
                        case "+":{
                            result = fieldNumber1 + interm;
                        }break;
                    }
                    }else{
                          switch(operation1){
                        case "*":{
                            interm = fieldNumber1  * fieldNumber2;
                        }break;
                        case "/":{
                            interm = fieldNumber1  / fieldNumber2;
                        }break;
                        case "+":{
                            interm = fieldNumber1  + fieldNumber2;
                        }break;
                        case "-":{
                            interm = fieldNumber1  - fieldNumber2;
                        }break;
                    }
                    
                    switch(operation2){
                        case "*":{
                            result = interm  * fieldNumber3;
                        }break;
                        case "/":{
                            result = interm  / fieldNumber3;
                        }break;
                        case "+":{
                            result = interm  + fieldNumber3;
                        }break;
                        case "-":{
                            result = interm  - fieldNumber3;
                        }break;
                    } 
                    }
                 
                }
            }break;
            case "Expert":{
                float interm = 0;
                float interm1 = 0;
                if (operation1.equals("*") || operation1.equals("/")) {
                    if (operation1.equals("*")) {
                        interm = fieldNumber1 * fieldNumber2;
                    }else{
                        interm = fieldNumber1 / fieldNumber2;
                    }
                    
                    if (operation2.equals("*") || operation2.equals("/")) {
                        if (operation2.equals("*")) {
                          interm1 = interm * fieldNumber3;  
                        }else{
                          interm1 = interm / fieldNumber3;  
                        }
                        
                        switch(operation3){
                            case "*":{
                                result = interm1 * fieldNumber4;
                            }break;
                            case "/":{
                                result = interm1 / fieldNumber4;
                            }break;
                            case "+":{
                                result = interm1 + fieldNumber4;
                            }break;
                            case "-":{
                                result = interm1 - fieldNumber4;
                            }break;
                        }
                    }else{
                        if (operation3.equals("*") || operation3.equals("/")) {
                            if (operation3.equals("*")) {
                                interm1 = fieldNumber3 * fieldNumber4;
                            }else{
                                interm1 =  fieldNumber3 / fieldNumber4;
                            }
                            
                            switch(operation2){
                                case "*":{
                                    result = interm * interm1;
                                }break;
                                case "/":{
                                    result = interm / interm1;
                                }break;
                                case "+":{
                                    result = interm + interm1;
                                }break;
                                case "-":{
                                    result = interm - interm1;
                                }break;
                            }
                        }
                        
                    }
                }else{
                    if (operation2.equals("*") || operation2.equals("/")) {
                        if (operation2.equals("*")) {
                           interm = fieldNumber2 * fieldNumber3; 
                        }else{
                            interm = fieldNumber2 / fieldNumber3;
                        }
                        
                        if (operation3.equals("*") || operation3.equals("/")) {
                            if (operation3.equals("*")) {
                                interm1 = interm * fieldNumber4;
                            }else{
                                interm1 = interm / fieldNumber4;
                            }
                        }
                        
                        switch(operation1){
                            case "*":{
                                result = fieldNumber1 * interm1;
                            }break;
                            case "/":{
                                result = fieldNumber1 / interm1;
                            }break;
                            case "+":{
                                result = fieldNumber1 + interm1;
                            }break;
                            case "-":{
                                result = fieldNumber1 - interm1;
                            }break;
                        }
                    }else{
                        if (operation3.equals("/") || operation3.equals("*")) {
                            if (operation3.equals("*")) {
                                interm = fieldNumber3 * fieldNumber4;
                            }else{
                                interm = fieldNumber3 / fieldNumber4;
                            }
                            
                            switch(operation2){
                                case"*":{
                                    interm1 = fieldNumber2 * interm;
                                }break;
                                 case"/":{
                                     interm1 = fieldNumber2 / interm;
                                }break;
                                 case"+":{
                                     interm1 = fieldNumber2 + interm;
                                }break;
                                 case"-":{
                                     interm1 = fieldNumber2 - interm;
                                }break;
                            }
                            
                             switch(operation1){
                                case"*":{
                                    result = fieldNumber1 * interm1;
                                }break;
                                 case"/":{
                                    result = fieldNumber1 / interm1;
                                }break;
                                 case"+":{
                                    result = fieldNumber3 + interm1;
                                }break;
                                 case"-":{
                                    result = fieldNumber4 - interm1;
                                }break;
                            }
                            
                            
                        }else{
                            
                            switch(operation1){
                                case"*":{
                                    interm = fieldNumber1 * fieldNumber2;
                                }break;
                                 case"/":{
                                    interm = fieldNumber1 / fieldNumber2;
                                }break;
                                 case"+":{
                                    interm = fieldNumber1 + fieldNumber2;
                                }break;
                                 case"-":{
                                    interm = fieldNumber1 - fieldNumber2;
                                }break;
                            }
                            
                            switch(operation2){
                                case"*":{
                                    interm1 = interm * fieldNumber3;
                                }break;
                                 case"/":{
                                     interm1 = interm / fieldNumber3;
                                }break;
                                 case"+":{
                                     interm1 = interm + fieldNumber3;
                                }break;
                                 case"-":{
                                     interm1 = interm - fieldNumber3;
                                }break;
                            }
                            
                            switch(operation2){
                                case"*":{
                                    result = interm1 * fieldNumber4;
                                }break;
                                 case"/":{
                                     result = interm1 / fieldNumber4;
                                }break;
                                 case"+":{
                                     result = interm1 + fieldNumber4;
                                }break;
                                 case"-":{
                                    result = interm1 - fieldNumber4;
                                }break;
                            }
                        }
                    }
                }
            }
        }
        
        
        
        //compare the result with the correct one.
        if (correctResult == result) {
            // check if all the buttons is clicked (game win).
            if (clickedSquares == 169) {
                // pass the informations to the win a page.
                GameWinViewController.gameEndScore = score;
                GameWinViewController.gameEndStars = starsNumber;
                GameWinViewController.gameEndTotalTime = totalTimeLabel.getText();
                GameWinViewController.gameEndRank = "rank A"; // change the rank to an int ot indacate wich picture.
                GameWinViewController.gameState = true;
                // go to the game win page.
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("gameWinView.fxml"));
                newMainPanel = loader.load();
                newScene = new Scene(newMainPanel);
                newPrimaryStage.setScene(newScene);
                newPrimaryStage.setTitle("... THE END ...");
                newPrimaryStage.show();
                
            }else{
                //inceement the star progressBar.
            starProgressBarCounter = starProgressBarCounter + 0.1;
            starProgressBar.setProgress(starProgressBarCounter);
            //reintialaze the value to 0.0 in cas it reach's the max value 
            // and increment the star number.
            if (starProgressBarCounter >= 0.99) {
                starProgressBarCounter = 0.0;
                starsNumber++;
                starNumberLabel.setText(String.valueOf(starsNumber) + "X");
                starProgressBar.setProgress(starProgressBarCounter);
                
            }
            // increments the score.
            score = score + normalGain;
            // change the levele picture based on the score.
            Image levelImage;
                if (score > 1000) {
                    levelImage = new Image(GameViewController.class.getResourceAsStream("star2.png"));
                    rank2ImageView.setImage(levelImage);
                    
                }else{
                    if (score > 3000) {
                        levelImage = new Image(GameViewController.class.getResourceAsStream("star2.png"));
                        rank3ImageView.setImage(levelImage);
                    }
                }
            scoreLabel.setText(String.valueOf(score));
            // take off the squares that has a values less than the clicked one
            // and positioned in the same line or row based on the tow variables
            // rowPsition and columnPosition.
            //create a list that containes all the buttons in the same column.
            ArrayList<String> columnButtons = gameButton.getColumn(columnPosition);
             //create a list that containes all the buttons in the same row.
            ArrayList<String> rowButtons = gameButton.getRow(rowPosition);
            //creat a list that will contains the effected buttons due to the correct answer.
            ArrayList<String> effectedButtons = new ArrayList<String>();
            //parcour the tow list to get the effected buttons.
            //columns
            for (int i = 0; i < columnButtons.size(); i++) {
                if (gameButton.getButton(columnButtons.get(i)).value > currentClickedButtonValue ) {
                    effectedButtons.add(columnButtons.get(i));
                }
            }
            //rows
            for (int i = 0; i < rowButtons.size(); i++) {
                if (gameButton.getButton(rowButtons.get(i)).value < currentClickedButtonValue ) {
                    effectedButtons.add(rowButtons.get(i));
                }
            }
             
            //make the effected button also as a gaind buttons and te number of 
            //gaind buttonis based on the difficulty.
            int maxGaindButtons = 0;
            switch(dificulty){
                case "Easy":{
                    maxGaindButtons = 8;
                }break;
                case "Hard":{
                    maxGaindButtons =  6;
                }break;
                case "Expert":{
                    maxGaindButtons = 4;
                }break;
            }
            //check if the player is using the one of his stars.
            if (usingStars == true) {
                //change the maxGaindButton Number switch to the difficulty .
                maxGaindButtons = 10;
            }
            //create a button to represente the effected button in each iteration.
            JFXButton effectedBtn;
            int i = 0;
            while (maxGaindButtons > 0 && i < effectedButtons.size()){
                
                //get the buttnbased on the id using the scene static variale from the luncher.
                effectedBtn = (JFXButton)IHMProjetFinal.scene.lookup("#"+effectedButtons.get(i));
                //change the button propretis and show it's value if it's not already checked .
                if (gameButton.getButton(effectedButtons.get(i)).buttonState == false) {
                     // change the button clickedState.
                    gameButton.getButton(effectedButtons.get(i)).buttonState = true;
                    //change the button color.
                     effectedBtn.setStyle("-fx-background-color: #808e95;");   
                    //show the value of the button.
                    effectedBtn.setText(String.valueOf(gameButton.getButton(effectedButtons.get(i)).value));
                    //decrements the max button gaind.
                    maxGaindButtons--;
                    //increment the clicked buttons.
                    clickedSquares++;
                    clickedSquaresLabel.setText(String.valueOf(clickedSquares));
                    //decrement the non clicked buttons.
                    nonClickedSquares--;
                    nonClickedSquaresLabel.setText(String.valueOf(nonClickedSquares));
                    //inceremnets the score.
                    score = score + normalGain;
                    scoreLabel.setText(String.valueOf(score));
                }
                i++;
            }
            
            }
            if (clickedSquares == 169) {
                // pass the informations to the win a page.
                GameWinViewController.gameEndScore = score;
                GameWinViewController.gameEndStars = starsNumber;
                GameWinViewController.gameEndTotalTime = totalTimeLabel.getText();
                GameWinViewController.gameEndRank = "rank A"; // change the rank to an int ot indacate wich picture.
                GameWinViewController.gameState = true;
                // go to the game win page.
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("gameWinView.fxml"));
                newMainPanel = loader.load();
                newScene = new Scene(newMainPanel);
                newPrimaryStage.setScene(newScene);
                newPrimaryStage.setTitle("... THE END ...");
                newPrimaryStage.show();
            }
            
            
            
            
        }else{
            // case that teh player didn't get the answer wright.
            if (inMine == true) {
                // pass the informations to the loose a page.
                GameWinViewController.gameEndScore = score;
                GameWinViewController.gameEndStars = starsNumber;
                GameWinViewController.gameEndTotalTime = totalTimeLabel.getText();
                GameWinViewController.gameEndRank = "rank A"; // change the rank to an int ot indacate wich picture.
                GameWinViewController.gameState = false;
                // go to the game win page.
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("gameWinView.fxml"));
                newMainPanel = loader.load();
                newScene = new Scene(newMainPanel);
                newPrimaryStage.setScene(newScene);
                newPrimaryStage.setTitle("... THE END ...");
                newPrimaryStage.show();
                
            }else{
                //reinitilize the star progressBar to 0.
                starProgressBarCounter = 0.0;
                starProgressBar.setProgress(starProgressBarCounter);
                // add a new mine in a random button.
                Random randomGenerator = new Random();
                int index = randomGenerator.nextInt(168);
                gameButton.buttonsList.get(index).mineState = true;
            }
            
        }
        
        //turn the inquestion state to false to give the abbility to click new buttons.
        inQuestion =  false;
        // remake the state of the star to false in order to end the effect of a star.
        usingStars = false;
        }
        
        
    }
    
    public void useStars() throws InterruptedException{
    
        //check if the game is paused or not.
        if (gamePaused == false) {
            //vheck if the player hav any stars to use or no.
            if (starsNumber > 0) {
                // turn the variable usingStars to true to indicate that the user is using a star.
                usingStars = true;
                //decremets the stars number.
                starsNumber--;
                starNumberLabel.setText(String.valueOf(starsNumber));
            }
        }   
    }
    
    // methode that changes the state of button in the case of loeading a saved game.
    public void makeChangesForButton(String buttonID , int value){
        
        switch(buttonID){
             case "bt00":{
                   bt00.setText(String.valueOf(value));
                   bt00.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt01":{
                 bt01.setText(String.valueOf(value));
                 bt01.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt02":{
                 bt02.setText(String.valueOf(value));
                 bt02.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt03":{
                 bt03.setText(String.valueOf(value));
                 bt03.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt04":{
                  bt04.setText(String.valueOf(value));
                 bt04.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt05":{
                 bt05.setText(String.valueOf(value));
                 bt05.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt06":{
                 bt06.setText(String.valueOf(value));
                 bt06.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt07":{
                  bt07.setText(String.valueOf(value));
                 bt07.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt08":{
                  bt08.setText(String.valueOf(value));
                 bt08.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt09":{
                 bt09.setText(String.valueOf(value));
                 bt09.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt010":{
                  bt010.setText(String.valueOf(value));
                 bt010.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt011":{
                 bt011.setText(String.valueOf(value));
                 bt011.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt012":{
                 bt012.setText(String.valueOf(value));
                 bt012.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt10":{
                  bt10.setText(String.valueOf(value));
                 bt10.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt11":{
                  bt11.setText(String.valueOf(value));
                 bt11.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt12":{
                  bt12.setText(String.valueOf(value));
                 bt12.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt13":{
                  bt13.setText(String.valueOf(value));
                 bt13.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt14":{
                  bt14.setText(String.valueOf(value));
                 bt14.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt15":{
                  bt15.setText(String.valueOf(value));
                 bt15.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt16":{
                 bt16.setText(String.valueOf(value));
                 bt16.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt17":{
                 bt17.setText(String.valueOf(value));
                 bt17.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt18":{
                 bt18.setText(String.valueOf(value));
                 bt18.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt19":{
                 bt19.setText(String.valueOf(value));
                 bt19.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt110":{
                  bt110.setText(String.valueOf(value));
                 bt110.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt111":{
                  bt111.setText(String.valueOf(value));
                 bt111.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt112":{
                 bt112.setText(String.valueOf(value));
                 bt112.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt20":{
                  bt20.setText(String.valueOf(value));
                 bt20.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt21":{
                  bt21.setText(String.valueOf(value));
                 bt21.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt22":{
                  bt22.setText(String.valueOf(value));
                 bt22.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt23":{
                  bt23.setText(String.valueOf(value));
                 bt23.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt24":{
                 bt24.setText(String.valueOf(value));
                 bt24.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt25":{
                 bt25.setText(String.valueOf(value));
                 bt25.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt26":{
                 bt26.setText(String.valueOf(value));
                 bt26.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt27":{
                 bt27.setText(String.valueOf(value));
                 bt27.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt28":{
                 bt28.setText(String.valueOf(value));
                 bt28.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt29":{
                  bt29.setText(String.valueOf(value));
                 bt29.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt210":{
                 bt210.setText(String.valueOf(value));
                 bt210.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt211":{
                 bt211.setText(String.valueOf(value));
                 bt211.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt212":{
                 bt212.setText(String.valueOf(value));
                 bt212.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt30":{
                  bt30.setText(String.valueOf(value));
                 bt30.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt31":{
                  bt31.setText(String.valueOf(value));
                 bt31.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt32":{
                 bt32.setText(String.valueOf(value));
                 bt32.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt33":{
                  bt33.setText(String.valueOf(value));
                 bt33.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt34":{
                 bt34.setText(String.valueOf(value));
                 bt34.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt35":{
                 bt35.setText(String.valueOf(value));
                 bt35.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt36":{
                 bt36.setText(String.valueOf(value));
                 bt36.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt37":{
                 bt37.setText(String.valueOf(value));
                 bt37.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt38":{
                 bt38.setText(String.valueOf(value));
                 bt38.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt39":{
                 bt39.setText(String.valueOf(value));
                 bt39.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt310":{
                 bt310.setText(String.valueOf(value));
                 bt310.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt311":{
                 bt311.setText(String.valueOf(value));
                 bt311.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt312":{
                 bt312.setText(String.valueOf(value));
                 bt312.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt40":{
                 bt40.setText(String.valueOf(value));
                 bt40.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt41":{
                 bt42.setText(String.valueOf(value));
                 bt42.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt43":{
                 bt43.setText(String.valueOf(value));
                 bt43.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt44":{
                 bt44.setText(String.valueOf(value));
                 bt44.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt45":{
                 bt45.setText(String.valueOf(value));
                 bt45.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt46":{
                 bt46.setText(String.valueOf(value));
                 bt46.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt47":{
                 bt47.setText(String.valueOf(value));
                 bt47.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt48":{
                 bt48.setText(String.valueOf(value));
                 bt48.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt49":{
                 bt49.setText(String.valueOf(value));
                 bt49.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt410":{
                  bt410.setText(String.valueOf(value));
                 bt410.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt411":{
                 bt411.setText(String.valueOf(value));
                 bt411.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt412":{
                 bt412.setText(String.valueOf(value));
                 bt412.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt50":{
                 bt50.setText(String.valueOf(value));
                 bt50.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt51":{
                 bt51.setText(String.valueOf(value));
                 bt51.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt52":{
                 bt52.setText(String.valueOf(value));
                 bt52.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt53":{
                 bt53.setText(String.valueOf(value));
                 bt53.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt54":{
                  bt54.setText(String.valueOf(value));
                 bt54.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt55":{
                 bt55.setText(String.valueOf(value));
                 bt55.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt56":{
                  bt56.setText(String.valueOf(value));
                 bt56.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt57":{
                 bt57.setText(String.valueOf(value));
                 bt57.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt58":{
                 bt58.setText(String.valueOf(value));
                 bt58.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt59":{
                 bt59.setText(String.valueOf(value));
                 bt59.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt510":{
                 bt510.setText(String.valueOf(value));
                 bt510.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt511":{
                 bt511.setText(String.valueOf(value));
                 bt511.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt512":{
                 bt512.setText(String.valueOf(value));
                 bt512.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt60":{
                 bt60.setText(String.valueOf(value));
                 bt60.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt61":{
                 bt61.setText(String.valueOf(value));
                 bt61.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt62":{
                 bt62.setText(String.valueOf(value));
                 bt62.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt63":{
                 bt63.setText(String.valueOf(value));
                 bt63.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt64":{
                  bt64.setText(String.valueOf(value));
                 bt64.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt65":{
                 bt65.setText(String.valueOf(value));
                 bt65.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt66":{
                 bt66.setText(String.valueOf(value));
                 bt66.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt67":{
                  bt67.setText(String.valueOf(value));
                 bt67.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt68":{
                 bt68.setText(String.valueOf(value));
                 bt68.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt69":{
                  bt69.setText(String.valueOf(value));
                 bt69.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt610":{
                  bt610.setText(String.valueOf(value));
                 bt610.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt611":{
                  bt611.setText(String.valueOf(value));
                 bt611.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt612":{
                  bt612.setText(String.valueOf(value));
                 bt612.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt70":{
                 bt70.setText(String.valueOf(value));
                 bt70.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt71":{
                  bt71.setText(String.valueOf(value));
                 bt71.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt72":{
                  bt72.setText(String.valueOf(value));
                 bt72.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt73":{
                  bt73.setText(String.valueOf(value));
                 bt73.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt74":{
                  bt74.setText(String.valueOf(value));
                 bt74.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt75":{
                  bt75.setText(String.valueOf(value));
                 bt75.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt76":{
                  bt76.setText(String.valueOf(value));
                 bt76.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt77":{
                  bt77.setText(String.valueOf(value));
                 bt77.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt78":{
                  bt78.setText(String.valueOf(value));
                 bt78.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt79":{
                 bt79.setText(String.valueOf(value));
                 bt79.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt710":{
                  bt710.setText(String.valueOf(value));
                 bt710.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt711":{
                  bt711.setText(String.valueOf(value));
                 bt711.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt712":{
                  bt712.setText(String.valueOf(value));
                 bt712.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt80":{
                  bt80.setText(String.valueOf(value));
                 bt80.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt81":{
                 bt81.setText(String.valueOf(value));
                 bt81.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt82":{
                 bt82.setText(String.valueOf(value));
                 bt82.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt83":{
                 bt83.setText(String.valueOf(value));
                 bt83.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt84":{
                  bt84.setText(String.valueOf(value));
                 bt84.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt85":{
                  bt85.setText(String.valueOf(value));
                 bt85.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt86":{
                 bt86.setText(String.valueOf(value));
                 bt86.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt87":{
                 bt87.setText(String.valueOf(value));
                 bt87.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt88":{
                  bt88.setText(String.valueOf(value));
                 bt88.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt89":{
                  bt89.setText(String.valueOf(value));
                 bt89.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt810":{
                 bt810.setText(String.valueOf(value));
                 bt810.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt811":{
                  bt811.setText(String.valueOf(value));
                 bt811.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt812":{
                 bt812.setText(String.valueOf(value));
                 bt812.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt90":{
                  bt90.setText(String.valueOf(value));
                 bt90.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt91":{
                  bt91.setText(String.valueOf(value));
                 bt91.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt92":{
                  bt92.setText(String.valueOf(value));
                 bt92.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt93":{
                  bt93.setText(String.valueOf(value));
                 bt93.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt94":{
                  bt94.setText(String.valueOf(value));
                 bt94.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt95":{
                 bt95.setText(String.valueOf(value));
                 bt95.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt96":{
                  bt96.setText(String.valueOf(value));
                 bt96.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt97":{
                  bt97.setText(String.valueOf(value));
                 bt97.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt98":{
                  bt98.setText(String.valueOf(value));
                 bt98.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt99":{
                  bt99.setText(String.valueOf(value));
                 bt99.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt910":{
                  bt910.setText(String.valueOf(value));
                 bt910.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt911":{
                  bt911.setText(String.valueOf(value));
                 bt911.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt912":{
                  bt912.setText(String.valueOf(value));
                 bt912.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt100":{
                  bt100.setText(String.valueOf(value));
                 bt100.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt101":{
                  bt101.setText(String.valueOf(value));
                 bt101.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt102":{
                  bt102.setText(String.valueOf(value));
                 bt102.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt103":{
                  bt103.setText(String.valueOf(value));
                 bt103.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt104":{
                  bt104.setText(String.valueOf(value));
                 bt104.setStyle("-fx-background-color: #808e95;");
             }break;
             case "bt105":{
                 bt105.setText(String.valueOf(value));
                 bt105.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt106":{
                 bt106.setText(String.valueOf(value));
                 bt106.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt107":{
                 bt107.setText(String.valueOf(value));
                 bt107.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt108":{
                 bt108.setText(String.valueOf(value));
                 bt108.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt109":{
                 bt109.setText(String.valueOf(value));
                 bt109.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt1010":{
                 bt1010.setText(String.valueOf(value));
                 bt1010.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt1011":{
                 bt1011.setText(String.valueOf(value));
                 bt1011.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt1012":{
                 bt1012.setText(String.valueOf(value));
                 bt1012.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt11000":{
                 bt11000.setText(String.valueOf(value));
                 bt11000.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt11111":{
                 bt11111.setText(String.valueOf(value));
                 bt11111.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt11222":{
                 bt11222.setText(String.valueOf(value));
                 bt11222.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt113":{
                 bt13.setText(String.valueOf(value));
                 bt13.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt114":{
                 bt114.setText(String.valueOf(value));
                 bt114.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt115":{
                 bt115.setText(String.valueOf(value));
                 bt115.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt116":{
                 bt116.setText(String.valueOf(value));
                 bt116.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt117":{
                 bt117.setText(String.valueOf(value));
                 bt117.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt118":{
                 bt118.setText(String.valueOf(value));
                 bt118.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt119":{
                 bt119.setText(String.valueOf(value));
                 bt119.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt1110":{
                 bt1110.setText(String.valueOf(value));
                 bt1110.setStyle("-fx-background-color: #808e95;");
             }break;
              case "bt1112":{
                 bt1112.setText(String.valueOf(value));
                 bt112.setStyle("-fx-background-color: #808e95;");
             }break;
        }
    }
    
    public boolean checkEnterdData(){
        
        switch(dificulty){
            case "EASY":{
                if (number1.getText().equals("") || 
                    number2.getText().equals("")) {
                    return false;
                }
            }break;
            case "HARD":{
                if (number1.getText().equals("") || 
                    number2.getText().equals("") ||
                    number3.getText().equals("")){
                }
            }break;
            case "EXPERT":{
                if (number1.getText().equals("") || 
                    number2.getText().equals("") ||
                    number3.getText().equals("") ||
                    number4.getText().equals("")){
                }
            }break;
        }
        return true;
    }
}
