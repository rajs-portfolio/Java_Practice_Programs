import java.util.*;

public class hashset {
    public static void main(String args[]) {
        HashSet set = new HashSet();
        set.add("Raj");
        set.add("Amit");
        set.add("Vijay");
        set.add("Raj");
        set.add("Ayan");
        System.out.println(set);
        set.remove("Raj");

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
