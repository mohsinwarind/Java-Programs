class Task3{
    final int a;
    final int b;
    {// instance initializer block or static initializer
        b = 20;
    }
    Task3(){
        a = 10;
    }
    
}
/**
 * M83
 */
public class M83 {

    public static void main(String[] args){
        Task3 obj  = new Task3();
        System.out.println("The Value of A is "+obj.a+" and B is "+obj.b);
    }
}