class Solution {
    public int solution(int num) {
        int attempt = 0;
        long longNum = (long)num;
        
        while(attempt < 500){
            if(longNum == 1)
                return attempt;
            
            if(longNum % 2 == 0)
                longNum /= 2;
            else
                longNum = longNum * 3 + 1;
            
            attempt++;
        }
        
        return -1;
    }
}