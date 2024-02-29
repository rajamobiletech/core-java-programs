import java.util.Arrays;

public class AnonymousExample {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[] {1, 2, 3, 4, 5}));
//        String name = new String("Raja");
        printMyName(new String("Raja"));
    }

    private static void printMyName(String name) {
        System.out.println(name);
    }
}


