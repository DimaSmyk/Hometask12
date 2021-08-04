package selfwork12.task03;

import selfwork12.task01.Employee;

import java.util.Comparator;

public class CompareEmpSalaryOrName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        int nameCom;
//        if (o1.getSalary() == o2.getSalary()) {
//            nameCom = o1.getName().compareTo(o2.getName());
//        }
//        return nameCom;

        if (o1.getSalary() < o2.getSalary()){
            return -1;
        }if ((o1.getSalary() == o2.getSalary())){
            nameCom = o1.getName().compareTo(o2.getName());
            return nameCom;
        }
        return 1;
    }
}
