package oop.stream.employe;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Trainee extends Employee{
    private Date startPracticeDate;
    private int practiceLengthInDays;

    public Trainee(String firstName, String surname, Date birthDate, BigDecimal salary, Manager manager
            , Date startPracticeDate, int practiceLengthInDays){
        super(firstName, surname, birthDate, salary, manager);
        this.startPracticeDate = startPracticeDate;
        this.practiceLengthInDays = practiceLengthInDays;
    }

    public String toString(){
        return  super.toString() + "\nPractice starts : " + new SimpleDateFormat("YYYY-MM-dd").format(startPracticeDate)  +
                "\nPractice length (days) : " +  practiceLengthInDays;
    }
}
