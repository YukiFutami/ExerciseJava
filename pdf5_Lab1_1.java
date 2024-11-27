import java.util.Scanner;

public class pdf5_Lab1_1 {
    public static void main(String[] args) {

        // 学生成績表作成
        // ２次元配列を使用

        // メニュー画面を出す、
        // １～３を実行時再度メニュー画面を出力
        // 1: 学生成績入力
        // 2: 入力された学生の目録を出力
        // 3: 学生削除
        // 4: 終了

        String[] label = {"[学番: ", "]国語: ", "英語: ", "数学: ", "合計: ", "平均: "};
        Scanner scan = new Scanner(System.in);
        float[][] students = new float[3][6];
        int stCount = -1;
        int labelCount = 0;

        while (true) {
            System.out.println("メニュー");
            System.out.println("1: 学生成績入力");
            System.out.println("2: 入力された学生の目録を出力");
            System.out.println("3: 学生削除");
            System.out.println("4: 終了");
            System.out.print("選択: ");
            int choice = scan.nextInt();

            if (choice == 1) {
                System.out.print("学番: ");
                float stNum = scan.nextFloat();
                System.out.print("国語: ");
                float lng = scan.nextFloat();
                System.out.print("英語: ");
                float eng = scan.nextFloat();
                System.out.print("数学: ");
                float mat = scan.nextFloat();

                float sum = lng + eng + mat;
                float ave = sum / 3;
                stCount++;

                students[stCount][0] = stNum;
                students[stCount][1] = lng;
                students[stCount][2] = eng;
                students[stCount][3] = mat;
                students[stCount][4] = sum;
                students[stCount][5] = ave;

                System.out.println("入力が完了しました");

            } else if (choice == 2) {
                if (stCount >= 0) {
                    for (int i = 0; i <= stCount; i++) {
                        for (int j = 0; j < students[i].length; j++) {
                            System.out.print(label[labelCount]);
                            System.out.print(students[i][j] + "\t");
                            labelCount++;

                            // 科目がすべて出力し終わったら０に戻す
                            if (labelCount == label.length) {
                                labelCount = 0;
                            }
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("入力された学生情報はありません");
                }
            } else if (choice == 3) {
                while (true) {
                    System.out.print("学生目録: \n");
                    for (int i = 0; i <= stCount; i++) {
                        for (int j = 0; j < students[i].length; j++) {
                            System.out.print(label[labelCount]);
                            System.out.print(students[i][j] + "\t");
                            labelCount++;

                            // 科目がすべて出力し終わったら０に戻す
                            if (labelCount == label.length) {
                                labelCount = 0;
                            }
                        }
                        System.out.println();
                    }

                    System.out.println("削除したい学番を入力してください");
                    float delStNum = scan.nextFloat();

                    if (delStNum == -1) {
                        System.out.println("削除メニューを終了します");
                        System.out.println();
                        break;
                    } else {
                        // 削除はできたが反応しない値あり
                        // 削除してもループから抜け出せないため必ず－１を入力しなくてはいけない
                        for (int i = 0; i < stCount; i++) {
                            //該当番号存在なし
                            if (delStNum != students[i][0]) {
                                System.out.println("該当番号がありません、再度入力してください");
                            } // 該当番号あり
                            else if (delStNum == students[i][0]){
                                System.out.println("削除が完了しました");
                                for (int k = stCount; k <= stCount; k++) {
                                    for (int j = 0; j < students[k].length; j++) {
                                        students[k][j] = students[k + 1][j];
                                        System.out.print(students[k][j] + " ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
            } else if (choice == 4) {
                System.out.println("プログラム終了");
                break;
            } else {
                System.out.println("入力値が間違っています、再度入力してください");
            }
        }
    }
}