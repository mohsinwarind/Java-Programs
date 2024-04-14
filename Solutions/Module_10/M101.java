package Module_10;

class Animal{
    String Color = "Black";
    String Name = "Dog";
    int quantity = 21;

}
class Cat extends Animal{
    String Color = "White";
    String Name = "Meow";
    int quantity = 32;
    void withoutSuper(){
        System.out.println("Cat Color  : "+Color);
        System.out.println("Cat Name : "+Name);
        System.out.println("Cat Quantity : "+quantity);
    }
    void usingSuper(){
        System.out.println("Cat Color  : "+super.Color);
        System.out.println("Cat Name : "+super.Name);
        System.out.println("Cat Quantity : "+super.quantity);
    }
}

/**
 * M101
 */
public class M101 {

    public static void main(String[] args) {
        Cat cat1 =  new Cat();
        System.out.println("--Without Super Keyword--");
        
        cat1.withoutSuper();

        System.out.println();


        System.out.println("--With Super Keyword--");
        
        cat1.usingSuper();
    
    }
}