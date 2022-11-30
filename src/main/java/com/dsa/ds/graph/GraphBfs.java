package com.dsa.ds.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphBfs {
  public static void main(String[] args) {
    List<List<Integer>> adj = new ArrayList<>();
    int v = 7;
    int i = 0;
    while (i <= v) {
      adj.add(new ArrayList<>());
      i++;
    }

    adj.get(1).add(2);
    adj.get(2).add(5);
    adj.get(5).add(4);
    adj.get(4).add(3);
    adj.get(3).add(2);
    adj.get(6).add(7);

    List<Integer> res = bfs(v, adj);
    System.out.println(res);
  }

  public static List<Integer> bfs(int v, List<List<Integer>> adj) {
    Queue<Integer> queue = new LinkedList<>();
    Boolean[] visited = new Boolean[v+1];
    List<Integer> bfs = new ArrayList<>();
    Arrays.fill(visited, false);
    visited[1]=true;
    queue.add(1);
    while(!queue.isEmpty()) {
      Integer value = queue.poll();
      bfs.add(value);
      for(int i=0; i<adj.get(value).size(); i++) {
        if(visited[adj.get(value).get(i)]==false) {
          visited[adj.get(value).get(i)] = true;
          queue.add(adj.get(value).get(i));
        }
      }
    }
    return bfs;
  }

}
