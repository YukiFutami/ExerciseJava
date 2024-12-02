public class TestToday {
    public static void main(String[] args) {
//        if(userChoice == 1){
//            //　もし学生の数が３以上なら、先に配列を拡大する
//            if(numOfStudents > stdMatrix.length){
//                arrayCount += 3;
//
//                float[][] keepArray = new float[arrayCount][6];
//                for(int i = 0; i < numOfStudents; i++){
//                    for(int j = 0; j < keepArray[i].length; j++){
//                        keepArray[i][j] = stdMatrix[i][j];
//                        stdMatrix[i][j] = 0;
//                    }
//                }
//
//                stdMatrix = new float[arrayCount][6];
//
//                for(int i = 0; i < numOfStudents; i++){
//                    for(int j = 0; j < stdMatrix[i].length; j++){
//                        stdMatrix[i][j] = keepArray[i][j];
//                        keepArray[i][j] = 0;
//                    }
//                }
//                System.out.println("현재 행수는: " + arrayCount + "입니다.");
//            }
//
//            System.out.print("학번을 입력하세요:");
//            float stNum = sc.nextFloat();
//
//            //　学籍番号を入力し、もし重複しているならユーザー選択を出力する
//            for(int i = 0; i < numOfStudents; i++){
//                for(int j = 0; j < 1; j++){
//                    if(stNum == stdMatrix[i][j]){
//                        System.out.println("중복된 입력이 있습니다 ");
//                        System.out.println("덮어쓰기를 희망합니까? (Y: 덮어쓰기 진행, Q: 메뉴로 돌아가기):");
//                        String input = sc.next().toUpperCase();
//
//                        switch (input){
//                            case "Y":{
//                                System.out.print("국어 성적: ");
//                                float kokugo = sc.nextFloat();
//                                System.out.print("영어 성적: ");
//                                float eng = sc.nextFloat();
//                                System.out.print("수학 성적: ");
//                                float math = sc.nextFloat();
//
//                                float sum = kokugo + eng + math;
//                                float ave = sum/ 3;
//
//                                for(int newdata = 1; newdata < stdMatrix[i].length; newdata++){
//                                    if(newdata == 1) stdMatrix[i][newdata] = kokugo;
//                                    else if (newdata == 2) stdMatrix[i][newdata] = eng;
//                                    else if (newdata == 3) stdMatrix[i][newdata] = math;
//                                    else if (newdata == 4) stdMatrix[i][newdata] = sum;
//                                    else if (newdata == 5) stdMatrix[i][newdata] = ave;
//                                    System.out.print(stdMatrix[i][j]);
//                                    System.out.print(" : ");
//                                }
//                                break;
//                            }
//                            case "Q":{
//                                System.out.println("메뉴로 돌아갑니다");
//                                break;
//                            }
//                            default:{
//                                System.out.println("잘 못된 입력입니다. 다시 입력해주세요.");
//                            }
//                        }
//                    }
//
//                    if (stNum != stdMatrix[i][j]){ //　学生の入力を行う
//                        System.out.print("국어 성적: ");
//                        float kokugo = sc.nextFloat();
//                        System.out.print("영어 성적: ");
//                        float eng = sc.nextFloat();
//                        System.out.print("수학 성적: ");
//                        float math = sc.nextFloat();
//
//                        float sum = kokugo + eng + math;
//                        float ave = sum/ 3;
//
//                        for (int newSt = numOfStudents; newSt < stdMatrix.length; newSt++) {
//                            for (int newStData = 0; newStData < stdMatrix[newSt].length; newStData++) {
//                                if(newStData == 0) stdMatrix[newSt][newStData] = stNum;
//                                else if(newStData == 1) stdMatrix[newSt][newStData] = kokugo;
//                                else if(newStData == 2) stdMatrix[newSt][newStData] = math;
//                                else if(newStData == 3) stdMatrix[newSt][newStData] = eng;
//                                else if(newStData == 4) stdMatrix[newSt][newStData] = sum;
//                                else if(newStData == 5) stdMatrix[newSt][newStData] = ave;
//                                System.out.print(stdMatrix[newSt][newStData]);
//                                System.out.print(" : ");
//                            }
//                        }
//                        break;
//                    }
//                }
//            }
//            numOfStudents++;
//        }
//        else if(userChoice == 2){
//
//        }
//        else if(userChoice == 3){
//
//        }
//        else if(userChoice == 4){
//            System.out.println("프로그램 종료");
//            break;
//        }
//        else {
//            System.out.println("잘 못된 입력입니다. 다시 입력해주세요.");
//        }
   }
}
