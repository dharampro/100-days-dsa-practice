package com.dsa.ds.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NumberOfIsland {
  public static void main(String[] args) {
    int[][] adj = new int[][] { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 1 } };
    boolean[][] visited = new boolean[adj[0].length + 1][adj[0].length + 1];
    for (int i = 0; i < visited.length; i++) {
      for (int j = 0; j < visited.length; j++) {
        visited[i][j] = false;
      }
    }
    List<Integer> dfs = new ArrayList<>();
  }

  public static void dfs(int u, int v, int[][] adj, boolean[][] visited) {
    visited[u][v] = true;
    for (int i = 1; i < adj[v].length; i++) {
      if (visited[i][i] == false && adj[v][i] == 1) {
        dfs(i, v, adj, visited);
      }
    }
  }
}
