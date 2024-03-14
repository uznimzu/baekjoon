// arnlist<integer> -> int[]로 반환하는 거 잊지 말기

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        if(arr.length == 1){
            return new int[]{-1};
        }
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min=arr[i];
            }
        }
        
        for(int i=0; i<arr.length; i++){
          if(arr[i] != min){
              answer.add(arr[i]);
          }
        }
        // ArrayList<Integer>를 int[]로 변환
        int[] result = new int[answer.size()];
        for(int i =0; i<answer.size(); i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}
