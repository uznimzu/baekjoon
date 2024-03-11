import java.util.ArrayList;
import java.util.Arrays;

/* [풀이 방법]
1. 정답을 담아줄 새로운 ArrayList 생성 
-> ArrayList를 생성해야 하는 이유는, arr안에 정답이 되는(=divisor로 나누어지는) 원소가 몇 개 인지 모르기 때문.
2. 반복 + if문을 통해 나누어 떨어지는 것들은 모두 ArrayList에 담음
3. 만약 ArrayList가 텅텅 비어있다면, 그건 정답이 되는 원소들이 아예 존재하지 않았다는 뜻이므로 -1을 return 시키면 됨. 
3-1. 여기서 if/else문을 안 쓴 이유는, else로 처리해버렸을 때 arr의 원소를 다 돌지 않았는데 0이 안 되는 원소를 만나자마자 종료해버리기 때문 ... 이런! 여기서 당했다
4. ArrayList를 다시 배열로 만들어주기
5. 오름차순 정렬 사용 후 반환
*/
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
