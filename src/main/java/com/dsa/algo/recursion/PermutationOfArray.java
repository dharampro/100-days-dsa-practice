package com.dsa.algo.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOfArray {
  public static void main(String[] args) {
    List<Integer> current = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    permutations(Arrays.asList(1, 2, 3), current, result);
    System.out.println(result);
  }

  private static void permutations(List<Integer> array, List<Integer> current, List<List<Integer>> result) {
    if (array.size() == current.size()) {
      result.add(new ArrayList<>(current));
      return;
    }

    for (int i = 0; i < array.size(); i++) {
      Integer ele = array.get(i);
      if (!current.contains(ele)) {
        current.add(ele);
        permutations(array, current, result);
        current.remove(ele);
      }
    }
  }
}
