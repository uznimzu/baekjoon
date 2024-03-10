import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        ArrayList<Long> arrNum = new ArrayList<Long>();
        while(n>0){
            arrNum.add(n%10);
            n /= 10;
        }
        Collections.sort(arrNum, Collections.reverseOrder());
        
        long answer = 0;
        for(Long num : arrNum){
            answer = answer * 10+ num;
        }
        return answer;
    }
}