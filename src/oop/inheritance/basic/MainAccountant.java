package oop.inheritance.basic;

public class MainAccountant extends Manager {

    public MainAccountant(double salary, Gender gender, int cabinetNumber, int subordinates){
        super(salary, 10, gender, cabinetNumber);
        setTitle("MainAccountant");
        for (int i = 0; i < subordinates; i++) {
            addSubordinates(new Accountant(500, 5, Gender.MALE, 3));
        }
    }

    public void manageAccountants(){
        System.out.println("manageAccountants");
    }

    @Override
    public void descriptionWorkFlow(){
        manageAccountants();
        manage();
    }

}
