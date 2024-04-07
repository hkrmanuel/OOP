import java.util.Scanner;

public class WhereIsMyFoodMain {
    private static Scanner input = new Scanner(System.in);
    private static Scanner usrname = new Scanner(System.in);
    private static Scanner id = new Scanner(System.in);
    private static Scanner email = new Scanner(System.in);
    private static Scanner phonenumber = new Scanner(System.in);
    private static FoodDelivery Admin = new FoodDelivery();

    private String[] menu = {" 1. View Restaurant", " 2. Account Details", " 3. View My Order" };
    
    public static void main(String[] args){
        menuDisplay();

    }

    public static void menuDisplay(){
        int usrinput;
        System.out.println("Welcome To Where Is My Food Delivery Program");
        System.out.println("1. Login");
        System.out.println("2. Signup");
        System.out.println("3. Exit");
        usrinput = input.nextInt();

        switch(usrinput){
            case 1:
                login();
                break;

            case 2:
                signup();
            case 3:
                break;
        }   
          
    }

    public static void login(){
        String usernameinput;
        String emailinput;
        String idinput;

        System.out.println("Welcome To The Login Page");
        System.out.print("1. Enter Username :");
        usernameinput = usrname.nextLine();
        System.out.print("2. Enter Ashesi ID:");
        idinput = id.nextLine();
        
        for (int s = 0; s < FoodDelivery.users.length; s++) {
            if (FoodDelivery.users[s].getUserID() != idinput){
                System.out.println("Account Does Not Exist!");
            }
        }
        
    }
    public static  boolean signup(){
        String usernameinput;
        String emailinput;
        String idinput;
        String phonenumberInput;
        
        System.out.println("Welcome To The Login Page");
        System.out.print("1. Enter Username :");
        usernameinput = usrname.nextLine();
        System.out.print("2. Enter Ashesi ID:");
        emailinput = email.nextLine();        
        System.out.print("3. Enter Ashesi Email Address :");
        idinput = id.nextLine();
        System.out.print("3. Enter Phone NUmber:");
        phonenumberInput = phonenumber.nextLine();
         return Admin.addAccount(new UserClass(usernameinput, emailinput,phonenumberInput,idinput ));
    }
} 
