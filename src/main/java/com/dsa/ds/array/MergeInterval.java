package com.dsa.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
  public static void main(String[] args) {
    List<Integer[]> result = new ArrayList<>();
    Integer[][] array = new Integer[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
    mergeInter(array, result);
    result.stream().forEach(v -> System.out.println(v[0] + "," + v[1]));
  }

  private static void mergeInter(Integer[][] array, List<Integer[]> result) {

    Arrays.sort(array, Comparator.comparingInt(a -> a[0]));
    int start = array[0][0];
    int end = array[0][1];

    for (Integer[] interval : array) {
      if (interval[0] < end) {
        end = Math.max(end, interval[1]);
      } else {
        result.add(new Integer[] { start, end });
        start = interval[0];
        end = interval[1];
      }
    }
    result.add(new Integer[] { start, end });
  }
}
