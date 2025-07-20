import java.util.Arrays;

public class arrayReverse {
    public static void main(String[] args) {
        int[] arr = {23,21,34,55,44,33};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int el: arr){
            System.out.print(el + " ");
        }
    }
}
