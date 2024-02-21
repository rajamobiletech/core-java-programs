import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int sum=1;
    Scanner s=new Scanner(System.in);
    System.out.println("ENTER NUMBER:");
    int a=s.nextInt();
for(int i=1;i<=a;i++){
    sum*=i;
    }
System.out.println("THE FACTORIAL IS:  "+sum);
    }
}

