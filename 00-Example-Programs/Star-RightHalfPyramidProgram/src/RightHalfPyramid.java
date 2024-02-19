public class RightHalfPyramid {
    public static void main(String[] args) {
        for (int i =0; i<=5; i++) {
            for (int j = 0; j <= i; j++) {
                if(j!=0) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
