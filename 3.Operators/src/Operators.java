public class Operators {
    public static void main(String[] args) {
        arithmeticOperations();
        logicalOperations();
        relationalOperations();
    }

    private static void relationalOperations() {
        // Relational Operators
        /*
        == :Equal-to operator ( == ) returns true if both operands have the same value; otherwise, it returns false 
        <  :Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.
        >  :Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.
        <= :Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.
        >= :Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.
        != :Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.
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
        Addition (+) :Adds two operands
        Subtraction(-) : Subtracts second operand from the first
        Multiplication(*) : Multiplies both operands
        Division(/) : Divides numerator by de-numerator gives quotient as output
        Modular(%)  : This gives remainder as output 
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
