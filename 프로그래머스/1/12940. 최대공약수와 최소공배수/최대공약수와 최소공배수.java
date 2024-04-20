class Solution {
    public int[] solution(int n, int m) {
        // n과 m중 큰 수 및 작은 수 확인
        int large = Math.max(n,m);
        int small = Math.min(n,m);
        
        // 최대 공약수
        while(small != 0){
            int r = large % small;
            large = small;
            small = r;
        }
        
        // 최소공배수
        int gcd = n*m / large;
    
        int[] answer = {large, gcd};
        return answer;
    
    }
}