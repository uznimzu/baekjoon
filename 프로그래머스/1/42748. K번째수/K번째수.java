import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] result = {};

        // command에 들어있는 각 원소들을 분리하고, 새로운 변수에 할당
        for(int i=0; i<commands.length; i++){
                int a = commands[i][0]-1;
                int b = commands[i][1];
                int c = commands[i][2]-1; 
    
                // 원래 배열을 복사하고, a와 b사이에 있는 것들만 갖고온 후 정렬
                result = Arrays.copyOfRange(array, a, b);
                Arrays.sort(result);
            
                // result[c]에 있는 게 정답
                answer[i] = result[c]; 
        }
        return answer;
    }
}
