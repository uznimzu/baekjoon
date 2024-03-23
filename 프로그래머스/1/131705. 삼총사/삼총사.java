/* 풀이 방법
1. for문을 3번 돌려서 ... 0이 되면 answer 수 증가시키기?.....쩝
*/
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i =0; i<number.length-2; i++){
            for(int k=i+1; k<number.length-1; k++){
                for(int j=k+1; j<number.length; j++){
                    if(number[i]+number[j]+number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }   
}