/*풀이법
1. 지도를 돌면서 -> for문
2. 1이 있으면 #, 0이면 공백을 반환 
    2-1. 이진법으로 숫자를 계산
    2-2. 지도 2개 중 하나만 1이나 0이 있으면, #이나 공백을 반환하기 때문에 or 연산자 활용
3. 포맷팅으로 자릿수 잘 맞춰주기*/
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i<n; i++){
            answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]);
            answer[i] = String.format("%"+n+"s", answer[i]);
            answer[i] = answer[i].replace("1","#");
            answer[i] = answer[i].replace("0"," ");
        }
        return answer;
    }
}