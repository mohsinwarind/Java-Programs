
class Student {
    int RollNo;
    String Name;
    double Fee;

    Student(int RollNo, String Name, double Fee) {
        this.RollNo = RollNo;
        this.Name = Name;
        this.Fee = Fee;
    }
}

/**
 * M74
 */
public class M74 {

    public static void main(String[] args){
        Student s1 = new Student(24, "Mohsin", 324.5);
        System.out.println("Your Roll no is : "+s1.RollNo);
        System.out.println("Your name is : "+s1.Name);
        System.out.println("Your Fee is :" + s1.Fee);

    }
}