public class Programmer extends Employee{

    private String ide;

    public Programmer(String employeeName, String dept, Integer salary, Integer bonus) {
        super(employeeName, dept, salary, bonus);
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "employee='" + super.toString() + '\'' +
                "ide='" + ide + '\'' +
                '}';
    }

    public void bonusCalculation(){
        //return Salary;
        System.out.println("Bonus calculation = 20%");
    }
}

