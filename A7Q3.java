// By Halil Keles 3/7/21
package Assignments;
import java.util.Scanner;

public class A7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or a character");
        String word = input.next();

        if (word.length() % 2 != 0)
        {
            if (word.length() >= 3)
            {
                System.out.print(word.charAt(word.length() / 2));
            }
            else if (word.length() == 1)
            {
                System.out.print(word);
                System.out.print(word);
                System.out.print(word);// I found it easier to just print the word than construct a for loop.

            }

        }
        else if (word.length() % 2 == 0)
        {
            if (word.length() >= 4)
            {
                System.out.print(word.charAt(word.length() / 2 - 1));
                System.out.print(word.charAt(word.length() / 2 ));
            }
            else if (word.length() == 2)
            {
                System.out.print(word);
                System.out.print(word);
            }
        }
    }
}
