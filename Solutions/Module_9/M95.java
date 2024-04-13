import java.util.Scanner;

// Employee class
class Employee {
    String name;
    int id;

    // Method to get data from user
    void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter id: ");
        id = scanner.nextInt();
    }

    // Method to display data
    void putData() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


class RegularEmployee extends Employee {
    double basicSalary;

    // Method to get data from user
    void getData() {
        super.getData(); // Call getData method of superclass
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        basicSalary = scanner.nextDouble();
    }

    // Method to display data
    void putData() {
        super.putData(); // Call putData method of superclass
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class HourlyEmployee extends Employee {
    double hourlyRate;
    double noOfHours;

    // Method to get data from user
    void getData() {
        super.getData(); // Call getData method of superclass
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hourly rate: ");
        hourlyRate = scanner.nextDouble();
        System.out.print("Enter number of hours worked: ");
        noOfHours = scanner.nextDouble();
    }

    // Method to display data
    void putData() {
        super.putData(); // Call putData method of superclass
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Number of Hours Worked: " + noOfHours);
    }

    // Method to calculate salary
    double calculateSalary() {
        return hourlyRate * noOfHours;
    }
}


public class M95 {
    public static void main(String[] args) {
        // Creating objects of RegularEmployee and HourlyEmployee classes
        RegularEmployee regularEmployee = new RegularEmployee();
        HourlyEmployee hourlyEmployee = new HourlyEmployee();

        
        System.out.println("Enter Regular Employee Details:");
        regularEmployee.getData();

        
        System.out.println("\nEnter Hourly Employee Details:");
        hourlyEmployee.getData();

        System.out.println("\nRegular Employee Details:");
        regularEmployee.putData();

        System.out.println("\nHourly Employee Details:");
        hourlyEmployee.putData();

        
        System.out.println("\nHourly Employee Salary: $" + hourlyEmployee.calculateSalary());
    }
}

// Completed Module  9 :))))