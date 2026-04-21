class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[][] keypad = {{2,1}, {1, 4}, {2, 4}, {3, 4}, {1, 3}, {2, 3}, {3, 3}, {1, 2}, {2, 2}, {3, 2}};
        int[] rightPos = {3, 1};
        int[] leftPos = {1, 1};
        
        
        for(int i = 0; i < numbers.length; i++){        
            if(numbers[i]%3 == 1){
                answer += 'L';
                leftPos = keypad[numbers[i]];
            }
            else if(numbers[i] % 3 == 0 && numbers[i] != 0){
                answer += 'R';
                rightPos = keypad[numbers[i]];
            }
            else{
                if(getDist(leftPos, keypad[numbers[i]]) < getDist(rightPos, keypad[numbers[i]])){
                    answer += 'L';
                    leftPos = keypad[numbers[i]];
                } else if (getDist(leftPos, keypad[numbers[i]]) > getDist(rightPos, keypad[numbers[i]])) {
                    answer += 'R';
                    rightPos = keypad[numbers[i]];
                } else {
                    if(hand.equals("left")){
                        answer += 'L';
                        leftPos = keypad[numbers[i]];
                    } else {
                        answer += 'R';
                        rightPos = keypad[numbers[i]];
                    }
                }
            }
        }
        return answer;
    }
    
    public int getDist(int[] start, int[] end){
        int dist = 0;
        int dx = end[0] - start[0];
        int dy = end[1] - start[1];
        
        if(dx < 0) dx *= -1;
        if(dy < 0) dy *= -1;
        
        dist = dx + dy;
        
        return dist;
    }
}