
class Student {
    int RollNo;
    String Name;
    double Fee;
    String Course;

    Student(int RollNo, String Course, String Name) {
        this.RollNo = RollNo;
        this.Name = Name;
        this.Course = Course;
    }

    Student(double Fee) {
        this(0, "Unknown", "Unknown");
        this.Fee = Fee;
    }
}

public class M75 {

    public static void main(String[] args){
        Student s1 = new Student(24, "Computer Science", "Mohsin");
        Student s2 = new Student(23.4);
        
        System.out.println("Your Roll no is : "+s1.RollNo);
        System.out.println("Your name is : "+s1.Name);
        System.out.println("Your Fee is :" + s1.Fee);
        System.out.println("Your Course is : "+s1.Course);
        
        System.out.println("Your Roll no is : "+s2.RollNo);
        System.out.println("Your name is : "+s2.Name);
        System.out.println("Your Fee is :" + s2.Fee);
        System.out.println("Your Course is : "+s2.Course);
    }
}
