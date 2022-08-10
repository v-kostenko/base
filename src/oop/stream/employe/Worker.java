package oop.stream.employe;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Worker extends Employee{
    private Date employmentDate;
    private BigDecimal bonus;

    public Worker(String firstName, String surname, Date birthDate, BigDecimal salary
            , Manager manager, Date employmentDate){
        super(firstName, surname, birthDate, salary, manager);
        this.employmentDate = employmentDate;
    }

    public Date getEmploymentDate(){
        return employmentDate;
    }

    public BigDecimal getSalaryPlusBonus(){
        return bonus = bonus.add(getSalary());
    }

    public void setBonusForWorker(BigDecimal bonus){
        this.bonus = bonus;
    }

    public BigDecimal getBonus(){
        return bonus;
    }

    public String toString(){
        return  super.toString() + "\nEmployment Date : " + new SimpleDateFormat("YYYY-MM-dd").format(employmentDate);
    }





}
