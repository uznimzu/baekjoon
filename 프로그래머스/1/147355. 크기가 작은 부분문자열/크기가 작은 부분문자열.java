/*[풀이방법]
1. p의 길이는 1이상 18 이하 -> Long 사용
2. p의 길이와 문자열을 정수로 변환 -> 나중에 숫자 비교를 위함
3. 비교하는 반복문 실행
    3-1. for문의 길이는 t의 길이에서 p를 뺀 후 1을 더한 값이 됨(마치 날짜와 같은 개념)
    3-2. 문자열 t를 subString을 이용하여 문자열 잘라내기
    3-3. 잘라낸 문자열과 p를 서로 비교한 후, p가 크면 1씩 증가*/

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        Long pNum = Long.parseLong(p);
        
        for(int i =0; i<t.length()-pLen+1; i++){
            Long tNum = Long.parseLong(t.substring(i ,i+pLen));
            if(pNum>=tNum){
                answer += 1;
            }
            
        }
        return answer;
    }
}
