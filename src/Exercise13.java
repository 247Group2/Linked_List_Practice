import java.util.*;

public class Exercise13 {

    public void ex13() {

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("Orange");

        System.out.println("Original linked list: " + l_list);

        Object firstElement = l_list.removeFirst();
        System.out.println("Element Removed: " + firstElement);

        Object lastElement = l_list.removeLast();
        System.out.println("Element Removed: " + lastElement);
        System.out.println("The New Linked List: " + l_list);
        }
    }

