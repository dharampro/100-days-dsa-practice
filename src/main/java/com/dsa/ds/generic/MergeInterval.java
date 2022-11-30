package com.dsa.ds.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class MergeInterval {
  public static void main(String[] args) {
    Pair[] input = new Pair[4];

    input[0] = new Pair(6, 8);
    input[1] = new Pair(1, 2);
    input[2] = new Pair(3, 5);
    input[3] = new Pair(4, 7);

    Pair[] res = mergePair(input);

    for (int i = 0; i < input.length; i++) {
      System.out.println(input[i]);
    }
  }

  public static Pair[] mergePair(Pair[] input) {
    Set<Pair> res = new HashSet<>();
    Arrays.sort(input, Comparator.comparing(Pair::getStart));

    for (int i = 0; i < input.length; i++) {
      System.out.println(input[i]);
    }
    int ind = 0;

    for (int i = 1; i < input.length; i++) {
      Pair pair =  input[ind];
      if (pair.end >= input[i].start) {
        pair.end = Math.max(pair.end, input[i].end);
      } else {
        res.add(input[i]);
        ind++;
      }

    }
    System.out.println(res);
    return null;
  }
}
