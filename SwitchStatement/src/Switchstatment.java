public class Switchstatment {
    public static void main(String[] args) {
        /* Switch Statement: Instead of writing many if..else statements, you can use the switch statement.
                The switch expression is evaluated once.
                The value of the expression is compared with the values of each case.
                 If there is a match, the associated block of code is executed.
                 The break and default keywords are optional
            Break : Break keyword is used to jump out from switch statement
         */
        /* SYTAX
            switch(expression) {
                case x:
                    // Statements
                    break;
                case y:
                    // Statements
                    break;
                 default:
                    // Statements
              }

         */
        switchexample();
        switchexample2();

    }
    public static  void switchexample(){
        int a=12;
        switch (a) {
            case 1:
                System.out.println("month is january");
                break;
            case 2:
                System.out.println("month is Febraury");
                break;
            case 3:
                System.out.println("month is March");
                break;
            case 4:
                System.out.println("month is April");
                break;
            case 5:
                System.out.println("month is may");
                break;
            case 6:
                System.out.println("month is june");
                break;
            case 7:
                System.out.println("month is july");
                break;
            case 8:
                System.out.println("month is August");
                break;
            case 9:
                System.out.println("month is September");
            case 10:
                System.out.println("month is October");
                break;
            case 11:
                System.out.println("month is November");
                break;
            case 12:
                System.out.println("month is December");
                break;
            default:
                System.out.println("not a month");
        }


    }

    public static void switchexample2(){
        char Grade='B';
        switch(Grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            default:
                System.out.println("Enter the charcter between A -D");

        }


    }

}