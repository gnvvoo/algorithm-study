class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int n = board[0].length;
        int safe[][] = new int[n+2][n+2];
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(board[i-1][j-1] == 1){
                    safe[i-1][j-1] = 1;
                    safe[i-1][j] = 1;
                    safe[i-1][j+1] = 1;
                    safe[i][j-1] = 1;
                    safe[i][j] = 1;
                    safe[i][j+1] = 1;
                    safe[i+1][j-1] = 1;
                    safe[i+1][j] = 1;
                    safe[i+1][j+1] = 1;
                }
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= n; j++){
                if(safe[i][j] != 1) answer++;
            }
        }
        
       
        return answer;
    }
}