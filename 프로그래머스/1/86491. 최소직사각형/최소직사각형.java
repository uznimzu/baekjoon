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
            // 최대 w,h구하기
            w = Math.max(w,sizes[i][0]);
            h = Math.max(h, sizes[i][1]);

        }
        // 곱하면 답 ~!
        return w*h;
    }
}
