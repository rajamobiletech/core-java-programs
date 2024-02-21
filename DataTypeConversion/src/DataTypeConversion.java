public class DataTypeConversion {
    public static void main(String[] args) {
        // Widening (byte<short<int<long<float<double)
        int i = 1000000000;                   //int--> long
        long l = i;                                   //automatic type conversion
        System.out.println(l);

        // Narrowing
        double d = 10.02;
        long l1 = (long)d;                       //explicit type casting
        System.out.println(l1);

        long big = 18923376384L;
        int small = (int)big;                       //explicit type casting
        System.out.println(small);

        String bigStr = String.valueOf(big);
        System.out.println("Big String="+bigStr);

        String empId = "8976387";
        Integer empIdNumber  = Integer.valueOf(empId);
        System.out.println(empIdNumber);

        int empIdNum = Integer.parseInt(empId);
        System.out.println(empIdNum);

    }
}
