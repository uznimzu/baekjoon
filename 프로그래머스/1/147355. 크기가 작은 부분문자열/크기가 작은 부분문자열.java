class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        Long pNum = Long.parseLong(p);
        
        for(int i =0; i<t.length()-pLen+1; i++){
            Long tNum = Long.parseLong(t.substring(i ,i+pLen));
            if(pNum>=tNum){
                answer += 1;
            }
            
        }
        return answer;
    }
}