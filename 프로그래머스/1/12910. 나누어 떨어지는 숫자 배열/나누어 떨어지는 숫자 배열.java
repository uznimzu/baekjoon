import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                result.add(arr[i]);
            }    
        }
        if(result.isEmpty()){
            return new int[] {-1};
        }
         int [] answer = new int[result.size()];
            for(int i = 0; i< result.size(); i++){
                answer[i] = result.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}