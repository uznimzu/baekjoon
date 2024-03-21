import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stackInt = new Stack<>();

        stackInt.push(arr[0]);
        for(int i = 0; i<arr.length; i++){
            if(stackInt.peek() != arr[i]){
                stackInt.push(arr[i]);
            }
        }
        int[] answer = new int[stackInt.size()];
        for(int i=0; i<stackInt.size(); i++){
            answer[i] = stackInt.get(i);
        }
        return answer;
    }
}