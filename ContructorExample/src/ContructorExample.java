public class ContructorExample {

    public static void main(String[] args) {

        Employee raja = new Employee(1, "raja", "", 10000l, "3423423434");
        System.out.println(raja);

        Employee rajitha = new Employee();
        rajitha.setSalary(234234324l);
        System.out.println(rajitha);
        rajitha.getSalary();
    }
}
