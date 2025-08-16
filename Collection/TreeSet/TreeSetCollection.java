package Collection.TreeSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.List;
import java.util.SortedSet;

public class TreeSetCollection {
    public static void main(String[] args) {
        System.out.println("---No-Arg constructor---");
        TreeSet<Integer> t = new TreeSet<>(); // Natural ordering
        t.add(12);
        t.add(23);
        t.add(1);
        t.add(98);
        System.out.println(t);

        System.out.println("----comparator----");
        TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder()); //descending order
        ts.add(12);
        ts.add(23);
        ts.add(1);
        ts.add(98);
        System.out.println(ts);

        System.out.println("----Collection----");
        List<String> names = Arrays.asList("Karan","Ankit","Ayan","Adarsh");
        TreeSet<String> set = new TreeSet<>(names);
        System.out.println(set);

        System.out.println("----SortedSort----");
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(20);
        sortedSet.add(300);
        sortedSet.add(12);
        sortedSet.add(43);

        System.out.println(sortedSet);
        TreeSet<Integer> ss = new TreeSet<>(sortedSet);
        System.out.println(ss);

    }
}
