package Collection;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Abundant","Present in large quantities.");
        dictionary.put("Benevolent","Kind and generous");
        dictionary.put("Candid","Honest and straightforward");
        dictionary.put("Diligent","Hardworking and careful in tasks.");
        dictionary.put("Eloquent","Fluent and persuasive in speaking or writing.");
        dictionary.put("Frugal","Careful about spending money.");
        dictionary.put("Harmony","Peaceful agreement");
        dictionary.put("Impeccable","Perfect; without any faults.");
        dictionary.put("Resilient","Able to recover quickly from difficulties.");

        Scanner sc = new Scanner(System.in);
        int op;
        do{

            System.out.println("----Dictionary----");
            System.out.println("1. Search");
            System.out.println("4. Exit");
            System.out.print("Select: ");
            op = sc.nextInt();

            switch (op){
                case 1:
                {
                    System.out.print("Search word: ");
                    String req = sc.next();
                    System.out.println(dictionary.get(req));
                }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
            }
        }while(op != 4);
    }
}
