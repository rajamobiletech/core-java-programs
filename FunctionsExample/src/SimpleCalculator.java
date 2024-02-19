public class SimpleCalculator {

    int a;
    int b;

    public SimpleCalculator() {
        System.out.println("Simple calculator getting initialzing");
    }

    public SimpleCalculator(int r, int t) {
        System.out.println("Simple calculator getting initialzing");
        this.a = r;
        this.b = t;
    }

    public Integer addition(Integer x, Integer y) {
        System.out.println("A====>"+a);
        System.out.println("B====>"+b);
        return x + y;
    }

    public Integer addition(Integer a, Integer b, Integer c) {
        return a + b-c;
    }

    public Integer addition(int[] a) {
        Integer sum = 0;
        for(int num: a){
            sum += num;
        }
        return sum;
    }
}
