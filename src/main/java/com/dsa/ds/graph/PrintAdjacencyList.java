package com.dsa.ds.graph;

public class PrintAdjacencyList {
  public static void main(String[] args) {
    int edges[][] = { { 0, 1 }, { 1, 2 }, { 2, 0 } };
    printAdjacencyList(edges);
  }

  private static void printAdjacencyList(int[][] list) {
    for (int i = 0; i < list.length; i++) {
      System.out.println(list[i][0] + "->" + list[i][1]);
    }
  }
}
