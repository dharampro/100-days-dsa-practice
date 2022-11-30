package com.dsa.ds.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GraphDfs {

  public static void main(String[] args) {

    List<List<Integer>> adj = new ArrayList<>(6);

    //    Collections.fill(adj, new ArrayList<>());
    for (int i = 0; i <= 6; i++) {
      adj.add(new ArrayList<>());
    }
    adj.get(1).add(2);
    adj.get(1).add(4);
    adj.get(2).add(3);
    adj.get(3).add(6);
    adj.get(4).add(5);
    adj.get(5).add(6);

    List<Integer> dfs = new ArrayList<>();
    Boolean[] visited = new Boolean[7];
    Arrays.fill(visited, false);
    dfs(1, adj, dfs, visited);
    System.out.println(dfs);
  }

  private static void dfs(int v, List<List<Integer>> adj, List<Integer> dfs, Boolean[] visited) {
    visited[v] = true;
    dfs.add(v);
    Iterator<Integer> it = adj.get(v).iterator();
    while (it.hasNext()) {
      int val = it.next();
      if (visited[val] == false) {
        dfs(val, adj, dfs, visited);
      }
    }
  }

}
