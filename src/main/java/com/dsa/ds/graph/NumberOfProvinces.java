package com.dsa.ds.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberOfProvinces {
  public static void main(String[] args) {

    List<List<Integer>> adj = new ArrayList<>();
    for (int i = 1; i < 10; i++) {
      adj.add(new ArrayList<>());
    }

    adj.get(1).add(2);
    adj.get(2).add(3);
    adj.get(3).add(2);
    adj.get(2).add(1);

    adj.get(4).add(5);
    adj.get(5).add(6);
    adj.get(6).add(5);
    adj.get(5).add(4);

    adj.get(7).add(8);
    adj.get(8).add(7);

    Boolean[] visited = new Boolean[9];
    Arrays.fill(visited, false);
    List<List<Integer>> provinces = new ArrayList<>();
    Integer count = 0;
    for (int i = 1; i < 9; i++) {
      if (visited[i] == false) {
        provinces(i, visited, adj, provinces);
      }
    }
    System.out.println(provinces);
  }

  private static void provinces(int i, Boolean[] visited, List<List<Integer>> adj, List<List<Integer>> provinces) {
    Queue<Integer> queue = new LinkedList<>();
    List<Integer> cities = new ArrayList<>();
    queue.add(i);
    visited[i] = true;
    while (!queue.isEmpty()) {
      Integer val = queue.poll();
      cities.add(val);
      for (int j = 0; j < adj.get(val).size(); j++) {
        if (visited[adj.get(val).get(j)] == false) {
          visited[adj.get(val).get(j)] = true;
          queue.add(adj.get(val).get(j));
        }
      }
    }
    provinces.add(cities);
  }

}
