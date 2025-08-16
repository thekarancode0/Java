package Collection.Iterator.foreach;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class PlayWithException {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(12,23,12,4,3,2,65));
        System.out.println(set);

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
//            int num = itr.next();
//            if(num == 65)itr.remove();
//            System.out.println(num);
            if(itr.next() == 65)set.remove(65); //ConcurrentModificationException
        }
        System.out.println(set);
    }

}
