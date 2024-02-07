public class Operators {
    public static void main(String[] args) {
        arithmeticOperations();
        logicalOperations();
        relationalOperations();
    }

    private static void relationalOperations() {
        // Relational Operators
        /*
        ==
        <
        >
        <=
        >=
        !=
         */
        int a=30;
        int b=20;
        while(a <= 40){
            System.out.println("priting number 30 to 40=>"+a);
                    a++;
        }
        if((a>30 && b<40) || (b<=30 || a>15))
        {
            System.out.println("OR condition ");
        }
    }

    private static void logicalOperations() {
        // Logical Operators
        /*
        and (&&)
        or (||)
        not (!)
         */
        int a = 5;
        int b = 2;
        boolean isFood  = false;

        if(a > 4 && b < 3) {
            System.out.println("AND logic successful");
        }

        if(a >= 5 ||  b < 2) {
            System.out.println("OR logic successful");
        }

        if(!isFood) {
            System.out.println("Not logic successful");
        }
        System.out.println("=================");

    }

    public static void arithmeticOperations() {
        //Arithmetic Operators
        /*
        Addition (+)
        Subtraction(-)
        Multiplication(*)
        Division(/)
        Modular(%)
         */
        int a = 5;
        int b = 2;
        System.out.println("Addition=" + (a + b));
        System.out.println("Subtraction=" + (a - b));
        System.out.println("Multiplication=" + (a * b));
        System.out.println("Division=" + (a / b));
        System.out.println("Modular=" + (a % b));
        System.out.println("=================");
    }
}
