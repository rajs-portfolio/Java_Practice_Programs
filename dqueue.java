import java.util.*;

public class dqueue {
    public static void main(String args[]) {
        Deque deque = new ArrayDeque();
        deque.add("Amit");
        deque.add("Vijay");
        deque.add("Jay");
        deque.add("Raj");

        System.out.println(deque);
        deque.offerFirst("Raj");
        deque.offerLast("Ayan");
        System.out.println("Deque after adding elements: " + deque);
        deque.pollFirst();
        deque.pollLast();
        System.out.println("Deque after removing elements: " + deque);
    }
}