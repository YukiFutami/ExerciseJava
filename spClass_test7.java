import java.util.Scanner;

public class spClass_test7 {
    public static void main(String[] args) {

        // 사용자로부터 M, N정수를 입력 받아, M X N Matrix를 출력하세요.
        // 예) M : 3, N : 2
        // * *
        // * *
        // * *
        // 예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력

        // Matrix
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value to M:");
        int m = sc.nextInt();

        System.out.println("Enter value to N:");
        int n = sc.nextInt();

        int[][] Matrix = new int[m][n];
        for(int i = 0; i < Matrix.length; i++){

            for(int j = 0; j < Matrix[i].length; j++){
                System.out.print(" * ");
            }
            System.out.println( );
        }

        // L2
        // 문제는 동일, 출력값 변경
        // 예) M : 3, N : 3
        //   * *
        // *   *
        // * *




    }
}
