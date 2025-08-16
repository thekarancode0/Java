package Collection.Iterator.foreach;

import java.util.*;

public class LetsIterator {
    public static void main(String[] args) {

/*
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,21,4,5,8,90,12,22,33,44,32));
        ListIterator<Integer> lt = arr.listIterator();

        while(lt.hasNext()) System.out.print(lt.next() + " ");
        System.out.println();
        while(lt.hasPrevious()) System.out.print(lt.previous() + " ");

//        Iterator<Integer> it = arr.iterator();
//        System.out.println("Remove all even numbers");
//        while(it.hasNext()){
//            int i = it.next();
//            System.out.print(i + " ");
//            if(i%2 == 0){
//                it.remove();
//            }
//        }
//
//        System.out.println("For each Loop");
//        for(int ele: arr){
//            System.out.print(ele + " ");
//        }



        /*
        HashSet<String> list = new HashSet<>();
        list.add("Sun");
        list.add("Apple");
        list.add("Cat");
        list.add("Dog");
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

         */
        /*
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");

        System.out.println(map);
        //Iterator cannot directly

        Iterator<Integer> keyIterator = map.keySet().iterator();
        while(keyIterator.hasNext()){
            System.out.println(keyIterator.next());
        }

        Iterator<String> valueIterator = map.values().iterator();
        while(valueIterator.hasNext()){
            System.out.println(valueIterator.next());
        }

         */

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(120);
        marks.add(1223);
        marks.add(345);
        marks.add(321);
        marks.add(1);
        marks.add(2);
        marks.add(3);
        System.out.println("Array: " + marks);

//        ListIterator<Integer> itr = marks.listIterator(marks.size());
//        while(itr.hasPrevious()){
//            System.out.print(itr.previous()+ " " );
//        }

        System.out.println();
//        System.out.println(itr.previous()); //NoSuchElementException

        Iterator<Integer> it = marks.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
//        System.out.println("Now next");
//        System.out.println(it.next());

    }
}
