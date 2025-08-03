package string;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = s.nextLine();

//        StringBuilder revStr = new StringBuilder();
//        int j=str.length()-1;
//        while(j >= 0){
//            revStr.append(str.charAt(j));
//            j--;
//        }

        char[] revStr = str.toCharArray();
        int i = 0, j=revStr.length - 1;
        while (i <= j){
            char temp = revStr[i];
            revStr[i] = revStr[j];
            revStr[j] = temp;
            i++;
            j--;
        }

        System.out.println(str);
        System.out.println(revStr);
    }
}
