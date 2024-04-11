class calculate{
    public static double cube(double n){
        return n*n*n;
    }
}
/**
 * M76
 */
public class M76 {

    public static void main(String[] args){
        System.out.println(calculate.cube(2));
        // see in static method we don't need to make an object , we
        // can call the method directly without making the object.
    }
}