package Emmanuel_Acquaye_Assign2;
import java.util.Scanner;

public class TreasuryBills {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Initial Deposit:");
        double PrinicipalAmount = input.nextDouble();
        System.out.print("Enter The Yearly Rate:");
        double yearlyrate = input.nextDouble();
        System.out.print("Enter The Number Of Periods Per Year:");
        int PeriodsPerYear = input.nextInt();
        System.out.print("Enter The Amount Added In Each Period After First Deposit:");
        double ConstantDeposit = input.nextDouble();
        System.out.println("Enter The Number Of Periods The Investent Would Accure");
        int numberOfPeriods = input.nextInt(); 



    }
    
    public static  double computeInvestmentValue(double principal, double yrRate, int PeriodsPerYear, double ConstantDeposit, int TotalPeriods ){

    }
}

    
   
   



