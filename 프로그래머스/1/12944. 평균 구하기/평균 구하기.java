class Solution {
    public double solution(int[] arr) {
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            cnt += arr[i];
        }
        return (double)cnt/arr.length;
    }
}