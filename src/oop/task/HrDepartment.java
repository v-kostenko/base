package oop.task;

import java.util.ArrayList;

public class HrDepartment {
    private ArrayList<Skills> vacancies = new ArrayList<>();
    private ArrayList<WorkBook> workBook = new ArrayList<>();
    private InterviewRoom interviewRoom;

    public void addVacancies(Skills vacancy) {
        vacancies.add(vacancy);
    }

    public void addWorkBook(WorkBook wb) {
        workBook.add(wb);
    }

    public void findVacancy(Applicant applicant) {
        for (int i = 0; i < vacancies.size(); i++) {
            if (applicant.getSkills() == vacancies.get(i)) {
                System.out.println("Skill is fit for vacancy.");

            }
            System.out.println("Go to warship");
        }
    }
}


