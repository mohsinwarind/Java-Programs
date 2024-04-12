class A{
    int i=50 ;
    @Overrideprotected void finalize() throws Throwable{
        System.out.println("From Finalize Method");
    }

}
public class M81{
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();

        a1 = a2;

        System.gc();
        System.out.println("Done");
    }
}