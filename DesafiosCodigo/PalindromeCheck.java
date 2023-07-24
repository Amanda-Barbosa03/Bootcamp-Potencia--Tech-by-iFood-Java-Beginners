package DesafiosCodigo;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] chars = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            char k = word.charAt(word.length()-1-i);
            chars[i] = k;
        }
        String backwardWord = String.valueOf(chars) ;
        if (backwardWord.equals(word)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
