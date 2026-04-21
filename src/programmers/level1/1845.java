class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int[] ponketmon = new int[nums.length];
        int ponkeCnt = nums.length;
        int typeCnt = 0;
        
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < ponketmon.length; j++){
                if(ponketmon[j] == nums[i])
                    break;
                
                if(ponketmon[j] == 0){
                    ponketmon[j] = nums[i];
                    typeCnt++;
                    break;   
                }
            }
        }
        
        if(typeCnt >= ponkeCnt / 2) answer = ponkeCnt/2;
        else answer = typeCnt;
        
        return answer;
    }
}