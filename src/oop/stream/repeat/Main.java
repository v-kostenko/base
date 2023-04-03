package oop.stream.repeat;

import java.util.*;
import java.util.function.BiConsumer;

import static oop.stream.repeat.EmployeeController.*;

public class Main {
    public static void main(String[] args) {
        List<String> phonesList = Arrays.asList("+380661112233");
        List<String> emailsList = Arrays.asList("bod@mail.com", "bob@job.com");
        Employee employee = new Employee("Bob", phonesList, emailsList, 1, Position.ENGINEER, 3000,
                new Date(1999 - 1900, 10, 10),
                new Date(2010 - 1900, 2, 4));

        List<String> phonesListJack = Arrays.asList("+380661112288", "+380998887556", "+380503105588");
        List<String> emailsListJack = Arrays.asList("jack@gmail.com", "jack@mail.com");
        Employee employeeJack = new Employee("Jack", phonesListJack, emailsListJack, 2, Position.ACCOUNTANT, 2100,
                new Date(1991 - 1900, 9, 21),
                new Date(2015 - 1900, 9, 15));

        List<String> phonesListNick = Arrays.asList("+380669912233", "+380995587766", "+380507535588");
        List<String> emailsListNick = Arrays.asList("nick@mail.com", "nick@gmail.com");
        Employee employeeNick = new Employee("Nick", phonesListNick, emailsListNick, 3, Position.DRIVER, 900,
                new Date(1991 - 1900, 11, 1),
                new Date(2020 - 1900, 7, 14));

        List<String> phonesListSara = Arrays.asList("+380669112233", "+380509887766", "+386693335588");
        List<String> emailsListSara = Arrays.asList("sara@mail.com", "sara@job.com");
        Employee employeeSara = new Employee("Sara Mishel Parker", phonesListSara, emailsListSara, 1, Position.ENGINEER, 2200,
                new Date(1990 - 1900, 3, 8),
                new Date(2021 - 1900, 10, 10));

        List<String> phonesListAngelina = Arrays.asList("+380661765233", "+380998123766", "+380503398788");
        List<String> emailsListAngelina = Arrays.asList("angelina@mail.com", "angelina@job.com");
        Employee employeeAngelina = new Employee("Angelina", phonesListAngelina, emailsListAngelina, 2, Position.ACCOUNTANT, 1500,
                new Date(1999 - 1900, 10, 10),
                new Date(2010 - 1900, 2, 4));

        List<String> phonesListAngelina2 = Arrays.asList("+380671765233", "+380988123766", "+380733398788");
        List<String> emailsListAngelina2 = Arrays.asList("angelina@mail.com", "angelina@job.com");
        Employee employeeAngelina2 = new Employee("Angelina", phonesListAngelina2, emailsListAngelina2, 2, Position.ACCOUNTANT, 1500,
                new Date(1999 - 1900, 10, 10),
                new Date(2010 - 1900, 2, 4));

        List<Employee> employeeList = Arrays.asList(employee, employee, employeeJack, employeeJack, employeeNick, employeeSara, employeeAngelina, employeeAngelina2);

//        List<Employee> sortedList = EmployeeController.getEmployeesSortedByDateOfBirth(employeeList);
//        sortedList.forEach(e -> System.out.println(e));

//        Employee lowestSalary = EmployeeController.getEmployeeWithLowestSalary(employeeList);
//        System.out.println(lowestSalary);

//        List<Employee> employeesThatEarns = EmployeeController.getEmployeeEarnsBetween(employeeList, 2000, 3000);
//        employeesThatEarns.forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));

//        Set<Employee> employeesOlderThan = EmployeeController.getEmplOlderThan(employeeList, 30);
//        employeesOlderThan.forEach(e -> System.out.println( e.getName() + " " + e.getAge()));


//        List<Employee> employeesByPosition = EmployeeController.getEmplByPosition(employeeList, Position.ACCOUNTANT);
//        employeesByPosition.forEach(e -> System.out.println( e.getName() + " " + e.getAge() + " " + e.getPosition()));

//        long avarageAge = EmployeeController.averageAge(employeeList, Position.ACCOUNTANT);
//        System.out.println(avarageAge);

//        List<Position> positions = Arrays.asList(Position.ACCOUNTANT, Position.DRIVER);
//        List<Employee> employeeList1 = EmployeeController.getEmplList(employeeList, positions);
//        employeeList1.forEach(e -> System.out.println(e.getName() + " " + e.getPosition()));

//        Employee longName = EmployeeController.getEmplWithVeryLongName(employeeList);
//        System.out.println(longName.getName() + " = " + longName.getName().length());

//        int amount = EmployeeController.countEmplByPosition(employeeList, 2);
//        System.out.println(amount);


//        List<Employee> indexSalary = EmployeeController.indexSalary(employeeList, 10, 1000);
//        indexSalary.forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));

//        List<Employee> employees = EmployeeController.getEmplWithGmail(employeeList, "gmail.com");
//        employees.forEach(e -> System.out.println(e.getName() + " " + e.getEmails()));

//        List<Employee> employees = EmployeeController.getEmplThatHaveSeveralPhones(employeeList);
//        employees.forEach(e -> System.out.println(e.getName() + " " + e.getPhones() + "\n"));

//       double averageAge = EmployeeController.getAvarageAge(employeeList);
//        System.out.println(averageAge);

//       List<String > employeesPhones = EmployeeController.getPhoneListByPosition(employeeList, Position.ACCOUNTANT);
//       employeesPhones.forEach(e -> System.out.println(e));

//        List<String> mails = Arrays.asList("job.com", "gmail.com");
//        List<String> mailsEm = EmployeeController.getMails(employeeList, mails);
//        mailsEm.forEach(m -> System.out.println(m));

//        List<String> code = Arrays.asList("+38066", "+38099", "+38050");
//        long phoneAmount = EmployeeController.countMobileOperators(employeeList, code);
//        System.out.println(phoneAmount);

//        Map<Position, Integer> amount = EmployeeController.getAmountOfEachPosition(employeeList);
//        amount.forEach((k, v) -> System.out.println(k + " " + v));
//        amount.entrySet().forEach(e -> System.out.println( e.getKey() + " " + e.getValue()));

       Map<String, Integer> map = EmployeeController.getAmountOfEachCode(employeeList);
       map.forEach((k, v) -> System.out.println(k + " " + v));
       map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

       for ( String m: map.keySet()){

       }
//
//       Map<Position, Double> salary = EmployeeController.getSalaryByEachPosition(employeeList);
//       salary.forEach((k, v) -> System.out.println( k + " " + v));
//       salary.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));


    }
}
