import java.util.Scanner;

public class pdf5_Lab2 {

    // menu display
    static void displayMenu() {
        System.out.println();
        System.out.println("메뉴");
        System.out.println("1: 학생 성적 입력");
        System.out.println("2: 입력된 학생 목록 출력");
        System.out.println("3: 학생 삭제하기");
        System.out.println("4: 종료");
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int stValue = 3;
        int stInformation = 6;
        int[][] stList = new int[stValue][stInformation];
        int stCount = 0;
        int[][] newarray = new int[stList.length + stValue][stInformation];

        while (true){
            displayMenu();

            // 選択を入力
            System.out.print("선택: ");
            int user_choice = scan.nextInt();

            // ４と例外を先に入力
            if(user_choice == 4){
                System.out.println("프로그램 종료");
                break;
            } else if (user_choice <= 0 || user_choice > 4){
                System.out.println("다시 입력해주세요.");
            }

            //　１の場合
            //　学生情報入力前に配列の数の確認し足りなければ＋３する
            if(user_choice == 1){
                if(stCount == stList.length){
                    for(int i = 0; i < stCount; i++){
                        for(int j = 0; j < stList[i].length; j++){
                            newarray[i][j] = stList[i][j];
                        }
                    }
                    stValue = newarray.length;
                    stList = new int[stValue][stInformation];
                    for(int i = 0; i < stCount; i++){
                        for(int j = 0; j < stList[i].length; j++){
                            stList[i][j] = newarray[i][j];
                        }
                    }

                    for(int i = 0 ; i < newarray.length ; i++){
                        for(int j = 0; j < newarray[i].length; j++){
                            newarray[i][j] = 0;
                        }
                    }
                }

                //　学籍番号を入力し重複していれば更新するかどうかの画面を出す
                System.out.print("학번 입력: ");
                int inputStdNumber = scan.nextInt();

                for(int i = 0 ; i < stCount ; i++){
                    for(int j = 0 ; j < 1; j++){
                        if(inputStdNumber == stList[i][0]){
                            System.out.println("중복된 입력입니다.");
                            System.out.println("생택해주세요 : ");
                            char stNumber = scan.next().charAt(0);

                            switch (stNumber){
                                case 'Y':{
                                    System.out.println("국어 성적을 입력하세요");
                                    stList[i][1] = scan.nextInt();
                                    System.out.println("수학 성적을 입력하세요");
                                    stList[i][2] = scan.nextInt();
                                    System.out.println("영어 성적을 입력하세요");
                                    stList[i][3] = scan.nextInt();

                                    stList[i][4] = stList[i][1] + stList[i][2] + stList[i][3];
                                    stList[i][5] = stList[i][4] / 3;

                                    break;
                                }
                                case 'Q':{
                                    System.out.println("menu에 돌아갑니다");
                                    break;
                                }
                                default:{
                                    System.out.println("Error");
                                }
                            }
                        }
                    }
                }

                // 学生情報を入力
                stList[stCount][0] = inputStdNumber;
                System.out.println("국어 성적을 입력하세요");
                stList[stCount][1] = scan.nextInt();
                System.out.println("수학 성적을 입력하세요");
                stList[stCount][2] = scan.nextInt();
                System.out.println("영어 성적을 입력하세요");
                stList[stCount][3] = scan.nextInt();

                stList[stCount][4] = stList[stCount][1] + stList[stCount][2] + stList[stCount][3];
                stList[stCount][5] = stList[stCount][4] / 3;

                stCount++;
            }

            //　２の場合
            else if (user_choice == 2){
                int lavelCount = 0;
                String[] lavel = {"학번", "국어", "수학", "영어", "합계", "평균"};
                for(int i = 0; i <= stCount - 1; i++){
                    for(int j = 0; j < stList[i].length; j++){
                        System.out.print(lavel[lavelCount] + stList[i][j] + " ");
                        lavelCount++;
                        if(lavelCount == stList[i].length){
                            lavelCount = 0;
                        }
                    }
                    System.out.println();
                }
            }


            //　３の場合
            else if (user_choice == 3) {
                int lavelCount = 0;
                String[] lavel = {"학번", "국어", "수학", "영어", "합계", "평균"};
                for(int i = 0; i <= stCount - 1; i++){
                    for(int j = 0; j < stList[i].length; j++){
                        System.out.print(lavel[lavelCount] + stList[i][j] + " ");
                        lavelCount++;
                        if(lavelCount == stList[i].length){
                            lavelCount = 0;
                        }
                    }
                    System.out.println();
                }

                System.out.print("삭제한 학번: ");
                int inputStdNumber = scan.nextInt();
                for(int i = 0 ; i < stCount ; i++){
                    if(inputStdNumber == stList[i][0]){
                        for(int j = i; j < stCount - 1; j++){
                            stList[i][j] = stList[i + 1][j];
                            stCount--;
                        }
                    }
                }

                for(int i = 0; i <= stCount - 1; i++){
                    for(int j = 0; j < stList[i].length; j++){
                        System.out.print(lavel[lavelCount] + stList[i][j] + " ");
                        lavelCount++;
                        if(lavelCount == stList[i].length){
                            lavelCount = 0;
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
