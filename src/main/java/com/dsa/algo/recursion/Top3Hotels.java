package com.dsa.algo.recursion;

import com.dsa.ds.graph.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top3Hotels {
  public static void main(String[] args) {
    List<Integer[]> input = new ArrayList<>();
    input.add(new Integer[]{0,1,10});
    input.add(new Integer[]{1,2,11});
    input.add(new Integer[]{2,null,12});
    input.add(new Integer[]{3,4,20});
    input.add(new Integer[]{4,5,40});
    input.add(new Integer[]{5,null,30});

    Map<Integer, Pair> updatedInp = new HashMap<>();
    for(Integer[] val : input) {
      updatedInp.put(val[0], new Pair(val[1], val[2]));
    }
    System.out.println(updatedInp);
    Map<Integer, Integer> result = new HashMap<>();
    getTopHotel(updatedInp, 0,  result);
  }

  private static void getTopHotel(Map<Integer, Pair> inp, Integer va, Map<Integer, Integer> resp) {

    if(va==null) {
      return;
    }

    for(Map.Entry<Integer, Pair> entry: inp.entrySet()) {
      getTopHotel(inp, entry.getKey(), resp);
    }
  }
}
