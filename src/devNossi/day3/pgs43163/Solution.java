package devNossi.day3.pgs43163;

import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int n = words.length + 1;

        Map<String, List<String>> graph = new HashMap<>();
        graph.put(begin, new ArrayList<>());

        List<String> wordsList = new ArrayList<>();
        wordsList.add(begin);

        for (String word : words) {
            graph.put(word, new ArrayList<>());
            wordsList.add(word);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;

                String str1 = wordsList.get(i);
                String str2 = wordsList.get(j);
                int diff_count = 0;

                for (int k = 0; k < str1.length(); k++) {
                    if (str1.charAt(k) != str2.charAt(k))
                        diff_count++;
                }

                if (diff_count == 1) {
                    graph.get(str1).add(str2);
                }
            }
        }

        return bfs(graph, begin, target);
    }

    public int bfs(Map<String, List<String>> graph, String begin, String target) {
        Queue<String[]> queue = new ArrayDeque<>();
        Map<String, Boolean> visited = new HashMap<>();

        for (String words : graph.keySet()) {
            visited.put(words, false);
        }

        queue.offer(new String[]{begin, "0"});
        visited.put(begin, true);

        while (!queue.isEmpty()) {
            String[] curr = queue.poll();

            if (curr[0].equals(target)) {
                return Integer.parseInt(curr[1]);
            }

            for (String next : graph.get(curr[0])) {
                if (!visited.get(next)) {
                    queue.offer(new String[]{next, String.valueOf(Integer.parseInt(curr[1]) + 1)});
                    visited.put(next, true);
                }
            }
        }

        return 0;
    }
}