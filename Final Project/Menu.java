import java.util.Dictionary;
import java.util.Scanner; 
import java.io.File;

public class Menu{
    public static String[] restaurantNames= {"1. Munchies", "2. Akornor", "3. Big Ben"};
    java.io.File Akornor = new java.io.File("/Users/hkrma/OneDrive/Documents/COURSES/COURSES2NDYEAR/OOP/Final Project/AkornorMenu.txt");
    
    public void displayRestaurants(){
        

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

    }

    public void displayMunchiesenu(){
        

        
        System.out.println("MUNCHIES MENU\n" + "\tCODE\t\tFOOD ITEM\t\t\t\tPRICE");
        System.out.println("--------------------------------------------------");
        System.out.println("  Brunch");
        System.out.println("\tMB01\t\tWaffles and Wings\t\tGH₵ 35");
        System.out.println("\tMB02\t\tWaffle BELT\t\t\t\tGH₵ 20");
        System.out.println("\tMB03\t\tWaffle Chicken Burger\tGH₵ 25");
        System.out.println("\tMB04\t\tRich Ghana Salad\t\tGH₵ 15");
        System.out.println("\tMB05\t\tPasta Salad\t\t\t\tGH₵ 15");
        System.out.println("\tMB06\t\tMini Hot Dog\t\t\tGH₵ 10\n");

        System.out.println("  Lunch");
        System.out.println("\tML01\t\tFried Rice Only\t\t\tGH₵ 12");
        System.out.println("\tML02\t\tPlain Rice Only\t\t\tGH₵ 10");
        System.out.println("\tML03\t\tWaakye with 2 sides\t\tGH₵ 12");
        System.out.println("\tML04\t\tJambalaya\t\t\t\tGH₵ 35");
        System.out.println("\tML05\t\tGa Kenkey\t\t\t\tGH₵ 5");
        System.out.println("\tML06\t\tFufu & Light Soup\t\tGH₵ 6");
        System.out.println("\tML07\t\tChicken Burger\t\t\tGH₵ 25");
        System.out.println("\tML08\t\tBanana Bread\t\t\tGH₵ 12");
        System.out.println("\tML09\t\tKelewele\t\t\t\tGH₵ 10");
        System.out.println("\tML10\t\tRed-Red\t\t\t\t\tGH₵ 12");
        System.out.println("\tML11\t\tOmo Tuo\t\t\t\t\tGH₵ 12");
        System.out.println("\tML12\t\tFried Sweet Potato\t\tGH₵ 12");
        System.out.println("\tML13\t\tBoiled Yam\t\t\t\tGH₵ 10");
        System.out.println("\tML14\t\tEba & Egushi\t\t\tGH₵ 3");
        System.out.println("\tML15\t\tGari Fotor\t\t\t\tGH₵ 10\n");

        System.out.println("  Supper");
        System.out.println("\tMS01\t\tIndomie Chicken\t\t\tGH₵ 20");
        System.out.println("\tMS02\t\tSingapore Noodles\t\tGH₵ 25");
        System.out.println("\tMS03\t\tFrench Fries\t\t\tGH₵ 15\n");

        System.out.println("  Protein");
        System.out.println("\tMP01\t\tBoiled Egg\t\t\t\tGH₵ 3");
        System.out.println("\tMP02\t\tGrilled Jerk Chicken\tGH₵ 10");
        System.out.println("\tMP03\t\tGrilled Chicken Wings\tGH₵ 4");
        System.out.println("\tMP04\t\tFried Red Fish\t\t\tGH₵ 10");
        System.out.println("\tMP05\t\tShrimp\t\t\t\t\tGH₵ 10");
        System.out.println("\tMP06\t\tPork Chops\t\t\t\tGH₵ 25");
        System.out.println("\tMP07\t\tSalmon in soup\t\t\tGH₵ 10");
        System.out.println("\tMP08\t\tBeef in soup\t\t\tGH₵ 10");
        System.out.println("\tMP09\t\tChicken in soup\t\t\tGH₵ 10\n\n");
    }
    public void displayAkonorMenu(){
        Scanner filescan = new Scanner(Akornor);

        System.out.println("AKONOR MENU\n" + "\tCODE\t\tFOOD ITEM\t\t\t\tPRICE");
        System.out.println("--------------------------------------------------");
        System.out.println("  Breakfast");
        System.out.println("\tAB01\t\tPancakes\t\t\t\tGH₵ 3");
        System.out.println("\tAB02\t\tFried Eggs\t\t\t\tGH₵ 3.5");
        System.out.println("\tAB03\t\tSausages\t\t\t\tGH₵ 3");
        System.out.println("\tAB04\t\tBread Bun\t\t\t\tGH₵ 3\n");

        System.out.println("  Lunch");
        System.out.println("\tAL01\t\tFried Rice\t\t\t\tGH₵ 20");
        System.out.println("\tAL02\t\tPlain Rice\t\t\t\tGH₵ 20");
        System.out.println("\tAL03\t\tJollof Rice\t\t\t\tGH₵ 20");
        System.out.println("\tAL04\t\tWaakye Rice\t\t\t\tGH₵ 20");
        System.out.println("\tAL05\t\tSpaghetti\t\t\t\tGH₵ 20");
        System.out.println("\tAL06\t\tPasta Jollof\t\t\tGH₵ 20");
        System.out.println("\tAL07\t\tFufu & Soup\t\t\t\tGH₵ 20");
        System.out.println("\tAL08\t\tBanku\t\t\t\t\tGH₵ 20");
        System.out.println("\tAL09\t\tBeans Stew & Plantain\tGH₵ 20");
        System.out.println("\tAL10\t\tRice Balls\t\t\t\tGH₵ 20");
        System.out.println("\tAL11\t\tBoiled Yam & Stew\t\tGH₵ 20");
        System.out.println("\tAL12\t\tKenkey\t\t\t\t\tGH₵ 20");
        System.out.println("\tAL13\t\tAmpesi(Boiled Plantain\tGH₵ 10\n");

        System.out.println("  Supper");
        System.out.println("\tAS01\t\tFrench Fries\t\t\tGH₵ 32");
        System.out.println("\tAS02\t\tBurger\t\t\t\t\tGH₵ 28\n");

        System.out.println("  Drinks");
        System.out.println("\tAD01\t\tBB Cocktail\t\t\t\tGH₵ 12");
        System.out.println("\tAD02\t\tBel Cola\t\t\t\tGH₵ 4");
        System.out.println("\tAD03\t\tDrinking Water (small)\tGH₵ 2");
        System.out.println("\tAD04\t\tDrinking Water (Medium)\tGH₵ 3");
        System.out.println("\tAD05\t\tDrinking Water (Large)\tGH₵ 5\n");

    }
    public void displayBigBenMenu(){
        System.out.println("BIG BEN MENU\n" + "\tCODE\t\tFOOD ITEM\t\t\t\tPRICE");
        System.out.println("--------------------------------------------------");
        System.out.println("  Breakfast");
        System.out.println("\tBB01\t\tEnglish Breakfast\t\tGH₵ 3\n");

        System.out.println("  Lunch");
        System.out.println("\tBL01\t\tFried Rice\t\t\t\tGH₵ 25");
        System.out.println("\tBL02\t\tPlain Rice\t\t\t\tGH₵ 20");
        System.out.println("\tBL03\t\tJollof Rice\t\t\t\tGH₵ 20");
        System.out.println("\tBL04\t\tWaakye Rice\t\t\t\tGH₵ 20");
        System.out.println("\tBL05\t\tVermicelli Rice\t\t\tGH₵ 20");
        System.out.println("\tBL06\t\tBraised Rice\t\t\tGH₵ 30");
        System.out.println("\tBL07\t\tFufu & Soup\t\t\t\tGH₵ 30");
        System.out.println("\tBL08\t\tBanku\t\t\t\t\tGH₵ 30");
        System.out.println("\tBL09\t\tBeans Stew & Plantain\tGH₵ 20");
        System.out.println("\tBL10\t\tRice Balls\t\t\t\tGH₵ 30");
        System.out.println("\tBL11\t\tBoiled Yam & Stew\t\tGH₵ 25");
        System.out.println("\tBL12\t\tKenkey\t\t\t\t\tGH₵ 20\n");

        System.out.println("  Supper");
        System.out.println("\tBS01\t\tSpaghetti Stir Fry\t\tGH₵ 32\n");

        System.out.println("  Drinks");
        System.out.println("\tBD01\t\tBB Cocktail\t\t\t\tGH₵ 12");
        System.out.println("\tBD02\t\tBel Cola\t\t\t\tGH₵ 4");
        System.out.println("\tBD03\t\tDrinking Water (small)\tGH₵ 2");
        System.out.println("\tBD04\t\tDrinking Water (Medium)\tGH₵ 3");
        System.out.println("\tBD05\t\tDrinking Water (Large)\tGH₵ 5");
    }
}
    

