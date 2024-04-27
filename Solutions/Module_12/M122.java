package Module_12;
import java.util.Scanner;
class Employee{
    private String name;
    private int SSN;
    private int age;
    String getName(){
        return name;
    }
    int getSSN(){
        return SSN;
    }
    int getAge(){
        return age;
    }
    void setName(String name) throws Exception{
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    void setAge(int age) throws Exception{
        if(age<0){
            throw new Exception("Age can't be zero or less than zero");
        }
        this.age = age;
    }
    void setSSN(int SSN) throws Exception{
        if(SSN <100 || SSN > 999){
            throw new Exception("SSN can't be less than 100 or greator than 999 ");
        }
        this.SSN = SSN;
    }
}


/**
 * M122
 */
public class M122 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee emp1 = new Employee();

        try {
            System.out.print("Enter the Name : ");
            emp1.setName(input.nextLine());

            System.out.print("Enter the age (must be greater than 0): ");
            emp1.setAge(input.nextInt());

            System.out.print("Enter the SSN Number (must be between 100 and 999): ");
            emp1.setSSN(input.nextInt());

            System.out.println("Your Name is " + emp1.getName());
            System.out.println("Your age is " + emp1.getAge());
            System.out.println("Your SSN number is " + emp1.getSSN());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
