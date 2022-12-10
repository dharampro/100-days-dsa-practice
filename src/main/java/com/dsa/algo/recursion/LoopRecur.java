package com.dsa.algo.recursion;

public class LoopRecur {
  public static void main(String[] args) {

//    for (int i = 0; i < 5; i++)
      test(10);
  }

  private static void test(int v) {
    if (v == 0)
      return;
    for (int i = 0; i < --v; i++)
      test(i);
    System.out.println(v);
  }
}
