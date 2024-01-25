package Assign_1;
import java.util.Random;
import java.util.Scanner;


public class Emmanuel_Acquaye_GuessGame {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int number = rand.nextInt(100);

        int runtime = 0;
        boolean run = true;
        
        System.out.println("Welcome to the Guessing Game! \nIm thinking of a number between 1 and 100. Can you guess it?");
        while (run) {
            runtime +=1;
            System.out.print("Guess:");
            int usrinput = input.nextInt();
            if ( usrinput == number ){
                 System.out.print("Yes! You guessed correctly after " +""+ runtime + " tries! Congratulations.");

                run = false;
            }else if (usrinput > number) {
                System.out.println("Good try, but thats too high. Try again");   
            } else if ( usrinput < number){
                System.out.println("Good try, but thats too low. Try again");   
            }
            }
            input.close();

    }
    }

