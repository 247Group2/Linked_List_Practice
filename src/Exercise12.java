import java.util.*;

public class Exercise12 {

    public void ex12() {

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("Orange");

        System.out.println("Original linked list: " + l_list);

        l_list.remove(2);
            System.out.println("The New Linked List: " + l_list);
        }
    }

