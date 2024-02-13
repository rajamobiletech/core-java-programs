public class BreakStatement {
    public static void main(String[] args) {
        breakExample1(8);
        breakExample1(12);
        breakExample2(12,25);
    }

    private static void breakExample1(int  a) {
        for (int i =0; i<=100; i++) {
            if(a == i) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("====================");
    }

    private static void breakExample2(int start , int end) {
        for (int  i =start; i<=100; i++) {
            System.out.println(i);
            if(end == i) {
                break;
            }
        }
        System.out.println("====================");
    }
}
