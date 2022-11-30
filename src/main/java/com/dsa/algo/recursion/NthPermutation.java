package com.dsa.algo.recursion;

public class NthPermutation {
  public static void main(String[] args) {
    System.out.println(printNthPermuRecur(6));
  }

  /**\
   * Bruteforce
   * @param n
   * @return
   */
  private static int printNthPermu(int n) {
    int first = 0;
    int second = 1;
    if (n == 0)
      return first;
    if (n == 1)
      return second;
    while (n > 2) {
      int tmp = first;
      first = second;
      second = tmp + first;
      n--;
    }
    return second;
  }

  private static int printNthPermuRecur(int n) {
    if (n>=1 && n <= 2)
      return n-1;
    else
      return printNthPermuRecur(n - 1) + printNthPermuRecur(n - 2);
  }
}
