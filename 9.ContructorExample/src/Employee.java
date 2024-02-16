
public class Employee {
    private Integer idNumber;
    private String firstName;
    private String lastName;
    private Long salary;
    private String phoneNumber;

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Employee(Integer idNumber, String firstName, String lastName, Long salary, String phoneNumber) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public Employee(Integer idNumber, String firstName, String lastName, Long salary) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idNumber=" + idNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
