import java.util.*;
class ArrayListDemo
{
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");

        System.out.println("ArrayList: " + list);

        // Accessing elements
        System.out.println("First element: " + list.get(0));
        System.out.println("Second element: " + list.get(1));

        // Removing an element
        list.remove(2);
        System.out.println("After removing element at index 2: " + list);

        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String str : list) {
            System.out.println(str);
        }
    }
}