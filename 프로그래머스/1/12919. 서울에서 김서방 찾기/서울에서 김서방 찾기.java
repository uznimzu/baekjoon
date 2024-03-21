/*풀이방법
1. seoul 배열 순환
2. 순환하면서 Kim이라는 단어가 있다면 해당 단어의 순서 추출
3. 문자열에 넣어서 다시 반환*/

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length; i++){
           if(seoul[i].equals ("Kim")){
               answer = "김서방은 " + i + "에 있다";
           }
        }
        return answer;
    }
}
