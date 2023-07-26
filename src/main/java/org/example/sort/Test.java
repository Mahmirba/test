package org.example.sort;

import java.util.*;

public class Test {

    public static void main(String[] args) {


        Employee emp1 = new Employee(1, "EM1", 200);
        Employee emp2 = new Employee(2, "EM2", 100);
        Employee emp3 = new Employee(3, "EM3", 15);
        Employee emp4 = new Employee(4, "EM4", 100);
        Employee emp5 = new Employee(5, "EM5", 50);
        Employee emp6 = new Employee(6, "EM6", 90);
        Employee emp7 = new Employee(7, "EM7", 900);
        Employee emp8 = new Employee(8, "EM8", 300);

//        try {
//            List<Employee> list = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8);
//            Collections.sort(list);
//
//            list.forEach(s -> System.out.println(s));
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        Comparator<Employee> employeeComparatorName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Employee> employeeComparatorSalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        };

        List<Employee> list = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8);

        Collections.sort(list, employeeComparatorName);
        list.forEach(s -> System.out.println(s));

        Collections.sort(list, employeeComparatorSalary);
        list.forEach(s -> System.out.println(s));

    }
}
