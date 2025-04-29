import java.util.*;

public class linkedlist {
    public static void main(String args[]) {
        LinkedList al = new LinkedList();
        al.add("Ayan");
        al.add("Roy");
        al.add("S");
        al.add(25);
        System.out.println("Size of al after addition: " + al.size());
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        al.remove("Roy");
        al.remove(2);
        Iterator itr2 = al.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
