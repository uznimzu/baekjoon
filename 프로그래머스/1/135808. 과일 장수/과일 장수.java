/* 풀이 방법 
1. score의 총 길이와 사과의 수(m)을 나눠서 총 몇 개의 상자가 나오는 지 확인 => 상자 = box
2. score를 내림차순으로 정렬 후, m으로 끊어서 새로운 배열에 담기
3. 해당 새 배열에 있는 가장 작은 수 * m 을 한 값을 answer에 저장
4. box의 수 만큼 반복하여 총 ansewr 계산
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