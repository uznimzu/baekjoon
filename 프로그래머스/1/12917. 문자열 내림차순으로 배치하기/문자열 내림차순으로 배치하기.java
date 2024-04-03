
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 정렬 메서드를 쓰기 위하여 배열에 담아두기
        char [] result = s.toCharArray();
        Arrays.sort(result);
        
        // 내림차순 정렬을 하기 위해서 배열에 담아둔 후, for문을 거꾸로 돌기
        for(int i = result.length-1; i>=0; i--){
            answer += result[i];
        }
        return answer;
    }
}