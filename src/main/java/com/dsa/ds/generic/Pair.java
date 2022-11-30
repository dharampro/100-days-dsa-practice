package com.dsa.ds.generic;

public class Pair {
  public Integer start;
  public Integer end;

  public Pair(Integer start, Integer end) {
    this.start = start;
    this.end = end;
  }

  public Pair() {

  }

  public Integer getStart() {
    return start;
  }

  public Integer getEnd() {
    return end;
  }
  @Override
  public String toString() {
    return "Pair{" + "start=" + start + ", end=" + end + '}';
  }
}
