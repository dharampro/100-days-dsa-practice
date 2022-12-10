package com.dsa.algo.recursion;

public class Factorial {
  public static void main(String[] args) {
    System.out.println(factorial(10));
  }
  private static int factorial(int i) {
    if (i <= 1) {
      return i;
    }
    return i * factorial(i-1);
  }
}
