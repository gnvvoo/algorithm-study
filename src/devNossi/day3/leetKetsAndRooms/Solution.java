package devNossi.day3.leetKetsAndRooms;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            visited[curr] = true;
            for (int next : rooms.get(curr)) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }

        for (boolean isVisited : visited) {
            if (!isVisited)
                return false;
        }

        return true;
    }
}