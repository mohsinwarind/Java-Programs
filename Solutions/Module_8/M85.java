//Demonstrating an inner class
class Outer{
    int outer_x = 100;
    void test(){
        Inner inner =  new Inner();
        inner.display();
    }
    //Here is the inner class 
    class Inner {
        void display(){
            System.out.println("Outer_X Display : "+outer_x);
        }
    }
    
   
}
class M85 {
    public static void main(String[] args){
        Outer outer  = new Outer();
        outer.test();
    }
    
}
