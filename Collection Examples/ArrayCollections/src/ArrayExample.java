import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
        // Int Array initazation
        int[] intArray = new int[]{9,7,3,4,5,9,7,8,3,1 };

        int[] intArray1 = {9,7,3,4,5,9,7,8,3,1 };

        // Arrays fill method
//        Arrays.fill(intArray, 10);

        // Arrays Sorting
//        Arrays.sort(intArray);
        String[] names = new String[]{"raja", "ddsfdsf", "asadsa"};
        Arrays.sort(names);

        // Array List initalization
        List<String> studentNames = new ArrayList<>();
        studentNames.add("nhu");
        studentNames.add("abc");
        studentNames.add("grt");
        studentNames.add("htr");

        // Array List initalization
        List<String> studentNames1 = Arrays.asList("dgbgfgvf", "sdfdf", "tyfdb");

        // Collection reverse can be used in stream api
        Collections.reverse(studentNames);


        for(int num: intArray) {
            System.out.print(num);
            System.out.print(" ");
        }

        System.out.println();

        for(String name: names) {
            System.out.print(name);
            System.out.print(" ");
        }

        System.out.println();

        String s1 = "raja";
        s1 = s1 + " king";

        System.out.println(s1);

        //Split Method
        String s2 = "Welcome to java programming world";
        String[] nameArr = s2.split(" ");

        for(String name: nameArr) {
            System.out.print(name);
            System.out.print("*");
        }
        System.out.println();
        System.out.println(studentNames.toString());
        
    }
}
