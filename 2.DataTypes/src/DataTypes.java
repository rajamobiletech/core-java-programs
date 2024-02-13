public class DataTypes {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 10;
        Double v = a1.doubleValue();
        System.out.println(v);
        if(a1.equals(a)){
            System.out.println("Hi");
        }

        String ss = "Raja";
        System.out.println(ss.toUpperCase());
        long b = 2000000l;
        Long b1 = 4_29_49_67_297l;

        Integer c = b1.intValue();
        System.out.println(c);
        Integer salary = 20_00_000;
        Integer salary1 = 2000000;
        System.out.println(salary);
        System.out.println(salary1);
    }
}
