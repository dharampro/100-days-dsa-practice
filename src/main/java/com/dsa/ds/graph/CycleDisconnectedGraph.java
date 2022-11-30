package com.dsa.ds.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class CycleDisconnectedGraph {
  public static void main(String[] args) {
    List<List<Integer>> adj = new ArrayList<>();
    int v = 7;
    int i = 0;
    while (i <= v) {
      adj.add(new ArrayList<>());
      i++;
    }

    adj.get(1).add(2);
    adj.get(2).add(3);
    adj.get(3).add(1);
    adj.get(4).add(5);
    adj.get(5).add(6);

    Boolean[] visited = new Boolean[v + 1];
    Arrays.fill(visited, false);
    AtomicInteger count = new AtomicInteger(0);
    for (int j = 0; j < v; j++) {
      if (visited[j] == false)
        bfsCycleDisconnected(j, adj, visited, count);
    }
    System.out.println(count.get());
  }

  private static void bfsCycleDisconnected(int i, List<List<Integer>> adj, Boolean[] visited, AtomicInteger count) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(i);
    visited[i] = true;
    while (!queue.isEmpty()) {
      Integer value = queue.poll();
      for (int j = 0; j < adj.get(value).size(); j++) {
        if (visited[adj.get(value).get(j)] == false) {
          visited[adj.get(value).get(j)] = true;
          queue.add(adj.get(value).get(j));
        } else {
          count.set(count.get()+1);
        }
      }
    }
  }
}
