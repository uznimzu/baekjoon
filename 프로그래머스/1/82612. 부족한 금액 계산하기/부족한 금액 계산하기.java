class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long result = 0; 
        
        // count의 범위까지 i를 순회하면서 price와 곱하기
        // 곱한 값을 저장해두기
        for(int i = 1; i<=count; i++){
            long pay = price * i;
            result += pay;
        }
        
        // money와 result를 뺐을 때, 0보다 크면 answer 반환
        // 그외는 0을 반환
        answer = result - money;
        return answer>0 ? answer: 0;
    }
}