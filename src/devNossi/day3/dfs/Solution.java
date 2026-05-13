package devNossi.day3.dfs;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public int solution(int[][] grid) {
        int n = 5;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {0, 4},
                {1, 3},
                {2, 4},
                {3, 4}
        };
        List<List<Integer>> graph = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];

        dfs(graph, 0, visited);

        return 0;
    }

    public void dfs(List<List<Integer>> graph, int curr, boolean[] visited) {
        // 현재 노드 방문
        visited[curr] = true;
        System.out.println(curr);
        // 다음 노드 탐색
        for (int next : graph.get(curr)) {
            if (!visited[next]) {
                dfs(graph, next, visited);
            }
        }
    }
}
