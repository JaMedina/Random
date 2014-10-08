package interview.exercises;

import java.util.BitSet;
import java.util.Scanner;

public class AnagramOfaPalindrome {

  public static void main(String... args) {
    System.out.println("Enter a String");
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();

    if (isPalindromeAnagram(string)) {
      System.out.println("Congratulations! the string : " + string + " IS an anagram of a palindrom");
    } else {
      System.out.println("The String: " + string + " IS NOT an anagram of a palindrom");
    }
    scanner.close();
  }

  public static boolean isPalindromeAnagram(String text) {
    BitSet bs = new BitSet(27);
    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z'))
        bs.flip(ch % 32);
    }
    return bs.cardinality() <= 1;
  }

  /**
   * There are many solutions to this problem. However, it is made simpler if you determine the
   * number of letter with an odd number occurrences. As long as the text has no more than 1 odd
   * numbered letter, you can make a palindrome from it.
   * **/
}
