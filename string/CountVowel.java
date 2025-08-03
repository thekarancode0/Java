package string;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = s.nextLine().toLowerCase();
        int vowel = 0, consonant = 0;
        for(int i=0; i<str.length(); i++){
            if("aeiou".indexOf(str.charAt(i)) != -1) vowel++;
            else consonant++;
        }
        System.out.println("Vowel: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}
