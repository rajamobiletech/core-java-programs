public class TriangleStarPattern {
    public static void main(String[] args) {
        int maxValue = 10;
        for(int i =1; i<=maxValue; i++) {
            for (int k = maxValue; k>=i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
