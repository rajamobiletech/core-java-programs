import java.util.Scanner;
public class reverseint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER TO BE REVERSE : ");
        Integer i=s.nextInt();
        int sum=0,r;
        while (i!=0) {
            r=i%10;
            sum=(sum*10)+r;
            i=i/10; }
    
    System.out.println("THE NUMBER AFTER REVERSING : "+sum);
}
}