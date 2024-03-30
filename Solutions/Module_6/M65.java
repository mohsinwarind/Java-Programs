
import java.util.Scanner;

public class M65{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1,num2,num3 , num4;
        System.out.print("Enter the value of Num 1 : ");
        num1 = scan.nextFloat();
        System.out.print("Enter the value of Num 2 : ");
        num2 = scan.nextFloat();
        System.out.print("Enter the value of Num 3 : ");
        num3 = scan.nextFloat();
        System.out.print("Enter the value of Num 4 : ");
        num4 = scan.nextFloat();
        float min1 = Math.min(num1, num2);
        float min2 = Math.min(num3, num4);
        float min = Math.min(min1 , min2);
        System.out.println("The Minimum Number is "+ min);
        scan.close();
    }
}