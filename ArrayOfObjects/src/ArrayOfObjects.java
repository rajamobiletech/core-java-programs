import java.util.ArrayList;

public class ArrayOfObjects {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        Employee raja = new Employee("Raja", 100, "IT");
        Employee vinay = new Employee("Vinay", 500, "HR");
        Employee anji = new Employee("Anji", 1000, "Admin");
        employeeList.add(raja);
        employeeList.add(vinay);
        employeeList.add(anji);

        System.out.println(employeeList);
    }
}