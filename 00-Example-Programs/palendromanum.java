public class palendromanum {
    public static void main(String[] args) {
        int sum=0,temp,r;
        int n=232;
        temp=n;

        
        while(n!=0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }if(temp==sum){
            System.out.println("IS A PALENDROMA");
        }
        else{
            System.out.println("IS NOT PALENDROMA");
        }
        }
        }
    
    

