package Solutions.Module_9;

class A{
    public int a;
    private int b;
    A(){
        System.out.println("This is the Constrcutor of Class A");
    }
    int getb(){
        return b;
    }
    void setb(int b){
        this.b  = b;
    }

}
class B extends A{
    B(){
        System.out.println("This is the Constructor of Class B");
    }
  void display(){
    System.out.println("The Value of A is  : "+a);
    System.out.println();
    System.out.println("The Value of B is : "+getb());
  }  
}

/**
 * M93
 */
public class M93 {

    public static void main(String[] args) {
        B obj = new B();
        obj.a = 10;
        obj.setb(100);
        obj.display();
    }
}