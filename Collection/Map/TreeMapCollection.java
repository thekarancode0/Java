package Collection.Map;

import java.util.Comparator;
import java.util.TreeMap;

//custom comparator
class SortByPoint implements Comparator<Integer> {

    @Override
    public int compare(Integer i, Integer j) {
        return j - i;
    }


}

public class TreeMapCollection {
    public static void main(String[] args) {
        System.out.println("----Natural Ordering----");
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(11, "A");
        tree.put(23, "B");
        tree.put(12, "D");
        tree.put(34, "F");
        System.out.println(tree);


        System.out.println("----Comparator Ordering-----");
        TreeMap<Integer, String> t = new TreeMap<>(new SortByPoint());
        t.put(911, "A");
        t.put(223, "B");
        t.put(142, "D");
        t.put(324, "F");
        System.out.println(t);
    }
}
