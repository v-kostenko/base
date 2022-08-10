package oop.task;
enum Skills{
    JAVA, KOTLIN, HTML, SCC, QA
}

public class Applicant {
    private String name;
    private int iq;
    private Skills skills;
    private int salary;
    private WorkBook workBook;

    public Applicant(String name, int iq, Skills skills, int salary, WorkBook workBook) {
        this.name = name;
        this.iq = iq;
        this.skills = skills;
        this.salary = salary;
        this.workBook = workBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "name='" + name + '\'' +
                ", iq=" + iq +
                ", skills=" + skills +
                ", salary=" + salary +
                ", workBook=" + workBook +
                '}';
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public WorkBook getWorkBook() {
        return workBook;
    }

    public void setWorkBook(WorkBook workBook) {
        this.workBook = workBook;
    }

    public void coding(){
        System.out.println("I'm coding!");
    }
}
