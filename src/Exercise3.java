import java.util.*;

public class Exercise3 {

    public void ex3(){

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        Iterator p = l_list.listIterator(2);

        while (p.hasNext()){
            System.out.println(p.next());
        }



    }
}
