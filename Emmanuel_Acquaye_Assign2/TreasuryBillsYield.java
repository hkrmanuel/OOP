package Emmanuel_Acquaye_Assign2;
import java.util.Scanner;

/**
 * This program calculates the total value and total interest of an investment
 * using the formula for Compound Interest and Value.
 */

public class TreasuryBillsYield {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the initial deposit
        System.out.print("Enter Your Initial Deposit:");
        double PrinicipalAmount = input.nextDouble();
        System.out.println("");
        System.out.print("Enter The Yearly Rate:");
        double yearlyrate = input.nextDouble();
        System.out.println("");
        System.out.print("Enter The Number Of Periods Per Year:");
        int PeriodsPerYear = input.nextInt();
        System.out.println("");
        System.out.print("Enter The Amount Added In Each Period After First Deposit:");
        double ConstantDeposit = input.nextDouble();
        System.out.println("");
        System.out.print("Enter The Number Of Periods The Investent Would Accrue:");
        int numberOfPeriods = input.nextInt();
        System.out.println("");
        double TotalInterest = 0;  
        
        // Calculate the total value of the investment and the total interest
        if (computeInvestmentValue(PrinicipalAmount, yearlyrate, PeriodsPerYear, ConstantDeposit, numberOfPeriods) > 0){
            
        
        TotalInterest = computeInvestmentValue(PrinicipalAmount, yearlyrate, PeriodsPerYear, ConstantDeposit, numberOfPeriods)-(PrinicipalAmount + ((numberOfPeriods-1) * ConstantDeposit));

        System.out.printf("The Total Value Of The Investment is \u20B5%4.2f", computeInvestmentValue(PrinicipalAmount, yearlyrate, PeriodsPerYear, ConstantDeposit, numberOfPeriods));
        System.out.println("");
        System.out.printf("The Total Interest is \u20B5%4.2f", TotalInterest);
        
        input.close();
        }
    }
    
    public static  double computeInvestmentValue(double principal, double yrRate, int PeriodsPerYear, double ConstantDeposit, int TotalPeriods ){
        double PeriodRate = (yrRate/100)/PeriodsPerYear; // Calculate the period rate
        double TotalValue =  principal; // Initialize TotalValue to the principal
        double TotalInterest = 0; // Initialize TotalInterest to 0
        
        //checks if total value is negative and displays error message
        if (TotalValue< 0){
            System.out.println("Error! You entered a negative amount."); 
        }
        else{
        TotalInterest += TotalValue * PeriodRate; // Calculate the interest for the first period
        TotalValue += TotalInterest; // Add the interest to the total value


        // Loop through the remaining periods
        for (int j = 0; j < TotalPeriods-1; j++){
            //Add the constant deposit to the total value
            TotalValue += ConstantDeposit;
            TotalInterest = TotalValue* PeriodRate; // Calculate the interest for the current period
            TotalValue += TotalInterest;  // Add the interest to the total value
            
        }
    }
    return TotalValue;  // Return the total value of the investment
    
}
}
