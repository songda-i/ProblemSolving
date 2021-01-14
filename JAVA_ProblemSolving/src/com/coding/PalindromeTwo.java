package com.coding;

import java.util.Scanner;
import java.io.FileInputStream;
// 21.01.14
// 1216. [S/W 문제해결 기본] 3일차 - 회문2 D3
// 100x100에서 가능한 회문 중 가장 긴 길이
public class PalindromeTwo {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("res/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = 10;

        for(int tc = 1; tc <= T; tc++) //테케10
        {
            int maxLen = 1;
            int tcNum = sc.nextInt(); //테케번호
            String[][] arr = new String[100][100]; //모든 문자
            for(int i=0;i<100;i++){ // 한 줄씩 100개 받기
                String oneLine = sc.next();
                arr[i] = oneLine.split("");
            }
            boolean isOver = false;
            //모두 받아야 세로검사 [y][x]

            for(int x=0;x<100;x++){
                for(int num=100; num>15;num--){
                    for(int y=0; y<100-num+1; y++){
                        //세로
                        String sero="";
                        String reSero="";
                        //가로
                        String garo="";
                        String reGaro="";

                        for(int z=y; z<y+num; z++){
                            sero += arr[z][x];
                            garo += arr[x][z];

                        }
                        reSero = new StringBuffer(sero).reverse().toString();
                        reGaro = new StringBuffer(garo).reverse().toString();
//                        for(int z=y+num-1; z>y-1; z--){
//                            reSero += arr[z][x];
//                            reGaro += arr[x][z];
//                        }
                        if(sero.equals(reSero) || garo.equals(reGaro)){
                            if(maxLen<num){
                                maxLen=num;
//                                isOver=true;
                                break;
                            }
                        }
                    }
//                    if(isOver){break;}
                }
            }

            System.out.println("#"+tcNum+" "+maxLen);
        }
    }
}
