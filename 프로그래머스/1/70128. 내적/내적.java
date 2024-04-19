class Solution {
    public long solution(int[] a, int[] b) {
        long answer = 0;
        for(int i=0; i<a.length; i++){
            long result = a[i]*b[i];
            answer += result;
        }
        return answer;
    }
}