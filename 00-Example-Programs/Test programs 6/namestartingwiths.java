import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class namestartingwiths {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mahesh","santosh","ganesh","suraj","ramesh","suresh");
        names = names.stream().filter(s -> s.startsWith("s")).collect(Collectors.toList());
        for (String name : names){
            System.out.println("Names starts with S:" +name);
        }
    }
}