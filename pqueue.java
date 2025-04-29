import java.util.*;

class pqueue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue queue = new PriorityQueue();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Jay");
        queue.add("Raj");
        System.out.println("Priority Queue: " + queue);
        System.out.println("Head: " + queue.peek());
        System.out.println("Iterating the queue elements: ");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("After first removal");
        queue.remove();
        System.out.println(queue);
        // to remove all elements from the queue
        queue.poll();
        System.out.println("After second removal:");
        System.out.println(queue);
    }
}