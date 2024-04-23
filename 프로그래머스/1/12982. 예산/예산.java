import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++){
            answer += d[i];
        }
        if(answer <= budget){
            result += d.length;
        }
        else if(answer != budget){
            int answer2 = 0;
            for(int i=0; i<d.length; i++){
                answer2 += d[i];
                if(answer2 > budget){
                    result += i;
                    break;
                }
            }
            
        }
         return result;
    }
}