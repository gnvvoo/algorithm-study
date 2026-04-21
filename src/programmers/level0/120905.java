class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int resultLength = 0;
        
        for(int num: numlist){
            if(num % n == 0)
                resultLength++;
        }
        
        int[] answer = new int[resultLength];
        int resultIndex = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0)
                answer[resultIndex++] = numlist[i];
        }
        
        return answer;
    }
}