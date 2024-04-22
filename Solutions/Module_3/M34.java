package Module_3;

/**
 * M34
 */
import java.util.Scanner;
public class M34 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Temperature in Farhenite : ");
        float temp = scan.nextFloat();
        float celcius = (float) ((temp-32.0)*(5.0/9.0));
        System.out.println("-Temprature -");
        System.out.println("In Farhenite : "+temp+ " F");
        System.out.println("In Celcius : "+celcius+ " C");
        
        scan.close();
    }
}