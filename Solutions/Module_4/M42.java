package Solutions.Module_4;
import java.util.Scanner;
class M42{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        System.out.print("Enter the power upto which you want to sum the number : ");
        int power = scan.nextInt();
        int fnum = 1 , i = 0;
        while (i<power) {
            fnum *= num;
            i++;
        }
        System.out.println("Your Final Number is : "+fnum);
        scan.close();
    }

}