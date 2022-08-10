package oop.stream.employe;

import java.math.BigDecimal;

public final class PayrollEntry {

    private final Employee employee;
    private final BigDecimal salaryPlusBonus;

    public PayrollEntry(Employee employee, BigDecimal salary, BigDecimal bonus){
        this.employee = employee;
        if (salary == null){
            salary = BigDecimal.ZERO;
        }
        if (bonus == null){
            bonus = BigDecimal.ZERO;
        }
        this.salaryPlusBonus = salary.add(bonus);
    }

    public Employee getEmployee(){
        return employee;
    }

    public BigDecimal getSalaryPlusBonus(){
        return salaryPlusBonus;
    }

    @Override
    public String toString(){
        return employee.getFirstName() + " " + employee.getSurname() + "\nSalary + bonus : " + salaryPlusBonus;
    }



}
