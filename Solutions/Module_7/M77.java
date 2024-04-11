class Counter{
    // int count = 0 ; Making it static according to the condition 
    static int count = 0 ;
    public void IncCounter(){
        count++;
        System.out.println(count);
    }
}
public class M77{
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.IncCounter();
        Counter c2 = new Counter();
        c2.IncCounter();
        Counter c3 = new Counter();
        c3.IncCounter();
    }
}