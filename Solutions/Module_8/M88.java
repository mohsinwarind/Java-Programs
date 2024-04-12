
class Outer{
    int outer_num = 10;
    void Test(){
        class Inner{

            public void display(){
                System.out.println("The Outer Class Varibale in method of outerclasss is "+outer_num);
            }
        }
    Inner inner = new Inner();
    inner.display();
    }
    
    
    
}

/**
 * M87
 */
public class M88 {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.Test();
    }
}