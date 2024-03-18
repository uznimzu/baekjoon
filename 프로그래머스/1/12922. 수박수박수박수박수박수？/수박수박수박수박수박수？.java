class Solution {
    public String solution(int n) {
        // 1. 문자열에 문자를 담는 변형을 주어야 하기 때문에 StringBuilder로 새로 선언
        StringBuilder sb = new StringBuilder();
       // 2. n번의 회차만큼 돌면서
        for(int i=0; i<n; i++){
        // 3. 만일 i의 나머지가 0이라면 "수"를 sb에 넣고
           if(i%2==0){
               sb.append("수");
           }
        // 4. i의 나머지가 0이 아니라면 "박"을 sb에 넣음
           else{
               sb.append("박");
           }
       }
        // StringBuilder의 경우 toString으로의 반환이 필요하므로 toString으로 반환한 값을 return함
        return sb.toString();
    }
}