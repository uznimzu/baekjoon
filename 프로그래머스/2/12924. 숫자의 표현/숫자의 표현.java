class Solution {
    public int solution(int n) {
        // n보다 작은 수들을 차례로 돌아가면서(for문) 합을 구한 후, 해당 합이 n보다 큰지 판별.(while문)
        // 만일 같다면 answer에 횟수 추가
        // n보다 크다면 맨 처음에 더한 수를 차례로 빼보기(그동안 끝에 수를 추가하면서 더했으니 이번에는 반대로 진행. 또한, 숫자들이 연속해서 더해져야 하기 때문에 중간에 있는 수는 빼지 X)
        int answer = 0;
        int start = 1;
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
            while (sum > n) {
                sum -= start;
                start++;
            }
            if (sum == n) {
                answer++;
            }
        }
        return answer;
    }
}
