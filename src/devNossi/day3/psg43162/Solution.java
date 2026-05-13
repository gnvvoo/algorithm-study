package devNossi.day3.psg43162;

import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        List<List<Integer>> graph = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;

                if (computers[i][j] == 1)
                    graph.get(i).add(j);
            }
        }

        boolean[] visited = new boolean[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]){
                bfs(graph, i, visited);
                answer++;
            }
        }

        return answer;
    }

    public void bfs(List<List<Integer>> graph, int start,boolean[] visited) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int next : graph.get(curr)) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }
    }
}