import java.util.Scanner;

// Main class for the WhereIsMyFood application
public class WhereIsMyFoodMain {
    // Scanner object for user input
    private static Scanner input = new Scanner(System.in);
    // FoodDelivery object for managing food delivery operations
    private static FoodDelivery Admin = new FoodDelivery();
    // Variables to store user input data
    private static String usernameinput;
    private static String idinput;
    private static String phonenumberInput;
    // Menu object for managing menus
    private static Menu menu1 = new Menu();
    // Array of menu options
    private static String[] menu = {" 1. View Restaurants", " 2. Account Details", " 3. View My Order" };
    public static OrderClass order = new OrderClass();
    // Main method
    public static void main(String[] args) throws Exception{
        // Boot the program
        bootprogram();
    }

    // Method to initialize the program
    public static void bootprogram(){
        int usrinput;
        // Display welcome message and options
        System.out.println("Welcome To Where Is My Food Delivery Program");
        System.out.println("1. Login");
        System.out.println("2. Exit");
        // Get user input for choice
        usrinput = input.nextInt();

        switch(usrinput){
            case 1:
                // If user chooses to login, call login method
                login();
                // After login, display the start menu
                StartmenuDisplay();
                break;

            case 2:
                // If user chooses to exit, do nothing
                break;
        }   
    }

    // Method for user login
    public static boolean login(){
        // Prompt user to enter login details
        System.out.println("Welcome To The Login Page");
        System.out.print("1. Enter Username :");
        usernameinput = input.nextLine();
        usernameinput = input.nextLine(); // Read username
        System.out.print("2. Enter Ashesi ID:");
        idinput = input.nextLine();  // Read ID
        System.out.print("3. Enter Phone Number:");
        phonenumberInput = input.nextLine();  // Read phone number
        System.out.println("");
        // Add user account with provided details
        return Admin.addAccount(new UserClass(usernameinput,phonenumberInput,idinput ));
    }

    // Method to display the start menu
    public static void StartmenuDisplay (){
        int menuselect;
        System.out.println("What Do You Like Us To Help You With Today?");
        // Display menu options
        for(int s = 0; s < menu.length; s++){
            System.out.println(menu[s]);        
        }
        // Get user input for menu selection
        System.out.print("Choice:");
        menuselect = input.nextInt();

        switch(menuselect){
            case 1:
                int restaurantselect;
                // Display restaurants available
                menu1.displayRestaurants();
                for (int i = 0; i < menu1.restaurantNames.length; i++) {
                    System.out.println(menu1.restaurantNames[i]);
                }
                // Prompt user to select a restaurant
                System.out.print("Select Restaurant: ");
                restaurantselect = input.nextInt();
                System.out.println();
                // Call method to handle restaurant selection
                selectrestaurant(restaurantselect);  
                break;

            case 2:
                // Display user accounts
                System.out.println(FoodDelivery.users.toString());
                break;

            case 3:
                
                // View user's order
                break;
        }  
    }
    
    // Method to handle restaurant selection
    public static void selectrestaurant(int restaurantselect){
        
        switch(restaurantselect){
            case 1:
                // Display menu of Munchie's
                menu1.displayMunchiesMenu();
                order.userChoice();
                break;

            case 2:
                // Display menu of Akonor
                menu1.displayAkonorMenu();
                order.userChoice();
                break;

            case 3:
                // Display menu of Big Ben
                menu1.displayBigBenMenu();
                order.userChoice();
                break;
        }  
    }        
}
