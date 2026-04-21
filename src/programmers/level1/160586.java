import java.util.Arrays;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        int[] key = new int[26];
        Arrays.fill(key, 101);
        
        for(String s: keymap){
            for(int i = 0; i < s.length(); i++){
                if(key[s.charAt(i)-65] > i+1)
                    key[s.charAt(i)-65] = i+1;
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            for(int j = 0; j < targets[i].length(); j++){
                if(key[targets[i].charAt(j)-65] == 101){
                    answer[i] = -1;
                    break;   
                }
                
                answer[i] += key[targets[i].charAt(j)-65];
            }
        }
        
        return answer;
    }
}