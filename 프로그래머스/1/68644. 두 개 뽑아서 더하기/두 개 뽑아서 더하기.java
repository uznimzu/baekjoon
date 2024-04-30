import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        // 중복되는 값은 제외해서 생성하기 위해서 set 사용
        HashSet<Integer> sum = new HashSet<>();
        
        // for문을 돌면서 각 원소의 합 구하기
        for(int i=0; i<numbers.length; i++){
            for(int k = i+1; k<numbers.length; k++){
                sum.add(numbers[i]+numbers[k]);
            }
        }
        
        // set을 다시 배열로 반환(Integer => int 배열로 변환)
        Integer[] result = sum.toArray(new Integer[0]);
        int[] answer = new int[result.length];
        for(int i=0; i<result.length; i++){
            answer[i] = result[i];
        }
        
        // answer 오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }
}