import java.util.Scanner;

public class Namebev{
    public static void main (String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter Name:");

        String name = input.next();


        switch(name){
            case "Ama":
                System.out.println("Ama is a bad girl");
            break;
            case "Kweku":
                System.out.println("Kwaku is a good boy");
                break;

            case "Akwesi":
                System.out.println("Akwesi is a boy");
                break;
            
            default:
                System.out.println("Enter Name:");
        }
        input.close(); 

    }
}