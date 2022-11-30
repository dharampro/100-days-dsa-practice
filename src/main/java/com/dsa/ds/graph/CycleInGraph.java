package com.dsa.ds.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleInGraph {
  public static void main(String[] args) {
    List<List<Integer>> adj = new ArrayList<>();
    int v = 5;
    int i = 0;
    while (i <= v) {
      adj.add(new ArrayList<>());
      i++;
    }

    adj.get(1).add(2);
    adj.get(2).add(5);
    adj.get(3).add(4);
    adj.get(4).add(5);
    adj.get(5).add(1);
    adj.get(5).add(3);
    adj.get(5).add(2);

    bfsCycle(5, adj);
    System.out.println( bfsCycle(5, adj));
  }

  private static Integer bfsCycle(int v, List<List<Integer>> adj) {
    Queue<Integer> queue = new LinkedList<>();
    Boolean[] visited = new Boolean[v+1];
    Integer cycleCount = 0;
    queue.add(1);
    Arrays.fill(visited, false);
    visited[1]=true;
    while (!queue.isEmpty()) {
      Integer val = queue.poll();
      for(int i=0; i<adj.get(val).size(); i++) {
        if(visited[adj.get(val).get(i)]==false) {
          visited[adj.get(val).get(i)]=true;
          queue.add(adj.get(val).get(i));
        } else {
          cycleCount++;
        }
      }
    }
    return cycleCount;
  }
}
