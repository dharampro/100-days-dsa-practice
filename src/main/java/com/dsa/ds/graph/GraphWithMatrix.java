package com.dsa.ds.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphWithMatrix {
  public static void main(String[] args) {
    int[][] adj = new int[][] {
        {0, 1, 0, 0, 0},
        {0, 0, 0, 1, 0},
        {0, 0, 0, 0, 1},
        {0, 0, 1, 0, 0},
        {1, 0, 0, 0, 0}
    };
    List<Integer> bfs = new ArrayList<>();
    bfs(0, adj, bfs);
    System.out.println(bfs);
  }

  private static void bfs(int v, int[][] adj, List<Integer> bfs) {
    Boolean[] visited = new Boolean[adj.length+1];
    Arrays.fill(visited, false);
    Queue<Integer> que = new LinkedList<>();
    que.add(v);
    visited[v]= true;
    while (!que.isEmpty()) {
      Integer val = que.poll();
      bfs.add(val);
      for(int i=0; i<adj[val].length; i++) {
        if(adj[val][i]==1 && !visited[i]) {
          que.add(i);
          visited[i]=true;
        }
      }
    }
  }
}
