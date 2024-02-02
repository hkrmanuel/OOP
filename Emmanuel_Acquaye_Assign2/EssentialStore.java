package Emmanuel_Acquaye_Assign2;

// import Scannr method
import java.util.Scanner;

public class EssentialStore {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner input = new Scanner(System.in);
        System.out.print("How Much Does The Item Cost?:");
        double itemCost = input.nextDouble();
        System.out.print("What is the Amount Paid By The Customer?:");
        double paidAmount = input.nextDouble();
        String output = "The Customer's Change is " + computeChangeBreakdown(itemCost, paidAmount) + " " + "\u20B5" ;
        double change =computeChangeBreakdown(itemCost, paidAmount);
        
        System.out.printf( "The Customer's Change is \u20B5%4.2f", change);
        //close Scanner object
        input.close();
    }
    //Create a method to compute the change and breakdown the denominations
    public static double computeChangeBreakdown(double costOfItems,double AmountPaid){
    
        double customerChange = Math.round((AmountPaid - costOfItems)*100.0)/100.0;
        double balance = 0;
        int numberOfTwoHundreds, numberOfHundreds, numberOfFifty, numberOfTwenty,numberOfTen, numberOfFive, numberOfTwo,numberOfone, numberOf50p, numberOf20p, numberof10p, numberof5p, numberof1p = 0;
        
        //check for each number of specific denomination available 
        if (customerChange >=200){
            numberOfTwoHundreds = (int)(customerChange / 200);
            balance += customerChange - numberOfTwoHundreds * 200;
            System.out.println(numberOfTwoHundreds + " " + "200");
        }
        else {
            balance = customerChange;
        }

        if (balance >=100){
            numberOfHundreds = (int) (balance / 100);
            balance -=(numberOfHundreds * 100);
            System.out.println(numberOfHundreds + "GH%4.2f100");
        }
        
        if (balance >=50){ 
            numberOfFifty = (int) (balance / 50);
            balance -=numberOfFifty * 50;
            System.out.println(numberOfFifty + "GH%4.2f50");
        }
        if (balance >=20){
            numberOfTwenty = (int)(balance/ 20);
            balance -=numberOfTwenty * 20;
            System.out.println(numberOfTwenty + "GH%4.2f20");
        }
        if (balance >=10){
            numberOfTen = (int)(balance/ 10);
            balance -= numberOfTen* 10;
            System.out.println(numberOfTen + "GH%4.2f10");
        }
        if (balance >=5){
            numberOfFive = (int)(balance/ 5);
            balance -= numberOfFive * 5;
            System.out.printf(numberOfFive+ "GH%4.2f5");
        }
        if (balance >=2){
            numberOfTwo = (int)(balance/ 2);
            balance -= numberOfTwo * 2;
            System.out.println(numberOfTwo + "GH%4.2f2");
        }
        if (balance >=1){
            numberOfone = (int)(balance/ 1);
            balance -= numberOfone * 1;
            
        }
        if (balance >=0.50){
            numberOf50p = (int)(balance/ 0.50);
            balance -=numberOf50p * 0.50;
        }
        if (balance >=0.20){
            numberOf20p = (int)(balance/ 0.20);
            balance -= numberOf20p * 0.20;
        }
        if (balance >=0.10){
            numberof10p = (int)(balance/ 0.10);
            balance -=numberof10p * 0.10;
        }
        if (balance >=0.05){
            numberof5p = (int)(balance/ 0.05);
            balance -= numberof5p * 0.05;
        }
        if (balance >=0.01){
            numberof1p = (int)(balance/ 0.01);
            balance -=numberof1p * 0.01;
        }  
        // return the customer change amount  
        return customerChange;

        


    }
}
  