package kegj002.projects.commerce.store.src;

public class Employee
{
    //# Static-fields
    private static int counter = 0;


    //# Fields
    private final int employeeNumber;


    //# Constructors
    Employee() {
        this.employeeNumber = Employee.counter ++;
    }


    //# Getter-methods
    public int getEmployeeNumber() {
        return this.employeeNumber;
    }
}
