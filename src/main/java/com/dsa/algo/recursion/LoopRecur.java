package com.dsa.algo.recursion;

public class LoopRecur {
  public static void main(String[] args) {
    test(1);
  }

  private static void test(int v) {
    if(v==5) return;
    for(int i=0; i<v; i++) {
      test(i++);
    }
    System.out.println(v);
  }
}
