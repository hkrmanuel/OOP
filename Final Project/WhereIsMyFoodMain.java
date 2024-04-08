import java.util.Scanner;

public class WhereIsMyFoodMain {
    private static Scanner input = new Scanner(System.in);
    private static Scanner usrname = new Scanner(System.in);
    private static Scanner id = new Scanner(System.in);
    private static Scanner email = new Scanner(System.in);
    private static Scanner phonenumber = new Scanner(System.in);
    private static FoodDelivery Admin = new FoodDelivery();
    private static String usernameinput;
    private static String emailinput;
    private static String idinput;
    private static String phonenumberInput;


    private static String[] menu = {" 1. View Restaurant", " 2. Account Details", " 3. View My Order" };
    
    public static void main(String[] args){
        bootprogram();

    }

    public static void bootprogram(){
        int usrinput;
        System.out.println("Welcome To Where Is My Food Delivery Program");
        System.out.println("1. Signup");
        System.out.println("2. Exit");
        usrinput = input.nextInt();

        switch(usrinput){
          

            case 1:
                signup();
                StartmenuDisplay();
                break;

            case 2:
                break;
        }   

    }

    
    
    public static  boolean signup(){
        
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

    public static void StartmenuDisplay (){
        int menuselect;
        for(int s = 0; s < menu.length; s++){
            System.out.println(menu[s]);        
        }
        menuselect = input.nextInt();

        switch(menuselect){
            case 1:
            System.out.println("Available Cafeterias");
            System.out.println();
            System.out.println("1.Munchies\n" + "At Munchies, we celebrate the rich and diverse flavors of Ghanaian cuisine, bringing you an " +
                    "authentic dining experience like no other.\nOur food establishment is your gateway to" + " savoring traditional Ghanaian " +
                    "dishes prepared with passion and expertise.");
            System.out.println();
            System.out.println("Our Specialties:\n" + "Indulge in a " + "culinary journey through Ghana with our extensive menu featuring a " +
                    "wide array of local delicacies such as Waakye, Jollof " + "Rice,\nBanku with Tilapia, Kelewele, and many more. Each dish " +
                    "is crafted using fresh, locally sourced ingredients and " + "traditional recipes passed down\nthrough generations");
            System.out.println();
            System.out.println("Pay-Per-Component:\n" + "At Munchies, we offer a unique dining experience where you have the flexibility to " +
                    "customize your meal according to your preferences. Choose\nfrom our selection of main dishes, sides, and accompaniments, " +
                    "paying only for the components you select. Whether you're craving a hearty plate\nof Fufu with light soup or prefer a " +
                    "lighter option like Kenkey with fried fish, you have the freedom to create your perfect meal.");
            System.out.println();
            System.out.println("2.Akornor\n" + "Step into our vibrant and welcoming restaurant, where the aroma of spices fills the air and the" +
                    " sounds of Ghanaian music set the mood. Our cozy\nambiance and friendly staff create the perfect atmosphere for an " +
                    "unforgettable dining experience.");
            System.out.println();
            System.out.println("Savor Every Bite:\n" + "Indulge in our extensive menu featuring a variety of mouthwatering Ghanaian dishes. " +
                    "From hearty stews and soups to flavorful rice dishes and\nsucculent grilled meats, each meal is bursting with the bold and" +
                    " exotic flavors of Ghana.");
            System.out.println();
            System.out.println("Whole Meals, Wholehearted Satisfaction:\n" + "At Taste of Ghana, we believe in serving meals as a whole, " +
                    "allowing you to enjoy the full spectrum of flavors and textures in every bite.\nWhether you're craving the comfort of fufu " +
                    "and light soup or the spicy kick of jollof rice with grilled tilapia, our whole meals promise\nwholehearted satisfaction.");
            System.out.println();
            System.out.println("3.Big Ben:\n" + "At Big Ben, we specialize in crafting mouthwatering Ghanaian local dishes using age-old. Our" +
                    " menu showcases an array of beloved classics,\nfrom aromatic fried rice to hearty Banku paired with rich, flavorful soups." +
                    " Each dish is prepared with care and attention to detail, ensuring\nan unparalleled dining experience that stays true to" +
                    " Ghanaian culinary traditions. What sets us apart is our unique dining concept – meals are\nordered as a whole, encouraging" +
                    " guests to embrace the communal spirit of sharing and togetherness. Gather around our communal tables with\nfriends and" +
                    " family, engage in lively conversations, and savor each bite as you indulge in the rich tapestry of Ghanaian flavors.");

                break;
            case 2:
                System.out.println(FoodDelivery.users.toString());
                break;

            case 3:
                break;
                
            }  
            
            
        
        
        }
} 
