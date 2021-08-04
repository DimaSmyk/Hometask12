package selfwork12.task02;

import selfwork12.task01.Employee;

import java.util.Comparator;

public class CompareEmpSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());

//        if (o1.getSalary() < o2.getSalary()){
//            return -1;
//        }if ((o1.getSalary() == o2.getSalary())){
//            return 0;
//        }
//        return 1;
    }
}
