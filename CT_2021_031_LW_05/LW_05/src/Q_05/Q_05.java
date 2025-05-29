package Q_05;

import java.util.*;

public class Q_05 {
    public static void main(String[] args) {

        Scanner s;
        s= new Scanner(System.in);

        System.out.print("Input a word or phrase: ");
        String Word;
        Word= s.next();

        String cleaned = Word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }


    }
}

