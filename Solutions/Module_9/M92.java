package Solutions.Module_9;

class A{
    public int a;
    private int b;
    int getb(){
        return b;
    }
    void setb(int b){
        this.b  = b;
    }

}
class B extends A{
  void display(){
    System.out.println("The Value of A is  : "+a);
    System.out.println();
    System.out.println("The Value of B is : "+getb());
  }  
}
/**
 * M92
 */
public class M92 {
    
    public static void main(String[] args) {
        B obj = new B();
        obj.a = 10;
        obj.setb(100);
        obj.display();
    }
    
}