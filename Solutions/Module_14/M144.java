package Module_14;
import java.util.Scanner;

/**
 * M144
 */
public class M144 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Maximum Number : ");
        int max =  scan.nextInt();
        System.out.print("Enter the Minimum Number : ");
        int min  = scan.nextInt();
        int count = 0;
        try{
            if (min >= max){
                throw new Exception("Invalid Range : Minimum is Greater than or equal to Maximum.");
            }
            for(int  i=min ; i<=max ; i++){
                if (i%2 == 0){
                    count++;
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return  ;
        }

        System.out.println("Even Number from "+min+" to "+max+" are " +count);
    }
}