package com.dsa.ds.generic;

import java.util.ArrayList;
import java.util.List;

public class LargestSubSequenceinArray {
  public static void main(String[] args) {
    int[] arr = { 12, 4, 5, 1, 3, 2 };
    int largest = 0;
    List<Integer> val = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (largest < arr[i]) {
        largest = arr[i];
      }
    }

    for(int i=0; i<=largest; i++) {
      val.add(0);
    }

    for (int i = 0; i < arr.length; i++) {
      val.set(arr[i], arr[i]);
    }

    System.out.println(val.size());
    System.out.println(val);
  }
}
