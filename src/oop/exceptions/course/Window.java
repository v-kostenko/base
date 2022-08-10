package oop.exceptions.course;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Window {
    private ArrayList<Course> courses = new ArrayList<>();
    private int currentCource;
    private Scanner scanner = new Scanner(System.in);
    private static final int PASSWORD = 1234;

    public Window() {
        Course java = new Course("JAVA", "Petro Petrov", 3, 5);
        Course javaScript = new Course("JAVA SCRIPT", "Ivan Ivanov", 3, 5);
        Course python = new Course("PYTHON", "Sergii Sergiev", 3, 5);
        courses.add(java);
        courses.add(javaScript);
        courses.add(python);
        Student student1 = new Student(10, "Bob");
        Student student2 = new Student(11, "Tom");
        Student student3 = new Student(12, "Bill");
        try {
            courses.get(0).addStudent(student1);
            courses.get(0).addStudent(student2);
            courses.get(0).addStudent(student3);
        } catch (StudentException e){
            e.getMessage();
        } catch (CourseException c){
            c.getMessage();
        }
        menu();
    }

    private void menu() {
        while (true) {
            try {
                System.out.println("1.Select course \n2.Sign to the course \n3.Start course \n4.Complete course \n5.Stop program");
                int result = scanner.nextInt();
                switch (result) {
                    case 1 -> selectCourse();
                    case 2 -> signToTheCourse();
                    case 3 -> startCourse();
                    case 4 -> completeCourse();
                    case 5 -> System.exit(0);
                }
            } catch (CourseException courseException) {
                System.out.println(courseException.getMessage());
            } catch (StudentException studentException) {
                System.out.println(studentException.getMessage());
            } catch (InputMismatchException inputMismatchException){
                System.out.println("Input correct data");
                scanner = new Scanner(System.in);
            }
        }
    }

    private void selectCourse() {
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + " " + courses.get(i));
        }
        System.out.println("Select number of course");
        int number = scanner.nextInt();
        currentCource = number - 1;
    }

    private void signToTheCourse() throws CourseException, StudentException {
        System.out.println("Input ID");
        int id = scanner.nextInt();
        System.out.println("Input name");
        String name = scanner.next();
        Student student = new Student(id, name);
        courses.get(currentCource).addStudent(student);
        System.out.println(student + " was added to the course " + courses.get(currentCource).getTitle() +
               "\nAmount students: " + courses.get(currentCource).getAmountOfStudents());
    }

    private void startCourse() throws CourseException {
        int enteredPassword = 0;
        while (enteredPassword != PASSWORD) {
            System.out.println("Input password");
            enteredPassword = scanner.nextInt();
            if (enteredPassword != PASSWORD) {
                System.out.println("Invalid password");
            }
        }
        System.out.println("Password is correct");
        courses.get(currentCource).startCourse();
        System.out.println("Course was succsesful started");

    }

    private void completeCourse() throws CourseException {
        courses.get(currentCource).completeCourse();
        System.out.println("Course had been completed");
    }
}
