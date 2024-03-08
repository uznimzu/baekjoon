import java.util.Stack;
/*해결 방법
1. StringBuilder로 문자열 s를 넣어준 후에 자유롭게 값들을 수정할 수 있게 할 것
2. 문자열을 돌면서 charAt을 사용하여 i번째와 i+1번째의 값이 서로 같은지 비교할 것 => 같으면 삭제 
3. 성공적으로 짝을 지어서 제거가 됐다는 건 .. 다 제거가 됐을 때 문자열의 길이가 0이 된다는 뜻 => while문의 조건식으로 넣어주면 좋을 것 같음
*/
/* class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder str = new StringBuilder(s);

        while (str.length() > 0) {
            boolean foundPair = false;

            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    str.delete(i, i + 2);
                    foundPair = true;
                    break;
                }
            }

            if (!foundPair) {
                break;
            }
        }

        return str.length() == 0 ? 1 : 0;
    }
} */

class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        return stack.isEmpty() ? 1:0;
    }
}
