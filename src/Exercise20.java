import java.util.*;
public class Exercise20 {

    public void ex20(){

        LinkedList <String> c1 = new LinkedList <String> ();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original linked list: " + c1);
        // Retrieve but does not remove, the first element of a linked list
        String x = c1.peekFirst();
        System.out.println("First element in the list: " + x);
        System.out.println("Original linked list: " + c1);

    }
}
