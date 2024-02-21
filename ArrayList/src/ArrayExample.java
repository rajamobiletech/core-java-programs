public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[] names = {"name1", "name2", "name3", "name4"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int[][] twoDArr = {
                {1, 2},
                {4, 5},
                {6,7},
                {8,7},
                {12,7}};
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[0].length; j++) {
                System.out.print(twoDArr[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
