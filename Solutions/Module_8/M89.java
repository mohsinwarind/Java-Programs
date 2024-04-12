
public class  M89{
    static class Nested_Demo {
        public void my_method() {
            System.out.println("This is my nested class");
    }
 }
    public static void main(String args[])
     {
        M89.Nested_Demo nested = new M89.Nested_Demo();
            nested.my_method();
    } 
}