class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toLowerCase();
        int p = 0, y = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p')
                p++;
            else if(s.charAt(i) == 'y')
                y++;
            
        }
        
        if(p == y)
            answer = true;
        else
            answer = false;
        
        return answer;
    }
}

// p y 로 안 나누고
// 변수 하나 지정해서 p 일경우 +, y일 경우 - 이런 식으로
// 마지막 조건을 변수 == 0 이면 true
// 변수 하나로 운영 가능