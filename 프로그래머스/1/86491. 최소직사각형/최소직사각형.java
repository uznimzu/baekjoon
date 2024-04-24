class Solution { 
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        // for문 돌면서 가로,세로 값들 비교 -> 둘 중 큰 값들을 하나로 몰아넣기!!
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]) {
                int change = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = change;
            }
            // 현재 길이랑 w랑 비교하면서 w에서 가장 큰 값 구하기
            if(sizes[i][0] > w){
                w = sizes[i][0];
            }
            // 현재 길이랑 h랑 비교하면서 h에서 가장 큰 값 구하기
            if(sizes[i][1] > h){
                h=sizes[i][1];
            } 
        }
        // 곱하면 답 ~!
        return w*h;
    }
}
