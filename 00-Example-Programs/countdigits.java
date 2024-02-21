import java.util.Scanner;

public class countdigits {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
         System.out.println("ENTER NUMBER:");
         int num=a.nextInt();
          int count=0;
         while(num!=0)
         {
            num=num/10;
            count++;
            
        
         System.out.println(count);
        }
    }
    
}
