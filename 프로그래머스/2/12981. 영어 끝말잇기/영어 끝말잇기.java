import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        ArrayList<String> sbWords = new ArrayList<>();
        // for문을 돌면서 단어 중복여부 체크
        // 단어가 중복되면 번호와 차례 반환
        // 중복되지 않는다면 그냥 계속 쭉쭉 추가
        for (int i = 0; i < words.length; i++) {
            if (sbWords.contains(words[i])) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            sbWords.add(words[i]);
            
            // i번째 단어와 i-1의 단어의 맨 앞문자를 비교하면서 확인하기 => charAt으로 하면 됐구나...!!!!!! 여기서 어떻게 구현해야 하는 지 도무지 생각 안 나서 1시간 다 날렸네 ,,
            // 다를 시 번호와 촤례 반환..
            // i>0을 빼고 하게 된다면 런타임 에러가 난다고 한다.. 쓰읍 참으로 알다가도 모루것다 자바는
            if(i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                     return new int[]{(i % n) + 1, (i / n) + 1};
                    
                }
        }
        
        return new int[]{0, 0};
    }
}
