package Module_7;

class Test{
    int a ;
    public int b ;
    private int c;
    private Test (){
        a = 10;
        b = 20 ;
        c = 30;
    }
    void setc(int i){
        c = i;
    }
    int getc(){
        return c;
    }
    public static Test createInstance(){
        // We can not access the private constructor directly 
        // so we are using a static method to return it 
        return new Test();
    }

   
}

public class M72 {
    public static void main(String[] args){
        Test t1 = Test.createInstance();
        // t1.a = 9;
        int a = t1.a;
        System.out.println("The Value of a is "+a);
        // t1.b = 10;
        int b = t1.b;
        System.out.println("The value of public integar B is "+b);
        int c = t1.getc();
        System.out.println("The Value of private integar C is "+c);
    }
    
}