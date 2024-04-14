import java.util.Scanner;
public class Payment {

    private static int totalCost;
    public static OrderClass order1 = WhereIsMyFoodMain.order;
    private static boolean mealplan = false;

    public static int calculateTotalCost() {
        for (int i = 1; i < order1.getMyOrder().length; i++) {
            int price = Menu.prices[i-1];
            totalCost += price;
        }
        return totalCost;
    }

    public static void printReceipt() {
        System.out.println("Bill");
        System.out.println();
        System.out.println("Ordered Meals\t\t\t" + "Price");

        for (int i = 0; i < order1.getMyOrder().length; i++) {
            System.out.println(Menu.foodnames[i-1] + "\t\t\t" + Menu.prices[i-1]);
        }
        System.out.println("Total Cost: " + calculateTotalCost());
        if (mealplan){
            System.out.println("Payment Method: MEAL PLAN: "+ FoodDelivery.users.getUserID());
        }
    }

    public static void paymentMethod() {
        Scanner input = new Scanner(System.in);
        System.out.println("What payment method do you want to use?\n" + "1. Ashesi Meal Plan\n" + "2. Mobile Money");
        System.out.print("choice: ");
        int choice = input.nextInt();

        if(choice == 1) {
            OrderClass.updateStatus(true);
            FoodDelivery.users.getUserID();
            mealplan = true;

            System.out.println("Enter your meal plan password: ");
            String password = input.next();

            OrderClass.delivery();
        }
        else{
            System.out.println("This is the restaurant's merchant ID");
            OrderClass.delivery();
        }
    }

    public  void automation(){
        calculateTotalCost();
        paymentMethod();
        printReceipt();
    }
}   

    

