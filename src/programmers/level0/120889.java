class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sum = 0;
        int max = 0;
        
        for(int n: sides){
            sum += n;
            if(max < n) max = n;
        }
        
        if(sum - max > max)
            answer = 1;
        else
            answer = 2;
        
        return answer;
    }
}