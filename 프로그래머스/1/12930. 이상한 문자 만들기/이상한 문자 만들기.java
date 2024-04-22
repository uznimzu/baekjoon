class Solution {
    public String solution(String s) {
        // 단어를 분리하되, 띄어쓰기도 포함해서 분리
        String[] arr = s.split(" ", -1);
        StringBuilder arr1 = new StringBuilder();
        
        // for문을 사용하여 분리된 단어 문자열을 돌면서
        for(int j=0; j<arr.length; j++){
            String word = arr[j];
            // 반환된 문자를 담아줄 새로운 StringBuilder 생성
            StringBuilder modified = new StringBuilder();
            // 각 문자열의 위치를 돌면서
            for(int i=0; i<word.length(); i++){
                // 짝수일 때
                if(i%2==0){
                    modified.append(Character.toUpperCase(word.charAt(i)));
                }
                // 홀수일 때
                else{
                    modified.append(Character.toLowerCase(word.charAt(i)));
                }
            }
            // 변환된 문자들을 담아주기
            arr1.append(modified.toString());
            
            if(j<arr.length-1){
                arr1.append(" ");
            }
        }
         return arr1.toString();
    }
}