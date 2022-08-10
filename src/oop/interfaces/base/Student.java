package oop.interfaces.base;

public class Student extends Person implements Sportsman, Musician{
    private String university;
    private int studId;
    private String sport;
    private String instrument;

    public Student(String university, int studId, int personId, String personAddress, String humanName, String sport,
                   String instrument){
        super(personId, personAddress, humanName);
        this.university = university;
        this.studId = studId;
        this.sport = sport;
        this.instrument = instrument;
    }

    public void studyStudent(){
        System.out.println("Study student");
    }

    public void train(){
        System.out.println(getClass().getSimpleName() + " " +  humanName + " is training " + sport);
    }

    public void playMusic(){
        System.out.println(humanName + " " + getClass().getSimpleName() + " is playing music " + instrument);
    }

    @Override
    public void warmUp(){
        System.out.println(getClass().getSimpleName() + " is warming Up");
    }


}
