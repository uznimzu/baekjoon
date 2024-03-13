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
            if(i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                     return new int[]{(i % n) + 1, (i / n) + 1};
                    
                }
        }
        
        return new int[]{0, 0};
    }
}
