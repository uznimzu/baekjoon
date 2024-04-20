import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++){
                    System.out.print('*');

            }
        System.out.println(); // 한 줄이 끝날 때마다 새로운 줄로 넘어감

        }
    }
}