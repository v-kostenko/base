package oop.stream.repeat;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

enum Position {
    DRIVER, ACCOUNTANT, ENGINEER;
}

public class Employee {
    private String name;
    private List<String> phones;
    private List<String> emails;
    private int idDepartment;
    private Position position;
    private double salary;
    private Date dateOfBirth;
    private Date employmentDate;

    public Employee(String name, List<String> phones, List<String> emails, int idDepartment, Position position,
                    double salary, Date dateOfBirth, Date employmentDate) {
        this.name = name;
        this.phones = phones;
        this.emails = emails;
        this.idDepartment = idDepartment;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.employmentDate = employmentDate;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public List<String> getEmails() {
        return emails;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public Position getPosition() {
        return this.position;
    }

    public double getSalary() {
        return this.salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getEmploymentDate() {
        return this.employmentDate;
    }

    public long getAge(){
        return (System.currentTimeMillis() - this.dateOfBirth.getTime()) / 365 / 24 / 60 / 60 / 1000;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }


    @Override
    public int hashCode() {
        int hashCode = 7;
        hashCode = hashCode * 7 + name.hashCode();
        hashCode = hashCode * 7 + position.hashCode();
        hashCode = hashCode * 7 + dateOfBirth.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee temp = (Employee) object;
        return this.name.equals(temp.name) && this.dateOfBirth.equals(temp.dateOfBirth) && this.position.equals(temp.position);
    }

    @Override
    public String toString() {
        StringBuilder phonesString = new StringBuilder("\nPhones: \n");
        phones.forEach(p -> phonesString.append(p + "\n"));

        StringBuilder emailsBuilder = new StringBuilder("\nEmails: \n");
        emails.forEach(e -> emailsBuilder.append(e + "\n"));
        return "Name: " + name + phonesString + emailsBuilder +
                "\nDepartment: " + idDepartment + "\nPosition: " + position + "\nSalary: " + salary +
                "\nDate of birth: " + dateOfBirth + "\nEmployment day: " + employmentDate + "\n_____________";
    }
}
