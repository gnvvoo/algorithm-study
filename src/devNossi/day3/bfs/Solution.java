package devNossi.day3.bfs;

import java.util.*;

public class Solution {
    int n = 5;

    public int solution(int[][] grid) {
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

        bfs(graph, 0);

        return 0;
    }

    public void bfs(List<List<Integer>> graph, int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n];

        // 시작노드 예약
        queue.offer(start);
        visited[start] = true;

        // while(!queue.isEmpty())
        while (!queue.isEmpty()) {
            // 현재노드 방문
            int curr = queue.poll();
            System.out.println(curr);
            // 다음노드 예약
            for (int next : graph.get(curr)) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }

        }

    }
}
