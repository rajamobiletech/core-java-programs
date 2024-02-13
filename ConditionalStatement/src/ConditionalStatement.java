public class ConditionalStatement {
    public static void main(String[] args) {
        Integer a = 35;
        String outputString  = (a > 30) ? "Hi" : "Bye";
        System.out.println(outputString);

        Integer b = 48;
        String output1 = (a > 30) ? (b > 45)  ?  (a ==35) ? "four" : "five" : "two" : "three";
         System.out.println(output1);
    }
}
