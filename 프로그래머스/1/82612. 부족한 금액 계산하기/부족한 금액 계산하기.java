class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long result = 0; 
        
        for(int i = 1; i<=count; i++){
            long pay = price * i;
            result += pay;
        }
        answer = result - money;
        return answer>0 ? answer: 0;
    }
}