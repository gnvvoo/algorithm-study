class Solution {
    public int solution(String str1, String str2) {
        int index = 0;
        
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(index)){
                index++;
            }else{
                index = 0;
            }
            
            if(index == str2.length())
                return 1;
        }
        return 2;
    }
}