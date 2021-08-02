package selfwork12.task01;

import selfwork12.task02.EmpComparator;
import selfwork12.task03.EmpComparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test  {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Basya", "Vasin", 1200);
        Employee emp2 = new Employee("Ann", "Karenina", 1900);
        Employee emp3 = new Employee("Dan", "Petin", 1900);
        Employee emp4 = new Employee("Fisha", "Mishin", 1500);

        List<Employee> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        System.out.println("Without compare:\n " + employees);

        //on id
        Collections.sort(employees);
        System.out.println("\nCompare by Id:\n " + employees);

        // on salary
        EmpComparator comparator = new EmpComparator();
        employees.sort(comparator);
        System.out.println("\nCompare by salary:\n " + employees);

        // if salary equals itself, compare by name
        EmpComparator2 comparator2 = new EmpComparator2();
        employees.sort(comparator2);
        System.out.println("\nCompare by salary and name:\n " + employees);

    }

}
