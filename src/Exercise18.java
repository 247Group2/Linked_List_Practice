import java.util.*;

public class Exercise18 {

    public void ex18() {

        LinkedList<String> c1 = new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first linked list: " + c1);

        LinkedList <String> newc1 = new LinkedList <String> ();
        newc1 = (LinkedList)c1.clone();

        System.out.println("Cloned linked list: " + newc1);
    }
}
