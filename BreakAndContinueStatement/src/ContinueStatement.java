public class ContinueStatement {

    public static void main(String[] args) {
        continueExample1(5);
        continueExample2(5, 15);
    }

    private static void continueExample1(int skipValue) {
            for (int i =1; i<=20; i++) {
                if(i==5) {
                    continue;
                }
                System.out.println(i);
            }
    }

    private static void continueExample2(int skipStartValue,int  skipendValue) {
        for (int i =1; i<=20; i++) { 
            if(i>=skipStartValue && i <= skipendValue) {
                continue;
            }
            System.out.println(i);
        }
    }
}
