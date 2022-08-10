package oop.stream.employe;

import oop.library.Library;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Date dateOfBirthSuperManager = new Date(1986 - 1900, 2, 12);
        BigDecimal salarySuperManager = new BigDecimal(5000);
        Date employmentDate = new Date(2010 - 1900, 4, 5);
        Manager superManager = new Manager("Super", "Manager", dateOfBirthSuperManager
                , salarySuperManager, null, employmentDate);

        Date jHonLennonBirthDay = new Date(1987 - 1900, 4, 24);
        BigDecimal jHonLennonSalary = new BigDecimal(5000);
        Date employmentDateCto = new Date(2017 - 1900, 7, 8);
        Manager ctoMainManager = new Manager("Jhon", "Lennon", jHonLennonBirthDay, jHonLennonSalary
                , superManager, employmentDateCto);
        ctoMainManager.setBonusForWorker(new BigDecimal(100));

        Date olegPetrovBirthDay = new Date(1991 - 1900, 9, 21);
        BigDecimal olegPetrovSalary = new BigDecimal(100);
        Date startPracticeDate = new Date(2022 - 1900, 7, 1);
        Trainee olegTrainee = new Trainee("Oleg", "Petrov", olegPetrovBirthDay
                , olegPetrovSalary, ctoMainManager, startPracticeDate, 14);

        Date bobBirthday = new Date(1910 - 1900, 3, 12);
        BigDecimal bobSalary = new BigDecimal(1500);
        Date bobEmploymentDate = new Date(2022 - 1900, 2, 23);
        Worker bobWorker = new Worker("Bob", "Serbion", bobBirthday, bobSalary
                , ctoMainManager, bobEmploymentDate);
        bobWorker.setBonusForWorker(new BigDecimal(300));

        Date jhonBirthday = new Date(1981 - 1900, 5, 15);
        BigDecimal jhonSalary = new BigDecimal(1700);
        Date jhonEmploymentDate = new Date(2021 - 1900, 5, 27);
        Worker jhonWorker = new Worker("Jhon", "Sale", jhonBirthday, jhonSalary
                , ctoMainManager, jhonEmploymentDate);
        jhonWorker.setBonusForWorker(new BigDecimal(500));

        Date carlBirthday = new Date(1989 - 1900, 9, 19);
        BigDecimal carlSalary = new BigDecimal(2600);
        Date carlEmploymentDate = new Date(2019 - 1900, 7, 29);
        Worker carlWorker = new Worker("Carl", "S Karl Surn", carlBirthday, carlSalary
                , ctoMainManager, carlEmploymentDate);
        carlWorker.setBonusForWorker(new BigDecimal(1000));

        ctoMainManager.addImmediateSubordinates(carlWorker);
        ctoMainManager.addImmediateSubordinates(jhonWorker);
        ctoMainManager.addImmediateSubordinates(bobWorker);
        ctoMainManager.addImmediateSubordinates(olegTrainee);

        //---------------------------------------------

        Date financeBirthDay = new Date(1989 - 1900, 10, 14);
        BigDecimal financeSalary = new BigDecimal(1000);
        Date employmentDateCfo = new Date(2018 - 1900, 8, 18);
        Manager cfoMainManager = new Manager("CFO Manager", "Petrova", financeBirthDay, financeSalary
                , superManager, employmentDateCfo);
        cfoMainManager.setBonusForWorker(new BigDecimal(100));

        Date mykolaBirthDay = new Date(1990 - 1900, 8, 22);
        BigDecimal mykolaSalary = new BigDecimal(100);
        Date startPracticeDateMykola = new Date(2022 - 1900, 8, 10);
        Trainee mykolaTraineeFinance = new Trainee("Mykola", "Mykolayiv", mykolaBirthDay
                , mykolaSalary, cfoMainManager, startPracticeDateMykola, 20);

        Date workerBirthday = new Date(1985 - 1900, 3, 19);
        BigDecimal workerSalary = new BigDecimal(5);
        Date workerEmploymentDate = new Date(2021 - 1900, 5, 27);
        Worker worker = new Worker("Worker", "Worker_cfo_Surname", workerBirthday, workerSalary
                , cfoMainManager, workerEmploymentDate);
        worker.setBonusForWorker(new BigDecimal(5));

        Date elenaBirthday = new Date(1984 - 1900, 5, 1);
        BigDecimal elenaSalary = new BigDecimal(100000);
        Date elenaEmploymentDate = new Date(1970 - 1900, 5, 27);
        Worker elena = new Worker("Elena", "Elena Surn", elenaBirthday, elenaSalary
                , cfoMainManager, elenaEmploymentDate);
        elena.setBonusForWorker(new BigDecimal(10));

        List<Employee> allEmployeeList = new ArrayList<>();
        Collections.addAll(allEmployeeList, superManager, ctoMainManager, olegTrainee, bobWorker, jhonWorker
                , carlWorker, cfoMainManager, mykolaTraineeFinance, worker, elena);

        // HumanResoursesStatistic.payroll(allEmployeeList).forEach(p -> System.out.println(p + "\n"));

        //HumanResoursesStatistic.subordinatesPayroll(ctoMainManager).forEach(pe -> System.out.println(pe));

       //BigDecimal total = HumanResoursesStatistic.bonusTotal(ctoMainManager.getImmediateSubordinates());
       // System.out.println(total);

//       Employee oldestEmployee = HumanResoursesStatistic.getOldestEmployee(allEmployeeList);
//        Worker oldesWworker = (Worker) oldestEmployee;
//
//        System.out.println(oldestEmployee.getFirstName() + " " + oldestEmployee.getSurname() + " " + oldestEmployee.getPersonAge()
//                + "\n" + new SimpleDateFormat("YYYY-MM-dd").format(oldesWworker.getEmploymentDate()));

//       BigDecimal highestSalary = HumanResoursesStatistic.getHighestSalary(allEmployeeList);
//        System.out.println("highestSalary " + highestSalary);

//      BigDecimal lowestSalary =  HumanResoursesStatistic.getLowestSalary(allEmployeeList);
//        System.out.println(lowestSalary);

        //HumanResoursesStatistic.getSurnamesEmployeeStartWith(ctoMainManager, "S").forEach(e -> System.out.println(e.getFirstName() + " " + e.getSurname()));


//        HumanResoursesStatistic.getEmployeesEarnsMoreThan(allEmployeeList, new BigDecimal(4000))
//                .forEach(e -> System.out.println(e.getFirstName() + " " + e.getSurname() + " " + e.getSalary()));
//
//        long amount = HumanResoursesStatistic.amountEmployeesThatEarnsMoreThan(ctoMainManager, new BigDecimal(1000));
//        System.out.println(amount);

//        HumanResoursesStatistic.howManyEmployees(allEmployeeList).forEach((t, c) -> System.out.println(t + " " + c));
//        System.out.println();
//        HumanResoursesStatistic.howManyEmployeesCollect(allEmployeeList).forEach((t, c) -> System.out.println(t + " " + c));
//
//        HumanResoursesStatistic.howMuchEachCategoryEarns(allEmployeeList).forEach((c, m) -> System.out.println(c + " | " + m.getSum()));

        //HumanResoursesStatistic.getEmployeesEachCategory(allEmployeeList).forEach((c, l) -> System.out.println(c + " \n" + l));

//        Map.Entry<String , Long> stringLongMap = HumanResoursesStatistic.getVetyCategory(allEmployeeList);
//        System.out.println(stringLongMap.getKey() + " " + stringLongMap.getValue());
//
//        HumanResoursesStatistic.findEmployeeAge(allEmployeeList, 10, 40, new BigDecimal(900)).forEach(e -> System.out.println(e.getFirstName() + " " + e.getSurname()));

      //  HumanResoursesStatistic.averageProfit(allEmployeeList).forEach((c, p) -> System.out.println(c + " " + p));

        List<String> strings = new ArrayList<>();
                strings.add("Elena");
                strings.add("Worker");

             BigDecimal fond1 = HumanResoursesStatistic.fond(allEmployeeList, strings);
        System.out.println(fond1);













    }
}
