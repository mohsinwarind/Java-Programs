

class A{
    A(){
        System.out.println("Hello Mohsin");
    }
    A(int a){
        this();
        System.out.println("This is "+a);
    }
}

public class M73 {
    public static void main(String[] args){
        A a = new A(10);
    }
    
}
// Nope their isn't any error and the program compiles and runs well 