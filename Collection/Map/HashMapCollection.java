package Collection.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101,"Karan");
        map.put(106,"Ankit");
        map.put(203,"Adarsh");
        map.put(104,"Shreya");
        map.put(405,"Ayan");
        System.out.println(map.put(111,"Siya")); //return null when add
        System.out.println(map.put(111,"Riya")); //return object of old value
        //map.clear();

        Set<Map.Entry<Integer,String>> s = map.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = s.iterator();

        System.out.println("---------While Loop--------");
        while(itr.hasNext()){
            Map.Entry<Integer,String> entry = itr.next();
            System.out.println(entry.getKey() +"  " + entry.getValue());
        }


        /*
        System.out.println("--------For Loop----------");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + "  " + "Value: " + entry.getValue());
            System.out.println(".........................");
        }

        System.out.println("----ForEach with Lambda-----");
        map.forEach((key,value) -> {
            System.out.println("Key: " + key + "  Value: " + value);
        });

         */
        System.out.println(map.get(106));
    }
}

