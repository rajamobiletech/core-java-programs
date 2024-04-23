public class HR extends Employee {

    private Long phone;

    public HR(String employeeName, String dept, Integer salary, Integer bonus) {
        super(employeeName, dept, salary, bonus);
    }


    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "HR{" +
                 super.toString() +
                "phone=" + phone +
                '}';
    }

    public void phoneNumber() {
        System.out.println("Employee Phone number in HR dept");
       // return phone;
    }

}
