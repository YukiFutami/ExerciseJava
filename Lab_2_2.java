import java.util.Scanner;

import static java.lang.System.exit;

public class Lab_2_2 {
    static void displayMenu() {
        System.out.println();
        System.out.println("메뉴");
        System.out.println("1: 학생 성적 입력");
        System.out.println("2: 입력된 학생 목록 출력");
        System.out.println("3: 학생 삭제하기");
        System.out.println("4: 종료");
        System.out.println("선탁: ");
    }

    static void prtMatrix(float[][] argMatrix, int argNumOfStd) {
        int labelCount = 0;
        String[] label = {"학번", "국어", "수학", "영어", "합계", "평균"};
        for(int i = 0 ; i < argNumOfStd ; i++) {
            for(int j = 0 ; j < argMatrix[i].length ; j++) {
                System.out.print(label[labelCount] + argMatrix[i][j] + "\t");
                labelCount++;
            }
            System.out.println();
        }
    }

    static void newMatrix(int[] newArray){
        Scanner sc = new Scanner(System.in);
        int numOfStudents = 0;
        int MAX_STD_NUMBER = 3;
        final int FIELD_NUM = 6;
        int arrayCount = 0;

        float[][] stdMatrix = new float[MAX_STD_NUMBER][FIELD_NUM];

        if(numOfStudents > MAX_STD_NUMBER){
            arrayCount += 3;
            float[] NEW_ARRAY = new float[MAX_STD_NUMBER + arrayCount];
        }


        System.out.println("학번을 입력하세요");
        stdMatrix[numOfStudents][0] = sc.nextFloat();

        System.out.println("국어 성적을 입력하세요");
        stdMatrix[numOfStudents][1] = sc.nextFloat();

        System.out.println("수학 성적을 입력하세요");
        stdMatrix[numOfStudents][2] = sc.nextFloat();

        System.out.println("영어 성적을 입력하세요");
        stdMatrix[numOfStudents][3] = sc.nextFloat();

        stdMatrix[numOfStudents][4] = stdMatrix[numOfStudents][1] + stdMatrix[numOfStudents][2] + stdMatrix[numOfStudents][3];

        stdMatrix[numOfStudents][5] = stdMatrix[numOfStudents][4] / 3.0f;

        numOfStudents++;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numOfStudents = 0;
        int MAX_STD_NUMBER = 3;
        final int FIELD_NUM = 6;
        int arrayCount = 0;

        float[][] stdMatrix = new float[MAX_STD_NUMBER][FIELD_NUM];

        while (true) {
            displayMenu();

            int userChoice = sc.nextInt();

            if (userChoice > 4 || userChoice <= 0) {
                System.out.println("1~4 값을 입력하세요");
                continue;
            }

            if (userChoice == 4) {
                System.out.println("프로그램 종료");
                break;
            }

            switch (userChoice) {
                case 1:
                    System.out.println("학번을 입력하세요");
                    stdMatrix[numOfStudents][0] = sc.nextFloat();

                    System.out.println("국어 성적을 입력하세요");
                    stdMatrix[numOfStudents][1] = sc.nextFloat();

                    System.out.println("수학 성적을 입력하세요");
                    stdMatrix[numOfStudents][2] = sc.nextFloat();

                    System.out.println("영어 성적을 입력하세요");
                    stdMatrix[numOfStudents][3] = sc.nextFloat();

                    stdMatrix[numOfStudents][4] = stdMatrix[numOfStudents][1] + stdMatrix[numOfStudents][2] + stdMatrix[numOfStudents][3];

                    stdMatrix[numOfStudents][5] = stdMatrix[numOfStudents][4] / 3.0f;

                    numOfStudents++;
                    break;
                case 2:
                    prtMatrix(stdMatrix, numOfStudents);
                    break;
                case 3:
                    prtMatrix(stdMatrix, numOfStudents);

                    System.out.println("삭제 할 학생의 학번을 입렫하세요");
                    int delStdId = sc.nextInt();

                    if(delStdId == -1){
                        break;
                    }

                    int delStdIndex = -1;
                    for(int j = 0 ; j < numOfStudents ; j++) {
                        if((int)stdMatrix[j][0] == delStdId){
                            delStdIndex = j;
                        }
                    }

                    if (delStdIndex == -1){
                        System.out.println(delStdId + " 학번은 리스트에 존재하지 않습니다");
                        break;
                    }

                    // numOfStudents -> 3
                    // i  -> 1, 2
                    //
                    for(int i = delStdIndex ; i < numOfStudents - 1 ; i++) {
                        for(int j = 0 ; j < stdMatrix[i].length ; j++) {
                            stdMatrix[i][j] = stdMatrix[i+1][j];
                        }
                    }

                    for(int j = 0 ; j < stdMatrix[0].length ; j++) {
                        stdMatrix[numOfStudents - 1][j] = 0.0f;
                    }

                    numOfStudents--;

                    prtMatrix(stdMatrix, numOfStudents);
                    break;
                default:
                    System.out.println("Something went wrong");
                    exit(-1);
            }

        }

    }
}
