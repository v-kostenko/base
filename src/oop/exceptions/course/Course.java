package oop.exceptions.course;

import java.util.HashSet;

public class Course {
    private String title;
    private String professor;
    private int minStudents;
    private int maxStudents;
    private boolean isStarted;
    private boolean isCompleted;
    private HashSet<Student> students = new HashSet<>();

    public Course(String title, String professor, int minStudents, int maxStudents) {
        this.title = title;
        this.professor = professor;
        this.minStudents = minStudents;
        this.maxStudents = maxStudents;
    }

    public int getAmountOfStudents(){
        return students.size();
    }

    public String getTitle(){
        return title;
    }

    public void addStudent(Student student) throws CourseException, StudentException {
        if (isStarted){
            throw new CourseException("Course has been already started");
        }
        if (isCompleted){
            throw new CourseException("Course already has completed");
        }
        if (students.size() >= maxStudents){
            throw new StudentException("Max student.");
        }
        students.add(student);
    }

    public void startCourse() throws CourseException{
        if(isStarted){
            throw new CourseException("Course is already started");
        }
        if (students.size() < minStudents){
            throw new CourseException("Quantity of students are not enough");
        }
        isStarted = true;
        isCompleted = false;
    }

    public void completeCourse() throws CourseException{
        if (!isStarted){
            throw new CourseException("Course is not started yet");
        }
        if (isCompleted){
            throw new CourseException("Course is competed already");
        }
        isCompleted = true;
        isStarted = false;
    }

    public String toString(){
        return "Title: " + title + "\nProfessor: " + professor + "\nMin student: " + minStudents +
        "\nMax students: " + maxStudents + "\nStatus started: " + isStarted +
        "\nStatus completed: " + isCompleted + "\nAmount students: " + students.size();
     }





}
