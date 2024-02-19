public class array {
    public static void main(String[] args) {
     int[] baba = {1,2,3,};
     for(int i=0; i<baba.length;i++){
        System.out.println(baba[i]);
     }
     String[] name = {"vinay","kumar",};
     for(int i=0; i<name.length;i++){
        System.out.println(name[i]);
     }

     int[][] twoDArray={{1,2,3},{4,5,6},{7,8,9}};
     for(int i=0;i<twoDArray.length;i++) {
        for(int j=0;j<twoDArray[0].length;j++){
            System.out.print(twoDArray[i][j]);
            System.out.print(" ");
        }
        System.out.println(" ");
     }
      
    }

    
}
