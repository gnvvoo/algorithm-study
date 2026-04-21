class Solution {
    public int solution(int n) {
        int mod = 1234567;
        
        int a = 0;
        int b = 1;
        
        for(int i = 2; i <= n; i++){
            int c = (a + b) % mod;
            a = b;
            b = c;
        }
        
        return b;
    }
}