package Emmanuel_Acquaye_Assign2;

// import Scannr method
import java.util.Scanner;

public class EssentialStore {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner input = new Scanner(System.in);
        System.out.print("How Much Does The Item Cost?:");
        double itemCost = input.nextDouble(); // stores item cost
        System.out.print("What is the Amount Paid By The Customer?:");
        double paidAmount = input.nextDouble(); // stores amount paid by the customer
        double change =computeChangeBreakdown(itemCost, paidAmount); //acquires change from computeChangeBreakdown method
        
        System.out.printf( "The Customer's Change is  GH\u20B5%4.2f", change);
        //close Scanner object
        input.close();
    }
    //This creates a method to compute the change and breakdown the denominations
    public static double computeChangeBreakdown(double costOfItems,double AmountPaid){
        //Below variables are initialized for the computation of the change

        double customerChange = Math.round((AmountPaid - costOfItems)*100.0)/100.0;
        double balance = 0;

        //Below initializes the variables to zero
        int numberOfTwoHundreds, numberOfHundreds, numberOfFifty, numberOfTwenty,numberOfTen, numberOfFive, numberOfTwo,numberOfone, numberOf50p, numberOf20p, numberof10p, numberof5p, numberof1p = 0;

        System.out.printf("These are the denominations of the balance of GH\u20B5%4.2f",customerChange);
        System.out.println("");

        //Below each number is checked for specific denomination available 
        if (customerChange >=200){
            numberOfTwoHundreds = (int)(customerChange / 200);
            balance += customerChange - numberOfTwoHundreds * 200;
            System.out.println(numberOfTwoHundreds + " " + "GH\u20B5200");
        }
        else {
            balance = customerChange;
        }
        //checks for 100s
        if (balance >=100){
            numberOfHundreds = (int) (balance / 100);
            balance -=(numberOfHundreds * 100);
            System.out.println(numberOfHundreds +" "+ "GH\u20B5100");
        }
        //checks for 50s
        if (balance >=50){ 
            numberOfFifty = (int) (balance / 50);
            balance -=numberOfFifty * 50;
            System.out.println(numberOfFifty +" "+ "GH\u20B550");
        }
        //checks for 20s
        if (balance >=20){
            numberOfTwenty = (int)(balance/ 20);
            balance -=numberOfTwenty * 20;
            System.out.println(numberOfTwenty + " "+ "GH\u20B520");
        }
        //checks for 10s
        if (balance >=10){
            numberOfTen = (int)(balance/ 10);
            balance -= numberOfTen* 10;
            System.out.println(numberOfTen +" "+ "GH\u20B510");
        }
        //checks for 5s
        if (balance >=5){
            numberOfFive = (int)(balance/ 5);
            balance -= numberOfFive * 5;
            System.out.println(numberOfFive+" "+ "GH\u20B55");
        }
        //checks for 2s
        if (balance >=2){
            numberOfTwo = (int)(balance/ 2);
            balance -= numberOfTwo * 2;
            System.out.println(numberOfTwo + " "+"GH\u20B52");
        }
        //checks for 1s
        if (balance >=1){
            numberOfone = (int)(balance/ 1);
            balance -= numberOfone * 1;
            System.out.println(numberOfone + " "+"GH\u20B51");
        }
        //checks for 0.50s
        if (balance >=0.50){
            numberOf50p = (int)(balance/ 0.50);
            balance -=numberOf50p * 0.50;
            System.out.println(numberOf50p + " " +"GH\u20B50.50p");
        }
        //checks for 0.20s
        if (balance >=0.20){
            numberOf20p = (int)(balance/ 0.20);
            balance -= numberOf20p * 0.20;
            System.out.println(numberOf20p + " "+"GH\u20B50.20p");
        }
        //checks for 0.10s
        if (balance >=0.10){
            numberof10p = (int)(balance/ 0.10);
            balance -=numberof10p * 0.10;
            System.out.println(numberof10p +" "+ "GH\u20B50.10p");

        }
        //checks for 0.50s
        if (balance >=0.05){
            numberof5p = (int)(balance/ 0.05);
            balance -= numberof5p * 0.05;
            System.out.println(numberof5p +" "+ "GH\u20B50.05p");
        }
        //checks for 0.01s
        if (balance >=0.01){
            numberof1p = (int)(balance/ 0.01);
            balance -=numberof1p * 0.01;
            System.out.println(numberof1p +" "+ "GH\u20B50.01p");
        }  
        // return the customer change amount  
        return customerChange;

        


    }
}
  