/* 풀이방법 
1. 배열 안에 있는 원소들의 최대공약수를 먼저 찾고
2. 전체 다 곱한 값의 최대공약수를 나누기
*/
class Solution {
    // 최대공약수를 구하는 메소드(유클리드 호제법)
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    public int solution(int[] arr) {
        int answer = 0;
        //최대 공약수
        int g = gcd(arr[0], arr[1]);
        //최대 공배수
        answer = (arr[0]*arr[1]) / g;
        
        for(int i=2; i<arr.length; i++){
            g = gcd(answer, arr[i]);
            answer = (answer * arr[i]) / g;
        }
        return answer;
    }
}