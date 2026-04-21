class Solution {
    // substring(start, end) : start index에서 end index 전까지
    // str = 'hello';
    // str.substring(1, 3); // 'el'
    public String solution(String s) {
        String answer = "";
        int middle = s.length() / 2;
        if(s.length() % 2 == 0)
            answer = s.substring(middle-1, middle + 1);
        else
            answer = s.substring(middle, middle+1);
        
        return answer;
    }
}