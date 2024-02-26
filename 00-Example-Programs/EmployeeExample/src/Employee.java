
public class Employee {
    /*
        Employee: Employee is a class with private variables
     */
   private String employeeName;
   private String dept;
    private Integer salary;
    private Integer bonus;

    /*
        Creating parameterized Constructor for Employee
        this keyword: used to call the constructor of the current class
     */

    public Employee(String employeeName, String dept, Integer salary, Integer bonus) {
        this.employeeName = employeeName;
        this.dept = dept;
        this.salary = salary;
        this.bonus = bonus;
    }
    /*
        get method to return the variable 
     */

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDept() {
        return dept;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }

    public void bonusCalculation(){
        //return Salary;
        System.out.println("Bonus calculation method called ");
    }
}