public class ClassAndObjectExample {
    public static void main(String[] args) {
            Employee raja = new Employee();  // Creating raja employee Object
        raja.idNumber = 1;
        raja.firstName="Raja";
        raja.lastName = "Durai";
        raja.phoneNumber = "1232313";
        raja.salary = 10000l;
        System.out.println(raja);
        System.out.println(raja.getEmployeeFullName());

        Employee rajitha = new Employee();  // Creating rajitha Object
        rajitha.idNumber = 2;
        rajitha.firstName="Rajitha";
        rajitha.lastName="vardhi";
        rajitha.phoneNumber = "45555454";
        rajitha.salary = 20000l;
        System.out.println(rajitha);
        System.out.println(rajitha.getEmployeeFullName());

    }
}
