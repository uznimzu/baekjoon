class Solution {
    public int[] solution(String s) {
        // 문자열 길이와 동일한 크기의 배열을 생성 후 for문을 돌면서 모든 값을 -1로 설정
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }
        
        // 문자열을 순회하면서 각 문자에 대해 이전에 나타난 위치를 찾기
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            for (int j = i - 1; j >= 0; j--) {
                // 위치를 찾았다면 거리 계산
                if (s.charAt(j) == currentChar) {
                    answer[i] = i - j;
                    break; 
                }
            }
        }
        return answer;
    }
}
