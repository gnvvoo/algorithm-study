package devNossi.day3.pgs49189;

import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        Map<Integer, List<Integer>> graph = new HashMap<>(n);
        boolean[] visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        return bfs(graph, visited, n);
    }

    public int bfs(Map<Integer, List<Integer>> graph, boolean[] visited, int n){
        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{1, 0});
        visited[1] = true;

        int count = 0;
        int max_distance = 0;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            for (int next : graph.get(curr[0])) {
                if (!visited[next]) {
                    queue.offer(new int[]{next, curr[1] + 1});
                    if (max_distance < curr[1] + 1) {
                        max_distance = curr[1] + 1;
                        count = 1;
                    } else {
                        count++;
                    }
                    visited[next] = true;
                }
            }
        }
        return count;
    }
}