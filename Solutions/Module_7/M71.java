package Module_7;

class Test{
    int a ;
    public int b ;
    private int c;

    void setc(int i){
        c = i;
    }
    int getc(){
        return c;
    }
}

public class M71 {
    public static void main(String[] args){
        Test t1 = new Test();
        t1.a = 9;
        int a = t1.a;
        System.out.println("The Value of a is "+a);
        t1.b = 10;
        int b = t1.b;
        System.out.println("The value of public integar B is "+b);
        t1.setc(32);
        int c = t1.getc();
        System.out.println("The Value of private integar C is "+c);
    }
    
}