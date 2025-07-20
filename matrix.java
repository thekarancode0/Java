import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        //Two dimensional array
//        int [][]arr = {{1,2,3,4},{5,6,7}};
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = s.nextInt();

        int [][]arr = new int[rows][cols];

        System.out.println("________________________________");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Enter element [ " + i + " , " + j + "]: ");
                arr[i][j] = s.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all Elements: " + sum);
        System.out.println(arr[0]);
    }
}
