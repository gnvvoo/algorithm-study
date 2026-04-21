// class Solution {
//     public int solution(int n) {
//         int answer = 1;

//         while(n % answer != 1){
//             answer++;
//         }
//         return answer;
//     }
// }

// 내 코드
// i를 굳이 선언할 필요없이 answer을 i 대신 사용하면 간결해진다.
class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while(answer == 0){
            if(n % i == 1)
                answer = i;
            else
                i++;
        }
        return answer;
    }
}