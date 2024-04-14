package Module_10;
class Animal{
    Animal(){
        System.out.println("Animal Class Constructor");
    }
}

class Dog extends Animal{
    
    Dog(){
        super();
        System.out.println("Dog Class Constructor.");
    }
}


/**
 * M103
 */
public class M103 {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
    }
    
}