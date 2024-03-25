class Solution {

    public String solution(String s) {
        String answer = "";
        int lenNum = s.length();
        if (lenNum % 2 == 0) {
            int half1 = lenNum / 2; 
            char result1 = s.charAt(half1);
            char result2 = s.charAt(half1-1);
            answer = String.valueOf(result2) + String.valueOf(result1);
        }
        else{
            int half2 = lenNum / 2;
            answer += s.charAt(half2);
        }
        return answer;
    }
}
