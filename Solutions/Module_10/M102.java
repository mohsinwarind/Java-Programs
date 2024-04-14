package Module_10;
class Animal{

    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
    void eat(){
        System.out.println("Eating Meat");
    }
    void print(){
        System.out.print("Eat With Super  : ");
        super.eat();
        System.out.print("Eat without Super : ");
        eat();
        System.out.print("Bark : ");
        bark();
    }
}


/**
 * M102
 */
public class M102 {

    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.print();
    }
    
}