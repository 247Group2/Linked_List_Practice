import java.util.*;

public class Exercise4 {

    public void ex4(){

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        System.out.println("Original linked list: " + l_list);

        Iterator it = l_list.descendingIterator();

        System.out.println("Elements in Reverse Order: ");
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
