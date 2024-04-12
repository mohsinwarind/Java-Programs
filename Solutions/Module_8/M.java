class A{
    int i=50 ;
    @Overrideprotected void finalize() throws Throwable{
        System.out.println("From Finalize Method");
    }

}
public class M81{
    
}