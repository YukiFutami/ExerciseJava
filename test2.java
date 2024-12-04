import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args){

        int stValue = 3;
        int stInformation = 6;
        int stCount = 3;
        int[][] stList = new int[stValue][stInformation];
        int[][] newarray = new int[stList.length + stValue][stInformation];


        if(stCount == stList.length){
            for(int i = 0; i < stCount; i++){
                for(int j = 0; j < stList[i].length; j++){
                    newarray[i][j] = stList[i][j];
                    System.out.print(newarray[i][j] + " ");
                }
                System.out.println();
            }
            stValue = newarray.length;
            stList = new int[stValue][stInformation];
            for(int i = 0; i < stCount; i++){
                for(int j = 0; j < stList[i].length; j++){
                    stList[i][j] = newarray[i][j];
                    System.out.print(stList[i][j] + " ");
                }
                System.out.println();
            }

            for(int i = 0 ; i < newarray.length ; i++){
                for(int j = 0; j < newarray[i].length; j++){
                    newarray[i][j] = 0;
                }
                System.out.println();
            }
        }
        System.out.println(Arrays.deepToString(stList));

        for(int i = 0; i < stCount; i++){
            for(int j = 0; j < stList[i].length; j++){
                newarray[i][j] = stList[i][j];
                System.out.print(newarray[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < stList.length; i++){
            for(int j = 0; j < stList[i].length; j++){
                System.out.print(newarray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
