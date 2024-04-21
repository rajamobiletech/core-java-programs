import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TwoArrayListExample {
    public static void main(String[] args) {
        List<List<Integer>> twoDiaArr = new ArrayList<>();
        List<Integer> rows1 = new ArrayList<>();
        rows1.add(0);
        rows1.add(1);
        List<Integer> rows2 = new ArrayList<>(Arrays.asList(2,3));
        twoDiaArr.add(rows1);
        twoDiaArr.add(rows2);
        System.out.println(twoDiaArr);
        System.out.println(twoDiaArr.size());

        System.out.println(rows2.get(0));


        List<String> names = new ArrayList<>(Arrays.asList("king", "name2", "maker"));
        System.out.println(names.contains("name2"));
        System.out.println(names.indexOf("name2"));

        names.sort(Comparator.naturalOrder());

        System.out.println(names);

        names.sort(Comparator.reverseOrder());

        System.out.println(names);

     }
}
