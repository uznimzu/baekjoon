import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        
        //피보나치 수열 수행
        for(int i =2; i<=n; i++){
            int result = (list.get(i-1) + list.get(i-2))%1234567;
            list.add(result);
        }
        return list.get(n);
    }
}