
package ihm.projet.pkgfinal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class DataBaseConnection {
    
    // database parameters.
    static String url = "jdbc:sqlite:/home/computer/NetBeansProjects/IHM-Projet-Final/ihmProjetFinal";
    static Connection cnx;
    
    // to get/write information from/to the database.
    static PreparedStatement prs;
    static ResultSet rst;
    
    //to use in the save process.
    static String totalTime;
   
    
    // variables that holds the loaded game informations.
    static String loadedDificulty;
    static int loadedClickedSquares;
    static int loadedNonClickedSquares;
    static String loadedTotalTime;
    static int loadedScore;
    static int loadedStarNumber;
    
    
    public static Connection connect() {
       
        try {
            // create a connection to the database
            cnx = DriverManager.getConnection(url);
            return cnx;
            
        } catch (SQLException e) {
            return null;
        } 
       
    }
    
    
    public static void saveGame() throws SQLException{
          
        // strnig that holds the requests.
        String request = "";
        
        //get the saved games number to make thenext game primary key.
        int gamesNumber = 0;
        request = "SELECT COUNT(gameID) AS number FROM gameInstance";
        prs = cnx.prepareStatement(request);
        rst = prs.executeQuery();
        
        while (rst.next()) {
            gamesNumber = rst.getInt("number");
            
        }
        
        // get the informations about the gameInstance.
        int score = GameViewController.score;
        String date = String.valueOf(LocalDate.now());
        int clickedSquares = GameViewController.clickedSquares;
        int nonClickedSquares = GameViewController.nonClickedSquares;
        String difficulty = GameViewController.dificulty;
        int starsNumber = GameViewController.starsNumber;
        String playerName = GameViewController.playerName;
        String gameID = "game" + gamesNumber;
        gamesNumber++; // increamet to make the id unique.
        
        

        //creat the row in the gameInstance table .
        request = "INSERT INTO gameInstance (gameID,score,date,userName,starsNumber,"
                + "dificulty,totalTime,clickedSquares,nonClickedSquares) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        prs = cnx.prepareStatement(request);
        prs.setString(1, gameID);
        prs.setInt(2, score);
        prs.setString(3, date);
        prs.setString(4, playerName);
        prs.setInt(5, starsNumber);
        prs.setString(6, difficulty);
        prs.setString(7, totalTime);
        prs.setInt(8, clickedSquares);
        prs.setInt(9, nonClickedSquares);
        prs.executeUpdate();

        //get the buttons informations and creats 169 row for each button in 
        // the buttons table .

        boolean buttonState,mineState;
        int value;
        String id;

           for (int i = 0; i < gameButton.buttonsList.size(); i++) {

               //intialize the ariables with the button info.
               id = gameButton.buttonsList.get(i).id;
               buttonState = gameButton.buttonsList.get(i).buttonState;
               mineState = gameButton.buttonsList.get(i).mineState;
               value = gameButton.buttonsList.get(i).value;

               // create the row in the database.
               request = "INSERT INTO buttons (buttonID,mineState,buttonState,"
                       + "value,gameReference) VALUES (?,?,?,?,?)";
               prs = cnx.prepareStatement(request);
               prs.setString(1, id);
               prs.setString(2, String.valueOf(mineState));
               prs.setString(3, String.valueOf(buttonState));
               prs.setInt(4, value);
               prs.setString(5, gameID);
               prs.executeUpdate();


           }
      
    }
    
    
    public static void loadGame() throws SQLException{
        
        //get the information about the game.
        //String that holds the request.
        String request;
        String loadeGameId = GameViewController.loadedGameID;
        request = "SELECT * FROM gameInstance WHERE gameID = ?";
        prs = cnx.prepareStatement(request);
        prs.setString(1, loadeGameId);
        rst = prs.executeQuery();
        
        while (rst.next()) {
            loadedScore = rst.getInt("score");
            loadedDificulty = rst.getString("dificulty");
            loadedStarNumber = rst.getInt("starsNumber");
            loadedNonClickedSquares = rst.getInt("nonClickedSquares");
            loadedClickedSquares = rst.getInt("clickedSquares");
            loadedTotalTime = rst.getString("totalTime");
        }
        
        //make the changes in the GameViewContreuleur to change the scene .
        GameViewController.score = loadedScore;
        GameViewController.clickedSquares = loadedClickedSquares;
        GameViewController.nonClickedSquares = loadedNonClickedSquares;
        GameViewController.dificulty = loadedDificulty;
        GameViewController.starsNumber = loadedStarNumber;
        // get the time from a string.
        String [] realTime = loadedTotalTime.split(":");
        //GameViewController.totalTimeCounterMinuts = Integer.parseInt(String.valueOf(realTime[0].charAt(0)));
        //GameViewController.totalTimeCounterSeconds = Integer.parseInt(String.valueOf(realTime[1].charAt(0)));
        
        // get the buttons info.
        // creat the three tables to pass it to the gameButton methode in order 
        // to initialize the button state.
        int[] buttonValues = new int[169];
        boolean[] minesState = new boolean[169];
        boolean[] buttonStates = new boolean[169];
        int counter = 0;
        
        request = "SELECT * FROM buttons WHERE gameReference = ? "
                + "ORDER BY buttonNumber ASC";
        prs = cnx.prepareStatement(request);
        prs.setString(1, GameViewController.loadedGameID);
        rst = prs.executeQuery();
        
        while (rst.next()) {            
            buttonValues[counter] = rst.getInt("value");
            buttonStates[counter] = Boolean.valueOf(rst.getString("buttonState"));
            minesState[counter] = Boolean.valueOf(rst.getString("mineState"));
            counter++;
        }
        
        
        
        //call the gameButton methode that initilize the buttons state.
        gameButton.makeButtonsList(buttonValues, minesState, buttonStates);
    }
    
    public static ObservableList<gameInstance> getSavedGames() throws Exception{
        
        // connect to the database and get the saved game Instance.
        ObservableList<gameInstance> savedGamesList = FXCollections.observableArrayList();
       
        String request = "SELECT * FROM gameInstance";
        prs = cnx.prepareStatement(request);
        rst = prs.executeQuery();
        
        while (rst.next()) {
            
            savedGamesList.add(new gameInstance
                (String.valueOf(rst.getString("gameID")),
                 String.valueOf(rst.getString("date")), 
                 String.valueOf(rst.getInt("score")), 
                 String.valueOf(rst.getString("userName"))));
                       
        }
        
        return savedGamesList;
    }
    
    public static void saveGameResult() throws SQLException{
        
        String request = "INSERT INTO gameresult "
                + "(gameScore,gamePlayer,gameDate,gameDificulty,gameRank) "
                + "VALUES(?,?,?,?,?)";
        prs = cnx.prepareStatement(request);
        prs.setInt(1, GameWinViewController.gameEndScore);
        prs.setString(2,GameViewController.playerName);
        prs.setString(3, String.valueOf(LocalDate.now()));
        prs.setString(4, GameViewController.dificulty);
        prs.setString(5, GameWinViewController.gameEndRank);
        prs.executeUpdate();
    }  
    
    public static ObservableList<gameInstance> getGamesResult() throws SQLException{
        
        // connect to the database and get all the saved game scores.
        ObservableList<gameInstance> savedGamesList = FXCollections.observableArrayList();
        
        String request = "SELECT * FROM gameresult";
        prs = cnx.prepareStatement(request);
        rst = prs.executeQuery();
        
        while (rst.next()) {            
            savedGamesList.add(new gameInstance
                (String.valueOf(rst.getString("gameID")),
                 String.valueOf(rst.getString("gameDate")), 
                 String.valueOf(rst.getInt("gameScore")), 
                 String.valueOf(rst.getString("gamePlayer"))));
        }
        
        return savedGamesList;
    }
}
