import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 1;
        Arrays.sort(numbers);
        
        for(int i = 0; i < 2; i++){
            answer *= numbers[numbers.length - 1 - i];
        }
        
        return answer;
    }
}