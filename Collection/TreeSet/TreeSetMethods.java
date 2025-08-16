package Collection.TreeSet;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetMethods {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10,20,30,40,50));
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("Lower: " + set.lower(30));
        System.out.println("Higher: " + set.higher(30));
        System.out.println("Floor: " + set.floor(30));
        System.out.println("Ceiling: " + set.ceiling(25));
        System.out.println("HeadSet: " + set.headSet(30));
        System.out.println("TailSet: " + set.tailSet(30));
        System.out.println("SubSet: " + set.subSet(20,40));
        System.out.println("DescendingSet: " + set.descendingSet());
        System.out.println("PollFirst: " + set.pollFirst());
        System.out.println("PollLast: " + set.pollLast());
        System.out.println(set);
        System.out.println("Contains: " + set.contains(30));
    }
}
