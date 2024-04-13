package Solutions.Module_9;

// A simple example of inheritance
// Creating a super class
class A{
    int i , j;
    void showij(){
        System.out.println("i and j : "+i+" "+j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("Value of k : "+k);
    }
    void sum(){
        System.out.println("Sum of i,j and K is "+(i+j+k));
    }
}


/**
 * M91
 */
public class M91 {
    public static void main(String[] args){
        A superobj = new A();
        B subobj  = new B();
        //Using superclass
        superobj.i = 10;
        superobj.j = 11;
        System.out.println("Content of i and j  are : ");
        subobj.showij();
        System.out.println();

        //using subclass 
        subobj.i = 7;
        subobj.j = 8;
        subobj.k = 9;
        System.out.println("Contents of Subobject are :");
        subobj.showij();
        subobj.showk();
        System.out.println();
        subobj.sum();

    }
    
}