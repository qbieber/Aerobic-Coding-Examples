/**
 * This program reverses the words in a sentence
 * @author Quinn Bieber
 * @version ver1.0
 * @since 08/15/2019
 */

import java.util.Scanner;

public class AeroCode2
{
    public static void main(String[] args)
    {
        Scanner usrin = new Scanner(System.in);
        StringBuilder reverseString = new StringBuilder();
        System.out.println("Enter a sentence to reverse each word in the sentence: ");
        String read = usrin.nextLine();

        String[] words = read.split(" ");
        for (String word: words)
        {
            String reverseWord = new StringBuilder(word).reverse().toString();
            reverseString.append(reverseWord + " ");
        }

        System.out.println(reverseString.toString().trim());

        usrin.close();
    }
}