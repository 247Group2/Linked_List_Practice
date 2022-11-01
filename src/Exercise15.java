import java.util.*;

public class Exercise15 {

    public void ex15() {

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("Orange");

        System.out.println("Original linked list: " + l_list);

        Collections.swap(l_list, 0, 2);

        System.out.println("The New List After Swap: " + l_list);
    }
}

