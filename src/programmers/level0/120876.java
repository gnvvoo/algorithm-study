class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201];
        int answer = 0;
        
        for(int[] line : lines){
            for(int i = line[0]; i < line[1]; i++){
                arr[i + 100]++;
            }
        }
        
        for(int x : arr){
            if(x >= 2) answer++;
        }
        
        return answer;
    }
}