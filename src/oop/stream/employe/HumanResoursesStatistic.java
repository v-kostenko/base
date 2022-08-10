package oop.stream.employe;

import jdk.nio.mapmode.ExtendedMapMode;
import oop.library.Library;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class HumanResoursesStatistic {

    //Вернуть ЗП всех сотрудников
    public static List<PayrollEntry> payroll(List<Employee> employeeList){
        return employeeList.stream().map((e) -> new PayrollEntry(e, e.getSalary(), (e instanceof Worker) ? ((Worker) e).getBonus() : BigDecimal.ZERO)).toList();
        }

        //подготовка заработной платы для подчиненных данного менеджера
    public static List<PayrollEntry> subordinatesPayroll(Manager manager){
        return payroll(manager.getImmediateSubordinates());
        //return manager.getImmediateSubordinates().stream().map(e -> new PayrollEntry(e, e.getSalary(), (e instanceof Worker) ? ((Worker) e).getBonus() : BigDecimal.ZERO)).toList();
    }

    //вычисления общей стоимости бонусов;
    public static BigDecimal bonusTotal(List<Employee> employees) {
        return employees.stream().map(e -> (e instanceof Worker) ? ((Worker) e).getBonus() : BigDecimal.ZERO)
                .reduce((bd1,  bd2) ->  bd1.add(bd2)).get();
    }

    //4. поиск сотрудника со старейшим стажем
    public static Employee getOldestEmployee(List<Employee> employeeList){
        return employeeList.stream().distinct().filter(e -> e instanceof Worker).min((w1, w2) -> ((Worker) w1).getEmploymentDate().compareTo(((Worker) w2).getEmploymentDate()))
                .get();
    }

    //поиск самой высокой зарплаты без бонуса (зарплата  должна быть возвращена)
    public static BigDecimal getHighestSalary(List<Employee> employeeList){
        return employeeList.stream().distinct().max((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary())).get().getSalary();
    }

    //поиск самой низкой зарплаты с бонусом (зарплата  должна быть возвращена)
    public static BigDecimal getLowestSalary(List<Employee> employeeList){
        return payroll(employeeList).stream().min((pe1, pe2) -> pe1.getSalaryPlusBonus().compareTo(pe2.getSalaryPlusBonus()))
                .get()
                .getSalaryPlusBonus();
    }

    //поиск сотрудников, фамилии которых начинаются с буквы "А" данного менеджера;
    public static List<Employee> getSurnamesEmployeeStartWith(Manager manager, String nameStartWith){
       return manager.getImmediateSubordinates().stream().distinct().filter(e -> e.getSurname().startsWith(nameStartWith)).toList();
    }

    //Поиск сотрудников, зарабатывающих более 1000 s.
    public static List<Employee> getEmployeesEarnsMoreThan(List<Employee> employeeList, BigDecimal bigDecimal){
        return employeeList.stream().distinct().filter(e ->  e.getSalary().compareTo(bigDecimal) > 0).toList();
    }

    //Сколько сотрудников, являющихся непосредственными подчиненными конкретного менеджера
    // зарабатывают более такой-то суммы?
    public static long amountEmployeesThatEarnsMoreThan(Manager manager, BigDecimal bigDecimal){

       return payroll(manager.getImmediateSubordinates()).stream().filter(pe -> pe.getSalaryPlusBonus().compareTo(bigDecimal) > 0)
                .count();
    }

    //сколько у нас сотрудников по каждой категории
    public static Map<String, Integer> howManyEmployees(List<Employee> employeeList){
        Map<String , Integer> map = new HashMap<>();

        employeeList.stream().distinct().peek(e -> {
            if (!map.containsKey(e.getClass().getSimpleName())){
                map.put(e.getClass().getSimpleName(), 1);
            } else {
                map.put(e.getClass().getSimpleName(), map.get(e.getClass().getSimpleName()) + 1);
            }
        }).toList();
        return map;
    }

    //сколько у нас сотрудников по каждой категории через Collect
    public static Map<String, Long> howManyEmployeesCollect(List<Employee> employeeList){
        return employeeList.stream().distinct().collect(Collectors.groupingBy( e -> e.getClass().getSimpleName(), Collectors.counting()));
    }

    //найти  суммы, зарабатываемые по категориям
    public static Map<String, DoubleSummaryStatistics> howMuchEachCategoryEarns(List<Employee> employeeList){
        return payroll(employeeList).stream().collect(Collectors.groupingBy(pe -> pe.getEmployee().getClass()
                .getSimpleName(), Collectors.summarizingDouble(pe -> pe.getSalaryPlusBonus().doubleValue())));
    }

    //просмотреть список сотрудников по категориям
    public static Map<String, List<Employee>> getEmployeesEachCategory(List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.groupingBy(e -> e.getClass().getSimpleName()));
    }


    //найти самую многочисленную категорию
    public static Map.Entry<String, Long> getVetyCategory(List<Employee> employeeList){
        return howManyEmployeesCollect(employeeList).entrySet().stream().max((c1, c2) -> c1.getValue().compareTo(c2.getValue())).get();
    }

    //найти сотрудникков в возрасте от и до, зарабат не менее стольки-то
    public static List<Employee> findEmployeeAge(List<Employee> employeeList, int ageFrom, int ageTo, BigDecimal salary){
        return payroll(employeeList).stream().filter(pe -> pe.getEmployee().getPersonAge() >= ageFrom && pe.getEmployee().getPersonAge() <= ageTo && pe.getSalaryPlusBonus().compareTo(salary) > 0)
                .map(pay -> pay.getEmployee()).toList();
    }

    //средний  заработок по каждой категории
    public static Map<String, Double> averageProfit(List<Employee> employeeList){
        return payroll(employeeList).stream().collect(Collectors.groupingBy(p -> p.getEmployee().getClass().getSimpleName(), Collectors.averagingDouble(pe -> pe.getSalaryPlusBonus().doubleValue())));
    }

    //принимаем сотрудников и лист имен и возвращаем фонд зарплаты на них
    public static BigDecimal fond(List<Employee> employeeList, List<String> stringList){
        return payroll(employeeList).stream().filter(p -> stringList.contains(p.getEmployee().getFirstName()))
                .map(pe -> pe.getSalaryPlusBonus())
                .reduce((pe1, pe2) -> pe1.add(pe2)).get();
    }

    //поднять зарплату  сотрудникам, зарабатывающим менее такой суммы
//    public static Map<Employee, BigDecimal> increaseSalary(List<Employee> employeeList, BigDecimal currentSalary, int percent){
//
//    }



























}
