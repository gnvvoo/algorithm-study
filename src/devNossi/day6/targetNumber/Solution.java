package devNossi.day6.targetNumber;

import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        return (int)dfs(numbers, 0, 0).stream()
                .filter(n -> n == target)
                .count();
    }

    public List<Integer> dfs(int[] numbers, int curr, int index) {
        List<Integer> answer = new ArrayList<>();

        if (index == numbers.length) {
            answer.add(curr);
            return answer;
        }

        answer.addAll(dfs(numbers, curr + numbers[index], index + 1));
        answer.addAll(dfs(numbers, curr - numbers[index], index + 1));

        return answer;
    }
}