/* [해결방법]
1. 정수형 list를 하나 만들기
    1-1. 피보나치 수열을 담아두기 위함
    1-2. n에 2 이상의 수가 들어가기 때문에 F(0),F(1)의 수를 담아두기
2. 반복문을 활용하되, i의 범위는 2로 시작해서 n이하로 설정
3. 반복문에 의해 생성되는 수들도 담아두기
    3-1.피보나치 공식에 의해 생성되는 수에 1234567로 나눈 나머지를 담아두는 새로운 변수 생성
    3-2. 해당 변수를 list에 도로 담아두기
4. list에서 해당하는 n번째 수 갖고오기
*/

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
