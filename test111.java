import java.util.Arrays;

public class test111 {
    public static void main(String[] args) {

//        float[][] a = new float[3][6];
//
//        int stNum = 1;
//        int kokugo = 10;
//        int math = 20;
//        int eng = 30;
//        int sum = kokugo + math + eng;
//        int ave = sum / 3;
//
//        a[0][0] = stNum;
//        a[0][1] = math;
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if(j == 0) a[i][j] = stNum;
//                else if(j == 1) a[i][j] = kokugo;
//                else if(j == 2) a[i][j] = math;
//                else if(j == 3) a[i][j] = eng;
//                else if(j == 4) a[i][j] = sum;
//                else if(j == 5) a[i][j] = ave;
//                System.out.print(a[i][j]);
//            }
//            System.out.print(":");
//            break;
//        }

        int[][] num = {{1,2,3},{4,5,6},{7,8,9}};

        // nagasa
        int count = 1;
        for(int i = 0; i < count; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = num[i + 1][j];
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
         // zero
        for(int i = 0; i <= count; i++) {
            for(int j = 0; j < num[i].length; j++) {
                num[count + 1][j] = 0;
                System.out.print(num[count + 1][j] + " ");
            }
            System.out.println();
        }

    }
}
