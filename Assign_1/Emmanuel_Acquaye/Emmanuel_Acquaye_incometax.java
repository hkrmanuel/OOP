package Assign_1;
import java.util.Scanner;
import java.util.LinkedList;


public class Emmanuel_Acquaye_incometax {
        public  static double incomeTaxCalculaor(double salary){
            double incomeTax = 0;
            double taxIncome =0;
            double netSalary = 0;
            int count = 0;

            LinkedList<Double> rates = new LinkedList<Double>();
            rates.add(0.0);
            rates.add(0.05);
            rates.add(0.10);
            rates.add(1.75);
            rates.add(0.25);
            rates.add(0.30);
            rates.add(0.35);

            if (salary >=  402){
                count += 1;
                taxIncome = salary - 402;
            }
        
            if (taxIncome >= 110){
                count += 1;
                incomeTax += 5.5;
                taxIncome = taxIncome - 110;
            }
            if (taxIncome >= 130){
                count += 1;
                incomeTax += 13;
                taxIncome = taxIncome - 130;
            }
            if (taxIncome >= 3000){
                count += 1;
                incomeTax += 525;
                taxIncome = taxIncome - 3000;
                
            }
            if (taxIncome >= 16395){
                count += 1;
                incomeTax += 4098.75;
                taxIncome = taxIncome - 16395;
            }
            if (taxIncome >= 29963){
                count += 1;
                incomeTax += 8988.90;
                taxIncome = taxIncome - 29963;
            }
            if (taxIncome >= 50000){
                count += 1;
                incomeTax += 17500;
                taxIncome = taxIncome - 50000;
            }
        
            if (count != 7){
                incomeTax += taxIncome*rates.get(count);
                netSalary = salary - incomeTax;
                
            }
        
            
            
            
            return netSalary;
        }
    public static void main(String[] args){
        
        
        Scanner input  = new Scanner(System.in);
        
        System.out.print("Enter Gross Monthly Salary:");
        double user = input.nextInt();

    
        incomeTaxCalculaor(user);
        System.out.println("Net Income : " + incomeTaxCalculaor(user));

        input.close();
    }
    
}
