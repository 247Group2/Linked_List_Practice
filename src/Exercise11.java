import java.util.*;

public class Exercise11 {

    public void ex11() {

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("Orange");

        System.out.println("Original linked list: " + l_list);
        for (int p = 0; p < l_list.size(); p++){
            System.out.println("Element at index " + p + ": " + l_list.get(p));
        }
    }
}

