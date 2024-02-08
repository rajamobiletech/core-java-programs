public class LoopingStatement {
    public static void main(String[] args) {
	/* intialization ;condition ; increment/decrement in for loop at a time
	A for loop repeats until a specified condition evaluates to false. */
        forLoopExample();
	/*  */
        whileLoopExample();
        doWhileExample();
    }

    private static void doWhileExample() {
        int b = 10;
        do {
            System.out.println("Do-While==>"+b);
            b++;
        }while (b>20);
        System.out.println("do While is completed");
        System.out.println("==================");
    }

    private static void whileLoopExample() {
        int a = 10;
        while (a>20) {
            System.out.println("While==>"+a);
            a++;
        }
        System.out.println("While is completed");
        System.out.println("==================");
    }

    private static void forLoopExample() {
        for (int i =0; i<=20; i++) {
            System.out.println("For==>"+i);
        }
        System.out.println("==================");
    }
}
