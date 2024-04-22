package Module_3;

/**
 * M35
 */
import java.util.Scanner;
public class M35 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Weight (in pounds) : ");
        double weight = scan.nextDouble();
        System.out.print("Enter your height (in inches) : ");
        double inches = scan.nextDouble();
        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.println("Your BMI is : "+BMI);
        scan.close();
    }
}