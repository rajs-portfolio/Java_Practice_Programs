import java.util.*;

public class LinkHash {
    public static void main(String args[]) {
        LinkedHashSet set = new LinkedHashSet();
        set.add("Raj");
        set.add("Amit");
        set.add("Vijay");
        set.add("Raj");
        set.add("Ayan");
        System.out.println(set);

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}