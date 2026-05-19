package devNossi.day6.fatigue;

import java.util.*;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = -1;

        boolean[] visited = new boolean[dungeons.length];

        answer = dfs(dungeons, k, visited);

        return answer;
    }

    public int dfs(int[][] dungeons, int k, boolean visited[]) {
        int max_length = -1;
        // System.out.println(k);
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (k >= dungeons[i][0])
                    max_length = Math.max(max_length, dfs(dungeons, k - dungeons[i][1], visited));
                visited[i] = false;
            }
        }

        return max_length + 1;
    }
}