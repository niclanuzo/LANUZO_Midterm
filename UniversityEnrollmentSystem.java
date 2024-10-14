// Base class Person
class Person {
    // Fields
    protected String name;
    protected int age;
    
    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student inheriting from Person
class Student extends Person {
    // Fields
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000;  // Constant field
    
    // Constructor to initialize student-specific fields and parent class fields
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age);  // Call the parent class constructor
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }
    
    // Method to calculate total fees for the student
    public double calculateFees() {
        return units * feePerUnit;
    }
    
    // Overriding displayInfo method to show student-specific details
    @Override
    public void displayInfo() { 
        super.displayInfo();  // Call the base class displayInfo() method
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

// Subclass Instructor inheriting from Person
class Instructor extends Person {
    // Fields
    private String employeeID;
    private String department;
    private double salary;
    
    // Constructor to initialize instructor-specific fields and parent class fields
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);  // Call the parent class constructor
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
    // Overriding displayInfo method to show instructor-specific details
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call the base class displayInfo() method
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Demonstrating polymorphism with printDetails method
public class UniversityEnrollmentSystem {
    // Method that accepts a Person object and calls the appropriate displayInfo method
    public static void printDetails(Person p) {
        p.displayInfo();
        System.out.println();  // Adding a line break after each person's details
    }

    // Test program
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Dexter", 20, "231000323", "Mechanical Engineering", 12);
        Student student2 = new Student("Nicole", 19, "231000329", "Computer Engineering", 10);
        
        // Creating Instructor objects
        Instructor instructor1 = new Instructor("Engr.Tanya", 22, "CPE 211", "College of Engineering ", 100000);
        Instructor instructor2 = new Instructor("Engr. Eric", 28, "S5101", "College of Engineering", 200000);
        
        // Using the printDetails method to display information
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}
