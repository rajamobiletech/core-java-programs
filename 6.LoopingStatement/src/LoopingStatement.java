public class LoopingStatement {
    public static void main(String[] args) {
	/* intialization ;condition ; increment/decrement in for loop at a time
	A for loop repeats until a specified condition evaluates to false. */
        forLoopExample();
	/* While loop allows code to be executed repeatedly based on a given boolean condition
	 * It repeats the loop until condition is false*/
        whileLoopExample();
	/*do while loop execute the block of code once, before checkinh if the condition is true,
	 * then it will repeat loop until the condition is true*/
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

          // 9star pattern  
          public static void main(String[] args) {
            for(int i=1; i<=9;i++) {
            for(int j=1;j<=i;j++)  { 
                System.out.print("*");
                }
                System.out.println();
            }
        }
}
