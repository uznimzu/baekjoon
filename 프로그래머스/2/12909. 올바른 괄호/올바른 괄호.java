// import java.util.*;

// class Solution {
//     boolean solution(String s) {
//         // 0. Stack 활용 -> 근데 왜 써야하지?
//         // 1. Char형 stack 생성 
//         Stack<Character> stack = new Stack<>();
//         int len = s.length();
        
//         // 2. 문자열 s의 길이만큼 반복하면서 (와 )체크
//         // 3. (를 만나면 스택에 새롭게 추가
//         // 4. 만약에, )를 만난다면 
//         for(int i=0; i<s.length();i++){
            
//             if(s.charAt(i) == '('){
//                 stack.push(s.charAt(i));
//                 }
//             else {
//                 if(stack.isEmpty()){
//                     return false;
//                 }
//                 stack.pop();
//             }
//         }
        
//         if(!stack.empty()){
//             return false;
//         }
//         return true;
//     }
// }

class Solution{
    boolean solution (String s){
        boolean answer = false;
        int cnt = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                cnt ++;
            }
            else if(s.charAt(i)==')'){
                cnt --;
            }
            if(cnt < 0){
                break;
            }
        }
        if(cnt == 0){
            return true;
        }
        return answer;
    }
}