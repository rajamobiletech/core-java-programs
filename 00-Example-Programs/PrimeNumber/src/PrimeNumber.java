import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        int count;
        int sum=0;
        for(int number=1;number<=100; number++) {
            count=0;
            for(int i=2 ; i<=number/2;i++ ){
                if ((number%i) == 0) {
                    count++;
                    break;
                }

            }

            if(count==0 && number!=1) {
                System.out.print(" "+number);
                sum += number;
            }
        }
        System.out.println("\nSum of prime number"+sum);
    }

}