public class SwitchStatement {

    public static void main(String[] args) {
        switchExample1();
        System.out.println("=================");
        switchExample2();   // Error Method
        System.out.println("=================");
        switchExample3();
    }

    public static void switchExample1() {
        String day = "wednesday";
        switch (day) {
            case "sunday":
                System.out.println("This is holiday");
                break;
            case "monday":
                System.out.println("This is work start day");
                break;
            case "wednesday":
                System.out.println("This is work mid week");
                break;
            default:
                System.out.println("Invaild input");
                break;
        }
    }

    public static void switchExample2() {
        String day = "monday";
        switch (day) {
            case "sunday":
                System.out.println("This is holiday");
            case "monday":
                System.out.println("This is work start day");
            case "wednesday":
                System.out.println("This is work mid week");
            default:
                System.out.println("Invaild input");
        }
    }

    public static void switchExample3() {
        int a = 12;
        switch (a) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            default:
                System.out.println("No matching number");
                break;
        }
    }

    /*
    // Syntax
    switch(input) {
        case value:
            //statement
            break;
        default:
            //statement
            break;
    }
     */

}
