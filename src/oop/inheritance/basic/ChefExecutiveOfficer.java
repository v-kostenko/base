package oop.inheritance.basic;

public class ChefExecutiveOfficer extends Manager{

    public ChefExecutiveOfficer(double salary, Gender gender){
        super(salary, 15, gender, 1);
        this.setTitle("Chef Executive Officer");
        MainAccountant mainAccountant = new MainAccountant(1000, Gender.MALE, 10, 5);
        addSubordinates(mainAccountant);
        Secretarian secretarian = new Secretarian(500, 1);
        addSubordinates(secretarian);
        MainEngineer mainEngineer = new MainEngineer(1000, Gender.MALE, 20, 2);
        addSubordinates(mainEngineer);
    }

    public void makeSign(String document){
        System.out.println("Director signed document " + document);
    }

    @Override
    public void descriptionWorkFlow(){
        makeSign("Contract");
        negotiations();
        System.out.println("3. Make interview");
    }
}
