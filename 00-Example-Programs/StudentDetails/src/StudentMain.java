public class StudentMain {

    public static void main(String[] args) {

        for (int i=1; i<=10; i++) {
            Student s = new Student();
            s.setName("SS-"+i);
            s.setMale(i %2 == 0 ? true : false);
            s.setClassName("Class1");
            s.setRollNumber(i);
            System.out.println(s);
        }

        System.out.println("=====================");

        for (int i=101; i<=110; i++) {
            Student r = new Student("RR-"+i, "Class2", i, i %2 != 0 ? true : false);
            System.out.println(r);
        }
    }
}
