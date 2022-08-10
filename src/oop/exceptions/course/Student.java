package oop.exceptions.course;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "ID " + id + "| Name: " + name;
    }

    public boolean equals(Object object){
        if (object == null){
            return false;
        }
        if (object == this){
            return true;
        }
        if (!(object instanceof Student)){
            return false;
        }
        Student temp = (Student) object;
        return temp.name.equals(this.name) && temp.id == this.id;
    }

    public int hashCode(){
        int hashCode = 7;
        hashCode = 7 * hashCode + this.name.hashCode();
        hashCode = 7 * hashCode + this.id;
        return hashCode;
    }
}
