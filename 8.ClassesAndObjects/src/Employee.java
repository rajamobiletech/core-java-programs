public class Employee {
    Integer idNumber;
    String firstName;
    String lastName = "";
    Long salary;
    String phoneNumber;

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

    public String getEmployeeFullName() {
        return firstName+ " " + lastName;

    }
}
