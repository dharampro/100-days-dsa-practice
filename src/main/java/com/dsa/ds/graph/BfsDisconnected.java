package com.dsa.ds.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsDisconnected {
  public static void main(String[] args) {
    List<List<Integer>> adj = new ArrayList<>();

    int v = 7;
    int i = 0;
    while (i <= v) {
      adj.add(new ArrayList<>());
      i++;
    }
    Boolean[] visited = new Boolean[v + 1];
    Arrays.fill(visited, false);
    adj.get(1).add(2);
    adj.get(2).add(5);
    adj.get(5).add(3);
    adj.get(3).add(4);
    adj.get(6).add(7);

    List<Integer> res = null;
    List<Integer> bfs = new ArrayList<>();
    for (int j = 1; j < v; j++) {
      if (visited[j] == false)
         bfsdisconnected(adj, visited, j, bfs);
    }
    System.out.println(bfs);
  }

  private static List<Integer> bfsdisconnected(List<List<Integer>> adj, Boolean[] visited, int start, List<Integer> bfs) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    visited[start] = true;
    while (!queue.isEmpty()) {
      Integer val = queue.poll();
      bfs.add(val);
      for (int j = 0; j < adj.get(val).size(); j++) {
        if (visited[adj.get(val).get(j)] == false) {
          visited[adj.get(val).get(j)] = true;
          queue.add(adj.get(val).get(j));
        }
      }
    }
    return bfs;
  }
}
