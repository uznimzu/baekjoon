class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                // 소문자 처리
                ch = (char)('a' + (ch - 'a' + n) % 26);
            } else if(ch >= 'A' && ch <= 'Z'){
                // 대문자 처리
                ch = (char)('A' + (ch - 'A' + n) % 26);
            }
            answer.append(ch);
        }
        return answer.toString();
    }
}
