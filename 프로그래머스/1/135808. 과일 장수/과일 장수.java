/* 풀이 방법 
1. score의 총 길이와 사과의 수(m)을 나눠서 총 몇 개의 상자가 나오는 지 확인 => 상자 = box
2. score를 내림차순으로 정렬
3. 내림차순을 box만큼 반복하면서 
4. box에 담긴 가장 최저 점수 * m 을 한 값을 answer에 저장
*/

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int k, int m, int[] score) {
        int box = score.length / m;
        
        Arrays.sort(score);
        
        // 내림차순으로 정렬하기 위해 Comparator.reverseOrder() 사용
        Integer[] scoreInteger = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreInteger, Comparator.reverseOrder());
        
        int answer = 0;
        for(int i=0; i<box; i++){
            int sum = scoreInteger[m*i+m-1];
            answer += sum*m ;
        }
        return answer;
    }
}