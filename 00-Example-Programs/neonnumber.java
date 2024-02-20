import java.util.Scanner;
public class neonnumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER NUM:");
        int a=s.nextInt();

        int sum=0,temp;
       int b=(a*a);
       
        while(b!=0){
            temp=b%10;
            sum+=temp;
            b=b/10;}
            if(a==sum)
                System.out.println(a+ "IS NEON NUM");
             else
                System.out.println( a+" IS NOT A NEON NUM");
        }
    }
            
            

        

    

