import java.util.Scanner;

public class Comparison{
    public static void main(String[] args) {
        //Comparison of two Numbers
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number1");
        int a= s.nextInt();
        System.out.println("Enter the Number2");
        int b=s.nextInt();
        if(a>b){
            System.out.println("Number1 is bigger");
        } else if (a<b) {
            System.out.println("Number2 is bigger");

        }
        else{
            System.out.println("Number1==Number2");
        }
    }
}