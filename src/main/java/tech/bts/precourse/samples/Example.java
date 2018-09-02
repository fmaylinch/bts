package tech.bts.precourse.samples;

import java.util.*;

/**
 * Simple program that, given two numbers, calculates the power.
 * https://en.wikipedia.org/wiki/Exponentiation
 */
public class Example {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int base = input.nextInt();
    int exponent = input.nextInt();
    int power = 1;
    int counter = 1;

    while (counter <= exponent) {
      power = power * base;
      counter = counter + 1;
    }

    System.out.println(power);

    input.close();
  }

}
