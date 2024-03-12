/* [풀이법]
1. string을 StringBuilder에 담아두기
1-1. StringBuilder에 넣어줘야 하는 이유는 string은 불변이라서 뭘..어케 해줄 수가 없음!!!! 어떤 것도 안됨.. 따라서, 변형을 줄 수 있는 StringBuilder 혹은 StringBuffer를 불러오는 작업이 수행돼야함(둘의 차이는 아직 ㅎㅎ;)
2. 뒤에 네자리 전까지만 for문을 돌면서 * 문자로 바꿔치기 해주기(setCharAt 사용)
3. StringBuilder는 반환 시 다시 문자열로 되돌려 놓는 작업이 필요함
3-1. StringBuilder는 메서드라서 문자열로 반환이 필요 */
class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);
        for(int i = 0; i<sb.length()-4; i++){
            sb.setCharAt(i,'*');
            
        }
        return sb.toString();
    }
}