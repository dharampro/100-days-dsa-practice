package com.dsa.ds.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NumberOfIsland {
  public static void main(String[] args) {
    int[][] adj = new int[][] {
        {1, 1, 0, 0, 0},
        {1, 1, 0, 0, 0},
        {0, 0, 0, 1, 1},
        {0, 0, 0, 0, 0},
        {1, 0, 0, 0, 1}
    };

    boolean[] visited = new boolean[adj[0].length+1];
    Arrays.fill(visited, false);
    List<Integer> dfs = new ArrayList<>();
    dfs(1, adj, visited, dfs);
    System.out.println(dfs);
  }

  public static void dfs(int v, int[][] adj, boolean[] visited, List<Integer> dfs) {
    visited[v]=true;
    dfs.add(v);
    for(int i=1; i<adj[v].length; i++) {
      if(visited[i]==false && adj[v][i]==1) {
        dfs(i, adj, visited, dfs);
      }
    }
  }
}
