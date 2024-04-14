import java.util.Scanner;
public class OrderClass {
    static Scanner input = new Scanner(System.in);
    private static int NoOfItems;
    private UserClass customer;
    private String MenuItem;
    private static int[] myorder;
    public static  boolean OrderStatus;



    OrderClass(){

    }


    public static void placeOrder(){
        myorder = new int[NoOfItems];

        for (int i = 0; i < NoOfItems; i++) {
            int userOrder = input.nextInt();
            myorder[i]= userOrder;
        }
        // a method to help place the user's order


    }
    public static void userChoice() { // a method that takes the choice of the user
        System.out.println("1. Order Food");
        System.out.println("2. Choose Another Restaurant");
        System.out.println("3. Exit");

        int option = input.nextInt();
        switch(option){
            case 1: // if choice is 1, take the user's order
                System.out.print("Enter the number of orders you want to make:");
                int number = input.nextInt();
                System.out.print("Place Your Order Here( Type The Codes Of The Foods Selected):");
                NoOfItems = number;
                placeOrder();
                Payment makepayment = new Payment();
                makepayment.automation();
                break;

            case 2: // if choice is 2, display the start menu again for the user to choose another restaurant
                WhereIsMyFoodMain.StartmenuDisplay();
                break;

            case 3: // if choice is 3, exit the program
                System.out.println("Have a nice day!");
                break;
        }
    }

    /*public void addItem(int itemcode){
        for (int s =0; s < myorder.length; s++){
            if (myorder[s] == null){
                myorder[s]=item;
                break;
            }
        }
    }*/

    /* public void removeItem(int item){
        for (int s =0; s < myorder.length; s++){
            if (myorder[s] == item){
                myorder[s]= mull;
                break;
            }
        }
    } */

    public static void updateStatus(boolean status){
        OrderStatus=status;
    }

    public static void delivery(){
        if (OrderStatus){
            System.out.println("Your Food is Been Delivered");
        }
        else{
            System.out.println("Please Wait As We Process YOur Order");
        }
    }

    public int[] getMyOrder() {
        return myorder;
    }
}