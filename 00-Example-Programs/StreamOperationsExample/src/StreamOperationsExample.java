import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationsExample {
    public static void main(String[] args) {
        Stream<String> words = Stream.of("Java", "Python");
        Optional<String> first = words.findFirst();
        System.out.println(first.get());

    //Write a Java program to calculate the average of a list of integers using streams.
        List<Integer> num=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6));
        OptionalDouble average = num.stream().mapToDouble(Integer::doubleValue).average();
        System.out.println(average.getAsDouble());

    //Write a Java program to convert a list of strings to uppercase or lowercase using streams.
        List<String> names=new ArrayList<>(Arrays.asList("Java","Python","c","c++"));
        List<String> collect = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
        List<String> collect1 = collect.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
        System.out.println(collect1);

    //Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
        List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int Evensum = numbers.stream().filter(n->n%2==0).mapToInt(n -> n).sum();
        System.out.println(Evensum);
        int Oddsum = numbers.stream().filter((n -> n % 2 != 0)).mapToInt(n -> n).sum();
        System.out.println(Oddsum);

    // Write a Java program to remove all duplicate elements from a list using streams.
        List<String> element=new ArrayList<>(Arrays.asList("A","a","a","B","b","b","c","c"));
        List<String> collect2 = element.stream().distinct().collect(Collectors.toList());
        System.out.println(collect2);
        Set<String> items=new HashSet<>();
        element.stream().filter(n->!items.add(n)).collect(Collectors.toSet());
        System.out.println(items);

    // Write a Java program to count the number of strings in a list that start with a
        // specific letter using streams.

        List<String> Names=new ArrayList<>(Arrays.asList("Java","Jai","Charan","Bharath"));
        long Startwith = Names.stream().filter(s -> s.startsWith("J")).count();
        System.out.println("String starts with J:"+Startwith);

   // Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        List<String> collect3 = Names.stream().sorted().collect(Collectors.toList());
        System.out.println(collect3);
        List<String> collect4 = Names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect4);

    //Write a Java program to find the maximum and minimum values in a list of integers using streams.
        OptionalInt max = numbers.stream().mapToInt(n->n).max();
        System.out.println("Maximum number in list: "+max.getAsInt());
        OptionalInt min=numbers.stream().mapToInt(n->n).min();
        System.out.println("Minimum number in a list: "+min.getAsInt());

    //Write a Java program to find the second smallest and largest elements in a list of integers using streams.
        Integer i = numbers.stream().sorted().skip(1).findFirst().orElse(null);
        System.out.println("Second Smallest element:"+i);

        Optional<Integer> first1 = numbers.stream().sorted((a, b)-> Integer.compare(b, a)).skip(1).findFirst();
        System.out.println("Second Largest element:"+first1.get());


    }


}