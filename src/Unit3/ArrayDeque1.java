package Unit3;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("First");
        dq.addFirst("Zero");
        dq.addLast("Second");
        dq.add("Amrendra");

        System.out.println(dq);

        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
    }
}
