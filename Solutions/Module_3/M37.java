//Rock , Paper , and Scissor Game
package Module_3;
import java.util.Scanner;
import java.util.Random;
/**
 * M37
 */
public class M37 {

    public static void main(String[] args) {
        String personPlay;
        String computerPlay;
        int computerInt;
        Scanner scan  = new Scanner(System.in);
        Random generator = new Random();
        System.out.print("Enter your play : R , P, or S : ");
        personPlay = scan.nextLine();
        personPlay = personPlay.toUpperCase();
        computerInt = generator.nextInt(3);
        if (computerInt == 0) {
            computerPlay = "R";
        }
        else if(computerInt == 1 ){
            computerPlay = "P";
        }
        else{
            computerPlay = "S";
        }
        System.out.println("Compuer Entered : "+computerPlay);
        if (personPlay.equals(computerPlay)) { 
            System.out.println("It's a Tie!");
        } else if (personPlay.equals("S") && computerPlay.equals("R")) {
            System.out.println("You lost");
        } else if (personPlay.equals("R") && computerPlay.equals("S")) {
            System.out.println("You Won");
        } else if (personPlay.equals("S") && computerPlay.equals("P")) {
            System.out.println("You Won");
        } else if (personPlay.equals("P") && computerPlay.equals("S")) {
            System.out.println("You Lost");
        } else if (personPlay.equals("P") && computerPlay.equals("R")) {
            System.out.println("You Won");
        } else if (personPlay.equals("R") && computerPlay.equals("P")) {
            System.out.println("You Lost");
        }
    scan.close();
} }