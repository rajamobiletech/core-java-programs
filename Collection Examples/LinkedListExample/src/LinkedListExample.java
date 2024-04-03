import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.poll();
    }
}
