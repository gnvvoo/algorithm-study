package devNossi.day6.combination;

import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {

        return dfs(new ArrayList<>(), 1, n, k);
    }

    public List<List<Integer>> dfs(List<Integer> curr, int start, int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();

        if (curr.size() == k) {
            answer.add(new ArrayList<>(curr));
            return answer;
        }

        for (int i = start; i <= n; i++) {
            curr.add(i);
            answer.addAll(dfs(curr, i + 1, n, k));
            curr.remove(curr.size() - 1);
        }

        return answer;
    }
}

