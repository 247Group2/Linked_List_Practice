import java.util.*;

public class Exercise9 {

    public void ex9(){

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");

        System.out.println("Original linked list: " + l_list);

        LinkedList<String> new_l_list = new LinkedList<String>();

        new_l_list.add("White");
        new_l_list.add("Pink");



        l_list.addAll(1, new_l_list);
        System.out.println("Linked list: " + l_list);
    }

}

