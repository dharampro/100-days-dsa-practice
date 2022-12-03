package com.dsa.ds.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphDfsGetCycles {
  public static void main(String[] args) {
    int[][] adj = new int[][] { { 0, 1, 0, 0, 1 },
                                { 1, 0, 1, 1, 1 },
                                { 0, 1, 0, 1, 0 },
                                { 0, 1, 1, 0, 1 },
                                { 1, 1, 0, 1, 0 }
                              };
    List<Integer> dfs = new ArrayList<>();
    Boolean[] visited = new Boolean[adj.length + 1];
    Arrays.fill(visited, false);
    dfs(0, adj, visited, dfs);
    System.out.println(dfs);
  }

  private static void dfs(int v, int[][] adj, Boolean[] visited, List<Integer> dfs) {
    visited[v] = true;
    dfs.add(v);
    for (int i = 0; i < adj[0].length; i++) {
      if (adj[v][i] == 1 && !visited[i]) {
        dfs(i, adj, visited, dfs);
      }
    }
  }
}
