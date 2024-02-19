public class Continuestatement {
    public static void main(String[] args) {

        /* Continue: The continue statement breaks one iteration (in the loop),
            if a specified condition occurs,and continues with the next iteration in the loop.
            SYNTAX:
                continue;
            */

        continueexample1();
        continueexample2(5,15);
        continueexamole3();
        }
    private static void continueexample1() {
        for(int i=0;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("*******************");
    }

    private static void continueexample2(int start ,int end) {
        for(int i=1;i<=20;i++){
            if(i>=start && i<=end){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("*********************");

    }
    private static void continueexamole3() {
        int a=1;
        while(a<10){
            if(a%2==0){
                a++;
                continue;


            }
            System.out.println(a);
            a++;



        }
    }

}
