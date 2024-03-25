class Solution {
    public String solution(String s) {
        String answer = "";
        // 전체 길이를 파악
        int lenNum = s.length();
        // 길이가 짝수라면 가운데 두 글자 추출 필요
        if (lenNum % 2 == 0) {
            int half1 = lenNum / 2; 
            // answer에 charAt만 사용하여 메서드를 반환할 경우, 아스키코드 값이 더해진 후에 answer에 추가되는 구조이기 때문에 원하는 값을 얻지 못함
            // 따라서, string.valueOf로 char형을 string으로 변환한 후에 문자열을 연결하는 작업이 필요함
            answer = String.valueOf(s.charAt(half1-1)) + String.valueOf(s.charAt(half1));
        }
        // 홀수라면 절반에 해당하는 문자만 추출
        else{
            int half2 = lenNum / 2;
            answer += s.charAt(half2);
        }
        return answer;
    }
}
