class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        long num = 0;
        for(int i = 0; i<absolutes.length; i++){
            if(signs[i]){
                num+=absolutes[i];
            }
            else{
                num -= absolutes[i];
            }
        }
        return (int)num;
    }
}