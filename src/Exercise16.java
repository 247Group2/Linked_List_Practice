import java.util.*;

public class Exercise16 {

    public void ex16() {

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("Orange");

        System.out.println("Linked list before shuffling:\n" + l_list);

        Collections.shuffle(l_list);

        System.out.println("Linked list after shuffling:\n" + l_list);
    }
}

