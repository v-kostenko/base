package oop.interfaces.contactWindow;

public class Employee extends ContactImpl{
    private String department;
    private double salary;

    public Employee(String name, String address, int phone, String email, String type, String department, int salary){
        super(name, address, phone, email, type);
        this.department = department;
        this.salary = salary;
    }

    public void work(){
        System.out.println("I am working");
    }

    public double getSalary(){
        return this.salary;
    }

}
