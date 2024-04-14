
package Module_14;
import java.util.*;
import javax.swing.*;

/**
 * M142
 */
public class M142 {

    public static void main(String[] args) {
        
        try{
            A();
            B();
        }
        catch(Exception e){
            System.out.println("In main...");
            System.out.println(e);
        }
    }
    public static void A(){
        try {
            B();
        } catch (Exception e) {
           System.out.println("in A...");
           System.out.println(e);
        }
    }
    public static void B() throws Exception{
        C();
    }
    public static void C() throws Exception{
        throw new Exception("C is exceptional");
    }
}