package oop.stream.employe;

import java.math.BigDecimal;
import java.util.*;

public final class Manager extends Worker{
    private List<Employee> immediateSubordinates = new ArrayList<>();
    private Set<Employee> allSubordinates = new HashSet<>();

    public Manager(String firstName, String surname, Date birthDate, BigDecimal salary
            , Manager manager, Date employmentDate){
        super(firstName, surname, birthDate, salary, manager, employmentDate);
    }

    public List<Employee> getImmediateSubordinates(){
        return this.immediateSubordinates;
    }

    public void addImmediateSubordinates(Employee employee){
        immediateSubordinates.add(employee);

        if (employee instanceof Manager){
            Manager temp = (Manager)employee;
            allSubordinates.addAll(temp.allSubordinates);
            allSubordinates.add(employee);
        }
    }


}
