package com.dsa.ds.graph;

public class NumberOfIslands {
  public static void main(String[] args) {

    char[][] adj = new char[][] { { '0', '1', '1', '0' }, { '0', '0', '0', '0' }, { '1', '0', '1', '0' }, {'0', '0', '0', '1'}};

    System.out.println(numIsland(adj));
  }

  private static void dfs(char[][] adj, int c, int r) {
    int numRows = adj.length;
    int numCol = adj[0].length;

    if (r < 0 || c < 0 || r >= numRows || c >= numCol || adj[r][c] == '0') {
      return;
    }
    adj[r][c] = '0';
    dfs(adj, c, r - 1);
    dfs(adj, c, r + 1);

    dfs(adj, c - 1, r);
    dfs(adj, c + 1, r);
  }

  private static int numIsland(char[][] adj) {

    if (adj == null || adj.length == 0) {
      return 0;
    }

    int nr = adj.length;
    int nc = adj[0].length;
    int islands = 0;
    for (int i = 0; i < nr; ++i) {
      for (int j = 0; j < nc; ++i) {
        if (adj[i][j] == '1') {
          islands++;
          dfs(adj, j, i);
        }
      }
    }
    return islands;
  }
}
