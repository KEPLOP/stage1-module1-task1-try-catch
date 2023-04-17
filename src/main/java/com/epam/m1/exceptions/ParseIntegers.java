package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {
  public static void main(String[] args) {
    String[] WORDS = {"The", "answer", "is", "42"};
    int sum = 0;
    for (String word : WORDS) {
      try {
        sum += Integer.parseInt(word);
      } catch (NumberFormatException e) {
        // ignore non-numeric words
      }
    }
    String result = String.join(" ", WORDS);
    System.out.println("Sum of numbers: " + sum);
    System.out.println("Result: " + result);
  }

}

