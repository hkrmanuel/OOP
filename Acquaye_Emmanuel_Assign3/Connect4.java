package Acquaye_Emmanuel_Assign3;
import java.util.Scanner;

/**
 * Connect4 class containing the main method to start the game
 */
public class Connect4 {
    public static void main(String[] args){
        System.out.println("Welcome to Connect 4!!!");
        // Initialize the Connect 4 board
        String[][] connect4Board = new String[6][7];

        for (int s =0; s < connect4Board.length; s++){
            for(int i = 0; i < connect4Board[0].length; i++){
                connect4Board[s][i] = " ";
            }
        }

        // Initialize game variables
        boolean player1= true; boolean player2= false;
        int Position = 0;
        String rowsOfBoard = "";
        int rowline = connect4Board.length-1;;
        String Marker = ""; 

        // Draw the initial board
        for (int i= 0; i < connect4Board.length; i++){
            rowsOfBoard = "";
            for (int j = 0; j < connect4Board[i].length;j++) {
                
            rowsOfBoard +="|"+connect4Board[i][j];   
            }
            System.out.println(rowsOfBoard + "|");
        }
        System.out.println("-------------------");

        // Start the game loop
        drawtable(player1, player2, connect4Board, rowline, Position, Marker, rowsOfBoard);
 
    }

    public static void drawtable(boolean player1, boolean player2, String[][] connect4Board, int rowline, int Position, String Marker, String rowsOfBoard){
        Scanner input = new Scanner(System.in);
        // Game loop
        while (player1 == true || player2 == true){
            rowline = connect4Board.length-1;
            // Player 1 turn
            if (player1==true && player2==false){
                rowline = connect4Board.length-1;
                System.out.print("Drop A Red Disk at the column (0 - 6):");
                Position= input.nextInt();

                while (Position < 0 || Position >= connect4Board[0].length || connect4Board[0][Position] != " " ) {
                    System.out.println("Error! Please choose a column between 0 and 6 that is not already filled.");
                    System.out.print("Drop A Red Disk at the column (0 - 6): ");
                    Position = input.nextInt();
                }

                player1 = false;
                player2 = true; 
                Marker = "R";
                // Place marker on the board for Player 1
                for (int s =0; s < connect4Board[0].length; s++) {

                    if (connect4Board[rowline][Position] ==" "){
                        connect4Board[rowline][Position] = Marker;
                        break;
                    
                    }
                    else{
                        rowline -=1;
                    }
                }
            }
            //Player 2 turn
            else if(player1==false && player2==true){
                rowline = connect4Board.length-1;
                System.out.print("Drop a Yellow Disk at the column (0 - 6):");
                Position = input.nextInt();
                player1 = true;
                player2 = false;
                Marker = "Y";

                while (Position < 0 || Position >= connect4Board[0].length || connect4Board[0][Position] != " " ) {
                    System.out.println("Error! Please choose a column between 0 and 6 that is not already filled.");
                    System.out.print("Drop A Red Disk at the column (0 - 6): ");
                    Position = input.nextInt();
                }
                // Place marker on the board for Player 2
                for (int s =0; s < connect4Board[0].length; s++) {
                    if (connect4Board[rowline][Position] ==" "){
                        connect4Board[rowline][Position] = Marker;
                        break;
                    }
                    else{
                        rowline -=1;
                    }    
                }  
            }
            // Print the updated board
            for (int i= 0; i < connect4Board.length; i++){
                rowsOfBoard = "";
                for (int j = 0; j < connect4Board[0].length;j++) {
                    
                rowsOfBoard +="|"+connect4Board[i][j];   
                }
                System.out.println(rowsOfBoard +"|");
            }
            System.out.println("-------------------");

            /*
            *Check for win conditions, if there is no winner, continue
            */ 

            if (checkWinner(connect4Board, Marker)== false){
                player1 = false;
                player2 = false;
            }

    

            
        }
        
   
    }
    public static boolean checkWinner(String[][] connect4Board, String Marker){
        int drawcount = 0;

        // Check rows, columns, and diagonals for win conditions
        for (int i = 0; i <connect4Board.length; i++){
            for (int j = 0; j <connect4Board[i].length;j++){

                //Check horizontal win condition
                if( j +3 < connect4Board[i].length &&
                    connect4Board[i][j] == Marker && 
                    connect4Board[i][j] == (connect4Board[i][j+1]) && 
                    connect4Board[i][j] == connect4Board[i][j+2] &&
                    connect4Board[i][j] == connect4Board[i][j+3]){
                        if(Marker == "R"){
                            System.out.println("Red won the game");
                            System.out.println("Game Over");
                            return false;
                        }
                        if(Marker == "Y"){
                            System.out.println("Yellow won the game");
                            System.out.println("Game Over");
                            return false;
                        }

                        
                    }
                //Check vertical win condition
                if(i +3 < connect4Board.length && 
                    connect4Board[i][j] == Marker && 
                    connect4Board[i][j] == connect4Board[i+1][j] && 
                    connect4Board[i][j] == connect4Board[i+2][j] && 
                    connect4Board[i][j] == connect4Board[i+3][j]){
                        if(Marker == "R"){
                            System.out.println("Red won the game");
                            System.out.println("Game Over");
                            return false;
                        }
                        if(Marker == "Y"){
                            System.out.println("Yellow won the game");
                            System.out.println("Game Over");
                            return false;
                        }
                }
                //Check diagonal win from left to right
                if(i +3 < connect4Board.length && 
                j+3 <connect4Board.length &&
                connect4Board[i][j] == Marker && 
                connect4Board[i][j] == connect4Board[i+1][j+1] && 
                connect4Board[i][j] == connect4Board[i+2][j+2] && 
                connect4Board[i][j] == connect4Board[i+3][j+3]){
                    if(Marker == "R"){
                        System.out.println("Red won the game");
                        System.out.println("Game Over");
                        return false;
                    }
                    if(Marker == "Y"){
                        System.out.println("Yellow won the game");
                        System.out.println("Game Over");
                        return false;
                    }

                }  

                //Check diagonal win from right to left
                if(i >=3 && j +3 < connect4Board[i].length && 
                connect4Board[i][j] == Marker && 
                connect4Board[i][j] == connect4Board[i-1][j+1] && 
                connect4Board[i][j] == connect4Board[i-2][j+2] && 
                connect4Board[i][j] == connect4Board[i-3][j+3]){
                    if(Marker == "R"){
                        System.out.println("Red won the game");
                        System.out.println("Game Over");
                        return false;
                    }
                    if(Marker == "Y"){
                        System.out.println("Yellow won the game");
                        System.out.println("Game Over");
                        return false;
                    }

                }      
            }
        }
        // Check for a draw (no one has won and no more moves are possible)
        for (int i = 0; i < connect4Board.length; i++) {
            for (int j = 0; j < connect4Board[i].length; j++) {
                if (connect4Board[i][j] == " ") {
                    drawcount++;
                }
            }
        } 
        if (drawcount == 0) {
            System.out.println("The Game Was A Draw");
            return false;
        }

        return true;  
    }
}
            




        
        


    
  
