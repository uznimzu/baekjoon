import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[3];
        
        int[] one = {1,2,3,4,5};
        int oneCnt = 0;
        
        int[] two = {2,1,2,3,2,4,2,5};
        int twoCnt =0;
        
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int threeCnt = 0;
        
        // 맞힌 문제 개수 찾기
        for(int i=0; i<answers.length; i++){

            if(answers[i] == one[i % one.length]){
                oneCnt += 1;
                result[0] += oneCnt;
            }
            if(answers[i] == two[i % two.length]){
                twoCnt += 1;
                result[1] += twoCnt;
            }
            if(answers[i] == three[i % three.length]){
                threeCnt += 1;
                result[2] += threeCnt;
            }
        }
        
        // 가장 많이 맞힌 문제 수 찾기
        int maxAnswer = Math.max(result[0], Math.max(result[1], result[2]));
        
        // 가장 많이 맞힌 문제 수랑 같은 사람 찾기
        for(int k=0; k<result.length; k++){
            if(result[k] == maxAnswer){
                list.add(k+1);
            }
        }
        
        
        // 배열로 반환
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}