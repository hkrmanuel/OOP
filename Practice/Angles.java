import java.util.Scanner;
import java.lang.Math;
public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of the x1 angle:");
        double x1 = input.nextDouble();
        System.out.print("Enter the value of the x2 angle:");
        double x2 = input.nextDouble();
        System.out.print("Enter the value of the x3 angle:");
        double x3 = input.nextDouble();
        System.out.print("Enter the value of the y1 angle:");
        double y1 = input.nextDouble();
        System.out.print("Enter the value of the y2 angle:");
        double y2 = input.nextDouble();
        System.out.print("Enter the value of the y3 angle:");
        double y3 = input.nextDouble();
        
        double a = Math.sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)));
        double b = Math.sqrt(((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1)));
        double c = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

        double A = Math.acos((a*a-b*b-c*c)/(-2*b*c));
        double B = Math.acos((b*b-a*a-c*c)/(-2*a*c));
        double C = Math.acos((c*c-b*b-a*a)/(-2*a*b));

        System.out.println("Angle A: "+ A);
        System.out.println("Angle B: "+ B);
        System.out.println("Angle C: "+ C);
        input.close();

    }
}
