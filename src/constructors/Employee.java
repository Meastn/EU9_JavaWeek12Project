package constructors;

public class Employee {
    public String name, jobTitle;
    public int ID;
    public double salary; // instance variable it belongs to Object
    // if we dont initialize fields they will carry standart values null, 0, 0.0 ie.
    public static String companyName; // static field belongs to Class objects always inherit static variables

    static {
        companyName = "CodeBulls";
    }
    public Employee () {
        salary = 10000; // when I create an Employee object with default constructor their salary will be 10000 as default
    }
    public Employee (String name, String jobTitle, int Id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;

    }


}
