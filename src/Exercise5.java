import java.util.*;

public class Exercise5 {

    public void ex5(){

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        System.out.println("Original linked list: ");
        System.out.println("Let add the Yellow color after the Red Color: " + l_list);
        l_list.add(1, "Yellow");

        System.out.println("The linked list: " + l_list);
        }



    }

