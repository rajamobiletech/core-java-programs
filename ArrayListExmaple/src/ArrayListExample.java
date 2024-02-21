import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("name1");
        names.add("name2");
        names.add("name3");
        names.add("name4");

        for (String name: names) {
            System.out.println(name);
        }
        System.out.println("===============");
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("movie1","movie2", "movie3"));
        for (String movie: movies) {
            System.out.println(movie);
        }
        System.out.println("===============");
        ArrayList<String> empNames = new ArrayList<>(Arrays.asList("Dasjnajsd","Emsdcn", "Aajscnj", "Sassmld"));
        for (String empName: empNames) {
            System.out.println(empName);
        }
    }
}
