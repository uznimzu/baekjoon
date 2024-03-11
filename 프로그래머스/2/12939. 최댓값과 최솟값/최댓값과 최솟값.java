import java.util.Arrays;
/*풀이 방법
1. 문자열 -> 공백으로 분리 -> 정수 배열 변환(숫자 비교하기 위해서)
2. min과 max를 임의로 할당(3번에서 쓰기 위함)
3. for문으로 최댓값 / 최솟값 구하기
-> numbers[i]>max 라면 max에 할당하는 식으로 .. 
4. 최솟값과 최솟값을 문자열로 출력*/

class Solution {
    public String solution(String s) {
        String [] result = s.split(" ");
        int [] numbers = new int[result.length];
        for(int i = 0; i<result.length; i++){
            numbers[i] = Integer.parseInt(result[i]);
        }
        
        int min = numbers[0];
        int max = numbers[0];
        
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min + " " + max;
    }
}