package Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class mySorting implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b){
        return b - a;
    }
}

public class ArraylistCollection {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> todolist = new ArrayList<>();

    public static void addToList() {
        System.out.println("---------------");
        System.out.print("Enter Task to add: ");
        String newTask = sc.next();
        todolist.add(newTask);
    }

    public static void removefromList() {
        System.out.println("----------------");
        System.out.print("Enter task to Delete: ");
        String taskToRemove = sc.next();
        todolist.remove(taskToRemove);
    }

    public static void viewList() {
        System.out.println("----------------");
        System.out.println("List of Task");
        for (String task : todolist) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {



    /*
        int op;
        do{
            System.out.println("------Simple To Do List------");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. View");
            System.out.println("4. exit");
            op = sc.nextInt();

            switch (op){
                case 1:
                    addToList();
                    break;
                case 2:
                    removefromList();
                    break;
                case 3:
                    viewList();
                    break;
                case 4:
                    System.out.println("Program closing...");
                    break;
                default:
                    System.out.println("Invalid input!!!");
            }
        }while(op != 4);
        */


        ArrayList<Integer> arr = new ArrayList<Integer>();


        for (int i = 0; i < 10; i++) {
            arr.add(i + 1);
        }
        arr.add(-4);
        arr.add(29);
        arr.sort(new mySorting());
        System.out.println(arr);


    }
}
