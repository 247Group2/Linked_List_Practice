import java.util.*;

public class Exercise7 {

    public void ex7(){

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");


        System.out.println("Original linked list: ");

        l_list.offerFirst("Pink");
        System.out.println("Final linked list: " + l_list);
    }



}

