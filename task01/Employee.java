package selfwork12.task01;

public class Employee implements Comparable <Employee> {

    public String name;
    public String surname;
    public int salary;
    private final int id;
    private static int idCount = 0;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getId(){
        return id;
    }

    public Employee(String name,String surname){
        this(name,surname,1000);
    }

    public Employee(String name, String surname, int salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.id = ++idCount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        //return Integer.compare(this.id, o.id);

        if (this.id < o.id){
            return -1;
        } if (this.id == o.id){
            return 0;
        }
        return 1;
    }
}

