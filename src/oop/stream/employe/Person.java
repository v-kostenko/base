package oop.stream.employe;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
    private final String firstName;
    private final String surname;
    private final Date birthDate;

    public Person(String firstName, String surname, Date birthDate) {
        this.firstName = firstName;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public int getPersonAge() {
        long birth = System.currentTimeMillis() - birthDate.getTime();
        int age =(int) (birth / 365 / 24 / 60 / 60 / 1000);
        return age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSurname(){
        return surname;
    }

    public String toString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        return getClass().getSimpleName() + " " +  firstName + " " + surname + "\nDate of Birth : " +  simpleDateFormat.format(birthDate) +
                "\nAge : " + getPersonAge();
    }






}
