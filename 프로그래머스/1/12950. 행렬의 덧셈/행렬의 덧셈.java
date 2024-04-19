/*[풀이방법]
1. arr1과 arr2 모두 2차원 배열 -> answer의 길이도 arr1의 길이만큼 맞춰주기
2. for문을 돌면서 각 행과 열의 원소끼리 더하기*/

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i<arr1.length; i++){
            for(int k=0; k<arr1[0].length; k++){
                answer[i][k]=arr1[i][k]+arr2[i][k];
            }
        }
        return answer;
    }
}