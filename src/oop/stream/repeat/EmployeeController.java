package oop.stream.repeat;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

public class EmployeeController {
    //принимаем сотрудников, возвращаем сотрудников без дубликатов отсортированных по дате рождения
    public static List<Employee> getEmployeesSortedByDateOfBirth(List<Employee> employees) {
        return employees.stream().distinct().sorted((e1, e2) -> e1.getDateOfBirth().compareTo(e2.getDateOfBirth())).toList();
        //return employees.stream().distinct().sorted(Comparator.comparing(Employee::getDateOfBirth)).toList();
    }

    //найти сотрудника, зарабатывающего меньше всех
    public static Employee getEmployeeWithLowestSalary(List<Employee> employees) {
        return employees.stream().distinct().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).get();
    }

    //найти сотрудников зарабатывающих в диапазоне зарплат
    public static List<Employee> getEmployeeEarnsBetween(List<Employee> employees, double from, double to) {
        return employees.stream().distinct().filter((e) -> e.getSalary() >= from && e.getSalary() <= to).toList();
    }

    //найти список сотрудников без дублей без дистинкта и старше стольки-то лет
    public static Set<Employee> getEmplOlderThan(List<Employee> employees, int years) {
        return employees.stream().filter(e -> e.getAge() > years).collect(Collectors.toSet());
    }

    // Получить список по позациям
    public static List<Employee> getEmplByPosition(List<Employee> employees, Position position) {
        return employees.stream().distinct().filter(e -> e.getPosition().equals(position)).toList();
    }

    //найти средний возраст сотрудников такой-то должности
    public static long averageAge(List<Employee> employees, Position position) {
        long[] age = {0, 0};
        employees.stream().distinct().filter(e -> e.getPosition().equals(position)).forEach(e -> {
            age[0] += e.getAge();
            age[1]++;
        });
        return age[0] / age[1];
    }

    //принимаем список сотрудникоов и списоок должностеей и возвращаем сотрудников с этого списка
    public static List<Employee> getEmplList(List<Employee> employees, List<Position> positions) {
        return employees.stream().distinct().filter(e -> positions.contains(e.getPosition())).toList();
    }

    //находим сотрудника с самым длинным именем
    public static Employee getEmplWithVeryLongName(List<Employee> employees) {
        return employees.stream().distinct().max((e1, e2) -> e1.getName().length() - e2.getName().length()).get();
    }

    // количество сотрудников, работающее в таком-то отделе
    public static int countEmplByPosition(List<Employee> employees, int department) {
        return (int) employees.stream().distinct().filter(e -> e.getIdDepartment() == department).count();
    }

    //индексировать зарплату на определенный процент, передаваемый в ф-ю если зарплата сотружника не превышает передаваемого значения
    public static List<Employee> indexSalary(List<Employee> employees, int percent, double salary) {
        return employees.stream().distinct().peek(e -> {
            if (e.getSalary() < salary) {
                e.setSalary(e.getSalary() * ((100 + percent) / 100.0));
            }
        }).toList();
    }

    //найти сотрудников, у которых эмейлы на джимейле
    public static List<Employee> getEmplWithGmail(List<Employee> employees, String email) {
        return employees.stream().distinct().filter(e -> e.getEmails().stream().filter(s -> s.endsWith(email)).count() > 0).toList();
    }

    // сколько сотружников имеют телефоны киевстара (067  068  096 ...)
//    public static long getEmployeesPhoneOperator(List<Employee> employees, List<String> codeOperator){
//        return employees.stream().distinct().filter(e -> e.getPhones().stream().map(m -> m.substring(0, 3)).filter(t -> codeOperator.contains(t)).count() >0).count();
//    }

    //список сотрудников, имеющих от 2 до 4 телефонов
    public static List<Employee> getEmplThatHaveSeveralPhones(List<Employee> employees) {
        return employees.stream().distinct().filter(e -> e.getPhones().size() >= 2 && e.getPhones().size() <= 4).toList();
    }

    //найти средний возраст сотрудников
    public static double getAvarageAge(List<Employee> employees) {
        int[] arr = {0, 0};
        employees.stream().distinct().forEach(e -> {
            arr[0] += e.getAge();
            arr[1]++;
        });
        return arr[0] / arr[1];
    }

    //просмотреть список телефонов менеджеров
    public static List<String> getPhoneListByPosition(List<Employee> employees, Position position) {
        return employees.stream().distinct().filter(e -> e.getPosition().equals(position)).flatMap(e -> e.getPhones().stream()).toList();
    }

    //найти все эмейлы на джимейл и ...
    public static List<String> getMails(List<Employee> employees, List<String> mails) {
        return employees.stream().flatMap(e -> e.getEmails().stream()).filter(m -> mails.contains(m.split("@")[1])).toList();
    }

    //найти количество телефонов водафон у сотрудников
    public static long countMobileOperators(List<Employee> employees, List<String> code) {
        return employees.stream().flatMap(e -> e.getPhones().stream()).filter(p -> code.contains(p.substring(0, 6))).count();
    }

    //сколько сотрудником по каждой должности?
    public static Map<Position, Integer> getAmountOfEachPosition(List<Employee> employees) {
        Map<Position, Integer> map = new HashMap<>();

        employees.stream().distinct().forEach(e -> {
            if (!map.containsKey(e.getPosition())) {
                map.put(e.getPosition(), 1);
            } else {
                map.replace(e.getPosition(), map.get(e.getPosition()) + 1);
            }
        });
        return map;
    }

    //Фонд ЗП по каждой категории
    public static Map<Position, Double> getSalaryByEachPosition(List<Employee> employees) {
        Map<Position, Double> map = new HashMap<>();

        employees.stream().distinct().forEach(e -> {
            if (!map.containsKey(e.getPosition())) {
                map.put(e.getPosition(), e.getSalary());
            } else {
                map.replace(e.getPosition(), map.get(e.getPosition()) + e.getSalary());
            }
        });
        return map;
    }

    //Сколько телефонов каждого оператора
    public static Map<String, Integer> getAmountOfEachCode(List<Employee> employees) {
        Map<String, Integer> map = new HashMap<>();
        employees.stream().distinct().flatMap(e -> e.getPhones().stream()).forEach(p -> {
            String sub = p.substring(0, 6);
            if (!map.containsKey(sub)) {
                map.put(sub, 1);
            } else {
                map.replace(sub, map.get(sub) + 1);
            }
        });
        return map;
    }


}
