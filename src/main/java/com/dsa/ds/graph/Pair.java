package com.dsa.ds.graph;

public class Pair {
  public Integer first;
  public Integer second;

  public Integer weight;

  public Pair(Integer first, Integer second) {
    this.first = first;
    this.second = second;
    this.weight=1;
  }

  public Pair(Integer first, Integer second, Integer weight) {
    this.first = first;
    this.second = second;
    this.weight = weight;
  }
  @Override
  public String toString() {
    return "Pair{" + "first=" + first + ", second=" + second + ", weight=" + weight + '}';
  }
}
