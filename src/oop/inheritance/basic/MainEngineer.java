package oop.inheritance.basic;

public class MainEngineer extends Manager{

    public MainEngineer(double salary, Gender gender, int cabinetNumber, int subordinates){
        super(salary, 10, gender, cabinetNumber);
        setTitle("Main Engineer");
        for (int i = 0; i < subordinates; i++) {
            addSubordinates(new Engineer(800, 3, Gender.MALE));
        }
    }

    public void manageEngineers(){
        System.out.println("manageEngineers");
    }

    public void fix(){
        System.out.println("Fix");
    }

    @Override
    public void descriptionWorkFlow(){
        manageEngineers();
        fix();
        System.out.println("Play domino");
    }
}
