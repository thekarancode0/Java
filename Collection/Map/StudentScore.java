package Collection.Map;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class SortByScore implements Comparator<Integer>{

    @Override
    public int compare(Integer i , Integer j){
        return j - i;
    }
}

public class StudentScore {
    public static void main(String[] args) {
        TreeMap<Integer,String> student = new TreeMap<>(new SortByScore());
        student.put(89,"Shreya");
        student.put(99,"Ankit");
        student.put(98,"Ayan");
        student.put(88,"Karan");
        student.put(90,"Adarsh");

        System.out.printf("%10s %10s","Score","Student");
        for(Map.Entry<Integer,String> entry : student.entrySet()){
            System.out.printf("%10d %10s ", entry.getKey(),entry.getValue());
            System.out.println();
        }

        System.out.println();

    }


}
