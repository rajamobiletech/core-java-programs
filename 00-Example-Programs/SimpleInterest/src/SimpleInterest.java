import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        int p = s.nextInt();
        System.out.println("Enter the time:");
        int t = s.nextInt();
        System.out.println("Enter the interest percentage");
        int r=s.nextInt();
        int SI=(p*t*r)/100;
        System.out.println("Simple interest"+SI);

    }
}