package Solutions.Module_4;
import java.util.Scanner;
public class M45{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the Number for First time : ");
        int num= scan.nextInt();
        while(true){
         if(num%3==0){
            System.out.println("Yes! You reached end.");
            break;
         }
         System.out.print("Enter the Number again : ");
         num=scan.nextInt();
        }
    
    scan.close();
      }
    
}