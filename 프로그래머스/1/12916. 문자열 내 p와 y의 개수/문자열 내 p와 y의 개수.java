class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        int PNum1 = s.length()- s.replace(s.valueOf('P'),"").length();
        int PNum2 = s.length()- s.replace(s.valueOf('Y'),"").length();
        
        if(PNum1 == PNum2){
            return answer;
        }
        else{
            return false;
        }
    }
}