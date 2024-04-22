import java.util.*;

class Solution {
    public int solution(int n) {
        // 3진법을 담을 문자열 생성 
        String answer = "";
        
        // n이 0이 아닐 때까지 반복
        while(n!=0){
            // 3으로 나눈 나머지를 담기 -> 3진법 계산 첫번째단계 -> 이러면 앞뒤반전된 3진법으로 담김!
            int res = n % 3;
            answer += res;
            // 다시 n을 3으로 나눠서 계속 반복
            n= n/3;
        }
        // 3진법으로 저장된 걸 알리면서 ,, 10진법으로 바꿔서 출력
        return Integer.parseInt(answer, 3);
    }
}