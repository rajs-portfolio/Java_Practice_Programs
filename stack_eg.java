import java.util.*;

class stack_eg {
    public static void main(String args[]) {
        Stack stack1 = new Stack();
        stack1.push("Ayan");
        stack1.push("Amit");
        stack1.push("Garima");
        stack1.push("Garima");
        System.out.println("Before popping any values: ");
        Iterator itr = stack1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        stack1.pop();

        Iterator itr2 = stack1.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println(stack1);

        boolean b = stack1.empty();
        System.out.println(b);

        int pos = stack1.search("Ashish");
        System.out.println("The element is at position: " + pos);

        int pos1 = stack1.search("Ayan");
        System.out.println("The element is at position: " + pos1);

        stack1.removeAllElements();
        System.out.println(stack1);
    }
}
