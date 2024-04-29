class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int a = commands[i][0]-1;
            int b = commands[i][1];
            int c = commands[i][2]-1;

            // 원본 배열의 일부를 복사합니다.
            int[] tempArray = new int[b - a];
            for (int j = 0; j < tempArray.length; j++) {
                tempArray[j] = array[a + j];
            }

            // 퀵 정렬을 실행합니다.
            quickSort(tempArray, 0, tempArray.length - 1);
            
            // 정렬된 배열에서 k번째 수를 찾습니다.
            answer[i] = tempArray[c];
        }
        return answer;
    }
    
    // 퀵 정렬 메서드
    private void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }
    
    // 분할 메서드
    private int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = (left - 1);
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                // arr[i]와 arr[j]를 교환
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // arr[i+1]와 pivot(=arr[right])을 교환
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        
        return i + 1;
    }
}
