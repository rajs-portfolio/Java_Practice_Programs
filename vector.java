import java.util.*;

class vector {
    public static void main(String args[]) {
        Vector v = new Vector();
        v.add("Ayan");
        v.add("Amit");
        v.add("Garima");
        v.add("Garima");
        System.out.println("Size of v after addition: " + v.size());
        Iterator it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /*
         * v.remove("Roy");
         * v.remove(2);
         * Iterator itr2 = v.iterator();
         * while (itr2.hasNext())
         * {
         * System.out.println(itr2.next());
         * }
         */
    }
}