package Solutions.Module_4;
import java.util.Scanner;
class M41{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        System.out.print("Enter the power upto which you want to sum the number : ");
        int power = scan.nextInt();
        int fnum = 1;
        for(int i=0 ; i<power ; i++){
            fnum *= num;
        }
        System.out.println("Your Final Number is : "+fnum);
        scan.close();
    }

}