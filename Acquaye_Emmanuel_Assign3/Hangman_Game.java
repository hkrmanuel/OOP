package Acquaye_Emmanuel_Assign3;
import java.util.Scanner;  // Importing the Scanner class for user input

// The main class for the Hang game
public class Hangman_Game {
    public static void main(String[] args){
        // Declaring an array of strings for the words and initializing the Scanner object
        String [] word; 
        Scanner input = new Scanner(System.in);

        // Checking if any command-line arguments are provided
        if (args.length > 0){
            // If arguments are provided, use them as the word list
            word = args;
        }
        else{
            // If no arguments are provided, use a predefined list of words
           String [] saved_word ={"plank", "oriented", "program", "capentry", "elephant", "gemini", "computers", "success"};
           word = saved_word;
        }

        // Selecting a random word from the list
        String selectedWord =randomWord(word);
        String[] displayWord =new String[selectedWord.length()];

        // Initializing an array of strings to display the word and setting all elements to *
        for (int s=0; s< selectedWord.length(); s++){
            displayWord[s] = "*";
        }

        // Initializing the count variable to 0 which will be used in the while loop condition
        int count =0;
        
        String displayWordString = ""; 

        // Printing the welcome message
        System.out.println("Welcome to the game of Hangman!");
        gamelogic(displayWordString, displayWord, selectedWord, count); // Calling the gamelogic method to start the game
        

        // Asking the user if they want to guess another word
        System.out.println("Do you want to guess another word? Enter y or n -->");
        String letter = input.nextLine();

        if (letter.equals("y")) {
            main(args);
            gamelogic(displayWordString, displayWord, selectedWord, count);
        }
        // If the user doesn't want to play again, closing the Scanner object and printing the game over message
        else {
            System.out.println("Game Over!!");
            input.close();
        }
    }  

// A method to select a random word from the list
    public static String randomWord(String[] word){

        // Generating a random index and returning the word at that index
        String random_word = word[(int) (Math.random() * word.length)];
        return random_word;
    }

    // The main method for the game logic
    public static void gamelogic(String displayWordString, String[] displayWord, String selectedWord, int count) {
        // Initializing the run variable to true and the check variable to 0
        boolean run = true;
        int check =0;
        Scanner input = new Scanner(System.in);
        // Running the game loop while the run variable is true
        while (run){
            displayWordString = "";

            // Iterating through the displayWord array and adding each element to the displayWordString
            for (int i = 0; i < displayWord.length; i++){
                displayWordString += displayWord[i];
            }

            // Asking the user to enter a letter and checking if it's already in the word
            System.out.print("Enter a letter in the word: " + displayWordString +" >" );
            String letter = input.nextLine();
            if (letter.length() > 1 || letter == ""){
                System.out.print("Enter a one letter  -->");
                letter = input.nextLine();
            }
            boolean found = false;
            boolean repeat = false;
            for (int i = 0; i < displayWordString.length(); i++) {
                if (letter.charAt(0) == displayWordString.charAt(i)) {
                    System.out.println(letter + " is already in the word");
                    repeat = true;
                }
            }

            // If the letter is not already in the word, check if it's in the selected word
            if (repeat==false) {
                for (int j=0; j < selectedWord.length();j++){
                    if (letter.charAt(0) ==selectedWord.charAt(j) ){
                        displayWord[j] = letter;
                        found = true;
                        check +=1;
                    }      
                }
                // If the letter is not in the selected word, increment the count variable
                if (found== false){
                    count +=1;
                    System.out.println(letter +" is not in the word");
                }
                    
                
            }
            //checks if all letters are guessed correctly or if there have been too
            if (check == selectedWord.length()){
                    run = false;
            }
        } 
        // Printing the number of misses
        if (count > 1 || !(count < 1)){ 
        System.out.println("The word is " + selectedWord + "." +"You missed "+ count + " times!!"); 
        } else {
            System.out.println("The word is " + selectedWord + "." +"You missed "+ count + " time!!");
        }

    }
}

 





