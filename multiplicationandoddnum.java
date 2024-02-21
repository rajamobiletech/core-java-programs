public class multiplicationandoddnum {
    public static void main(String[] args) {
       int a=4;
       for (int i=1; i<=10; i++){
         System.out.println(a+ " * " +i +" = " +(a));
       }
    int b=100;
    System.out.println("List odd numbers from 1 to " +b+ " =");
    for(int i=0; i<=b; i++){
        if(i%2!=0){
            System.out.print(i+ " ,");
        }
    }

    }
}