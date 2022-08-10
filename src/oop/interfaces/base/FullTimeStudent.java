package oop.interfaces.base;

public class FullTimeStudent extends Student {
    private double averageAssessment;

    public FullTimeStudent(String university, int studId, int personId, String personAddress, String humanName, String sport,
                           double averageAssessment, String instrument) {
        super(university, studId, personId, personAddress, humanName, sport, instrument);
        this.averageAssessment = averageAssessment;
    }



}
