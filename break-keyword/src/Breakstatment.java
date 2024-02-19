public class Breakstatment {
    public static void main(String[] args) {
        /*
           Break :The break statement in Java terminates the loop immediately, and the control
           of the program moves to the next statement following the loop.
           It is almost always used with decision-making statements(if -else,while,for ,do -while)
           SYNTAX:
                   break;
         * */
        breakexample1();
        breakexample2(4,12);
        }

    private static void breakexample2(int start ,int end) {
        for (int i =start;i<=20;i++) {
            System.out.println(i);
            if (i == end) {
                break;

            }
        }
    }

    private static void breakexample1() {
        for(int i=0 ; i<=20 ; i++) {
            if (i == 10) {
                break;
            }
            System.out.println("Number is " + i);
        }
    }


}

