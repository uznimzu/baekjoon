import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        // 배열 정렬 -> 가장 많은 부서를 지원해주기 위해서라면, 가장 작은 예산을 요구한 경우부터 차례로 더한 값이 최대라고 생각하기 때문
        Arrays.sort(d);
        
        // 배열 순회
        for(int i=0; i<d.length; i++){
            answer += d[i];
        }
        
        // 만약, 배열 원소값들이 예산보다 작거나 같다면 배열 길이가 최대
        if(answer <= budget){
            result += d.length;
        }
        
        // 배열 원소의 합이 예산보다 클 경우
        else if(answer != budget){
            int answer2 = 0;
            // 다시 배열을 돌면서
            for(int i=0; i<d.length; i++){
                answer2 += d[i];
                // 예산보다 초과되는 순간을 구함
                if(answer2 > budget){
                    result += i;
                    // break를 써서 for문 정지!
                    break;
                }
            }
            
        }
         return result;
    }
}
