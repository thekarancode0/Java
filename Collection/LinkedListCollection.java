package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Rolls Royce");
        cars.add("Mercedes");
        System.out.println(cars);
        ArrayList<String> devices = new ArrayList<>();
        devices.add("Screen");
        devices.add("Computer");
        devices.add("Radio");

        cars.addAll(devices);
        System.out.println(cars);
//        cars.clear();
//        System.out.println(cars);
//       Iterator<String> it =  cars.descendingIterator();
//       while(it.hasNext()){ // check for if element
//           System.out.println(it.next()); //move to next element
//        }
//        System.out.println(cars);

        System.out.println(cars.getFirst());
    }
}
