package string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = s.nextLine();

        char[] strArray = str.toCharArray();
        int i = 0, j = strArray.length - 1;
        boolean isPalindrome = true;
        while(i <= j){
            if(strArray[i] != strArray[j]){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome) System.out.println("Palindrome");
        else System.out.println("not Palindrome");
    }
}
