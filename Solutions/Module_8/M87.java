class Outer{
    private int outer_num = 10;
    void Test(){
        Inner inner  = new Inner();
        inner.display();
    }

    class Inner{
        
        public void display(){
            System.out.println("The outer private Varibale is "+outer_num);
        }
    }
}

/**
 * M87
 */
public class M87 {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.Test();
    }
}