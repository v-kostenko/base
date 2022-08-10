package oop.interfaces.base;

public class Person extends Human {
    private int personId;
    private String personAddress;

    public Person(int personId, String address, String humanName){
        super(humanName);
        this.personId = personId;
        this.personAddress = personAddress;
    }

    public void vote(){
        System.out.println("Vote");
    }
}
