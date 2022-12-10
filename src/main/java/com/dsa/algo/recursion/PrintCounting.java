package com.dsa.algo.recursion;

public class PrintCounting {
  public static void main(String[] args) {

    print(10);
    System.out.println("==============");
    printRev(10);
  }

  private static void print(int n) {
    if(n==0) return;;
    System.out.println(n);
    print(n-1);
  }

  private static void printRev(int n) {
    if(n<=0) return;;
    printRev(n-1);
    System.out.println(n);
  }
}
