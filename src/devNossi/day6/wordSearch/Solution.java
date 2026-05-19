package devNossi.day6.wordSearch;

import java.util.*;

class Solution {
    int n;
    int m;
    int[][] dir = new int[][]{ {-1, 0}, {1, 0}, {0, -1}, {0, 1} };

    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, 0, visited)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, String word, int row, int col, int depth, boolean[][] visited) {
        if (word.charAt(depth) != board[row][col])
            return false;

        if (depth == word.length() - 1)
            return true;

        visited[row][col] = true;

        for (int i = 0; i < 4; i++) {
            int nr = row + dir[i][0];
            int nc = col + dir[i][1];

            if (nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc]) {
                if(dfs(board, word, nr, nc, depth + 1, visited))
                    return true;
            }
        }

        visited[row][col] = false;

        return false;
    }
}