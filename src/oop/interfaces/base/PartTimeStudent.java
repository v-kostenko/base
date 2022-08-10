package oop.interfaces.base;

public class PartTimeStudent extends Student implements Tractorist{

    public PartTimeStudent(String university, int studId, int personId, String personAddress, String humanName, String sport,
                           String instrument){
        super(university, studId, personId, personAddress, humanName, sport, instrument);
    }

    public void notStudy(){
        System.out.println("Part time student is not study");
    }

    public void drive(){
        System.out.println("PartTime student is driving");
    }

    public void fix(){
        System.out.println("PartTime student is fixing");
    }


}
