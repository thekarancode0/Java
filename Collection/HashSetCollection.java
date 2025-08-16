package Collection;
import java.util.Collections;
import java.util.HashSet;
public class HashSetCollection {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
//        System.out.println(cars.add("Volvo"));
//        System.out.println(cars.add("Volvo"));
//        cars.add("BMW");
//        cars.add("Mazda");
//        cars.add("BMW");
//        cars.add("Rolls Royce");
//        cars.add("Mercedes");
//        System.out.println(cars);
//        cars.remove("BMW");
//        cars.clear();
//        System.out.println(cars);

//        Problem

        // Find unique words in sentence;
        String sent = "The love it to love the others";
        String[] words = sent.toLowerCase().split(" ");
//        System.out.println(words[0]);

        HashSet<String> allWords = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for(String word : words){
            if(!allWords.add(word)){
                duplicates.add(word);
            }
        }
//
//        System.out.println("All: " + allWords);
//        System.out.println("duplicate: " + duplicates);
        allWords.removeAll(duplicates);
//        System.out.println(allWords);


//        HashSet<String> file1 = new HashSet<>();
//        file1.add("Karan");
//        file1.add("Siya");
//        System.out.println("FILE1: " + file1.hashCode());
//        HashSet<String> file2 = new HashSet<>();
//        file2.add("Siya");
//        file2.add("Kara");
//        System.out.println("FILE2: " + file2.hashCode());
//        System.out.println(file1.hashCode() == file2.hashCode());
    }
}
