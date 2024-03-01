public class CompanyExample {
    public static void main(String[] args) {


        Employee emp = new Employee("Raja", "IT", 100, 10);
        emp.bonusCalculation();
        System.out.println(emp);

        System.out.println("====================");

        Programmer programmer = new Programmer("Rajitha", "Java", 500, 3);
        programmer.setIde("Visual Code");
        programmer.bonusCalculation();
        System.out.println(programmer);

        System.out.println("========================");

        HR hr=new HR("RAM","HR",2000,10);//
        // ("INTELLI J");
        hr.setPhone(1286482927376L);
        System.out.println(hr);
        System.out.println(hr.getPhone());
        hr.phoneNumber();
    }
}
