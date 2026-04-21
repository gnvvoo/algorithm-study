import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int answerLength = 0;
        for(int n : arr){
            if(n % divisor == 0)
                answerLength++;
        }
        
        if(answerLength == 0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[answerLength];
        int index = 0;
        for(int n : arr){
            if(n % divisor == 0){
                answer[index++] = n;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}