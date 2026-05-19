package devNossi.day6.findPrimeNumber;

import java.util.*;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        boolean[] visited = new boolean[numbers.length()];

        return (int)dfs(numbers, "", visited).stream()
                .filter(n -> isPrime(n))
                .count();
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public Set<Integer> dfs(String numbers, String curr, boolean[] visited) {
        Set<Integer> numberSet = new HashSet<>();

        if (!curr.equals(""))
            numberSet.add(Integer.parseInt(curr));

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                curr += numbers.charAt(i);
                numberSet.addAll(dfs(numbers, curr, visited));
                curr = curr.substring(0, curr.length() - 1);
                visited[i] = false;
            }
        }

        return numberSet;
    }
}