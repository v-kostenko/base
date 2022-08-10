package oop.inheritance.basic;

public abstract class Position {
    private String title;
    private double salary;
    private double experience;
    private Gender gender;

    public Position(String title, double salary, double experience, Gender gender) {
        this.title = title;
        this.salary = salary;
        this.experience = experience;
        this.gender = gender;
    }

    public abstract void descriptionWorkFlow();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public double getExperience() {
        return experience;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return getTitle() + " " + salary + " " + experience + " " + gender;
    }
}
