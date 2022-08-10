package oop.stream.employe;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Date;

public abstract class Employee extends Person{
    private BigDecimal salary;
    private Manager manager;

    protected Employee(String firstName, String surname, Date birthDate, BigDecimal salary, Manager manager){
        super(firstName, surname, birthDate);
        this.salary = salary;
        this.manager = manager;
    }

    public BigDecimal getSalary(){
        return salary;
    }

    public String toString(){
        return super.toString() + "\nSalary : " + salary + "\nManager : " + manager;
    }








}
