class Solution {
    public String solution(String s) {
        //1. 모든 단어의 앞글자를 제외하면 모두 소문자이기 때문에, 처음부터 소문자로 선언
        // 2. String에 계속 문자열에 변형을 주어야 하기 때문에 StringBuilder로 선언
        String str = s.toLowerCase();
        StringBuilder answer = new StringBuilder();
        String[] arr = str.split(" ");

        /* 3. arr에 들어있는 모든 단어의 첫 문자만 대문자로 만들어야 하기 때문에, 
            arr에서 substring으로 문자를 쪼갠 후 가장 앞자리만 대문자를 나머지는 소문자로 변형
         4. split(" ")의 경우, 연속되는 공백을 빈문자열로 처리해주기 때문에 if문으로 처리해주어야 substring을 사용할 때 오류 발생 X
         5. else 문이 필요한 이유는, "      hello"처럼 맨 처음 시작이 공백인데 해당 공백을 빈문자열로 처리할 수도 있기 때문임.*/
        
        for(int i = 0 ; i < arr.length ; i++){
           if(!arr[i].isEmpty()){
                String firstLetter = arr[i].substring(0,1).toUpperCase();
                String letters = arr[i].substring(1);
                answer.append(firstLetter).append(letters).append(" ");
           }
            else{
            answer.append(" ");
            }
        }

        //6. 뒤에 있는 공백 수 맞춰주기
        while(s.length() > answer.length()-1){
            answer.append(" ");
        }

        // 7. 맨 마지막에 공백이 하나 추가됐으므로, 해당 공백만 없애주기
        return answer.toString().substring(0, answer.length() - 1);
    }
}

        // StringBuilder 에 대해서 추가 학습을 하시오.
        /*  StringBuilder/String의 차이점 
            => 1. 객체 / 자료형  2. 가변/불변 객체
        String에 a라는 값이 저장되어 있고 b라는 값으로 변경한다고 가정할 때, string은 새로운 객체를 생성하게 됨 => a가 저장된 메모리 위치와 b가 저장된 새로운 메모리 위치는 서로 다름
        반면, StringBuilder의 경우 문자열을 추가,수정,삭제를 가능하게 만듦. 
            다만,리턴 시에 toString()으로 반환해줄 필요가 있음
        */