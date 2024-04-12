class Task4{
    final int a;
    static final int b;
    static {// instance initializer block or static initializer
        b = 20;
    }
    Task4(){
        a = 10;
    }
    
}
/**
 * M83
 */
public class M84 {

    public static void main(String[] args){
        Task4 obj  = new Task4();
        System.out.println("The Value of A is "+obj.a+" and B is "+obj.b);
    }
}