class Outer{
    void Test(){
        Inner inner  = new Inner();
        inner.display();
    }

    class Inner{
        int inner_num = 10;
        public void display(){
            System.out.println("The Inner Varibale is "+inner_num);
        }
    }
}

/**
 * M87
 */
public class M86 {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.Test();
    }
}