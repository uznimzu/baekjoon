class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        for(int i =0; i<num.length(); i++){
             answer[i] = num.charAt(num.length() - 1 - i) - '0';
        }
        return answer;
    }
}