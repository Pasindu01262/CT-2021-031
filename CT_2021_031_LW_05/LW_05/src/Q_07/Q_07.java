package Q_07;

import java.util.*;

public class Q_07 {
    public static void main(String[] args) {

        Scanner s;
        s= new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = s.nextLine();

        System.out.println("Enter the word to replace: ");
        String oldWord = s.nextLine();

        System.out.println("Enter the replacement word: ");
        String newWord = s.nextLine();

        String updatedSentence = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);

        System.out.println("Updated sentence: " + updatedSentence);

    }
}
