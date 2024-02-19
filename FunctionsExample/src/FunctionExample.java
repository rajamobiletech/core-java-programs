public class FunctionExample {

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        Integer sum = calc.addition(4,5);
        Integer sum1 = calc.addition(4,5, 8);
        Integer sum2 = calc.addition(new int[]{2, 4, 7, 8, 3, 5});

        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);

        SimpleCalculator calc1 = new SimpleCalculator();
        Integer sum11 = calc1.addition(4,5);
        System.out.println(sum11);


    }
}
