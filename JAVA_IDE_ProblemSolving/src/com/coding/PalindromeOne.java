package com.coding;

import java.util.Scanner;

//21.01.13
//1215. [S/W 문제해결 기본] 3일차 - 회문1 D3

public class PalindromeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        int num;
        int cnt = 0;
        for(int tc = 1; tc <= T; tc++) //테케10
        {
            num = sc.nextInt();
            String[][] arr = new String[8][8]; //모든 문자
            for(int i=0;i<8;i++){ // 한 줄씩 받기
                String oneLine = sc.next();
                arr[i] = oneLine.split("");
                //가로검사
                String[] reArr = oneLine.split("");
                for(int j=0; j<8-num+1; j++){ // 한 줄씩 가로 검사
                    String piece = oneLine.substring(j,j+num);
                    String reStr = "";
                    for(int k=j+num-1; k>=j; k--){
                        reStr += reArr[k];
                    }
//                    System.out.println(piece+","+reStr);
                    if(piece.equals(reStr)){
                        cnt++;
                    }
//                    String rePiece = oneLine.substring(j-1+num,j-1);

//                    StringBuffer reverse = new StringBuffer(piece);
//                    StringBuffer temp = reverse.reverse();
//                    if(reverse.equals(temp)){
//                        cnt++;
//                    }
                }
            }
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 1 1차원 배열 []
				 substring(시작,시작+4) =eq reverse(시작+4, 시작)

				 2 2차원 배열 [][] 가로세로
        for(int tc = 1; tc <= T; tc++) //테케10
        {
            num = sc.nextInt();
            String[] nrr = new String[num];
            String[][] arr = new String[8][8];
            for(int i=0;i<8;i++){
                String oneLine = sc.next();
                String[] oneArr = oneLine.split("");
                arr[i] = oneArr;
                System.out.println(java.util.Arrays.toString(oneArr));
        }
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////
            //모두 받아야 세로검사 [y][x]
            for(int x=0;x<8;x++){
                for(int y=0; y<8-num+1; y++){
                    String piece="";
                    String rePiece="";
                    for(int z=y; z<y+num; z++){
                        piece += arr[z][x];
                    }
                    for(int z=y+num-1; z>y-1; z--){
                        rePiece += arr[z][x];
                    }
//                    System.out.println(piece+",,"+rePiece);
                    if(piece.equals(rePiece)){
                        cnt++;
                    }
                }
            }

            System.out.println("#"+tc+" "+cnt);
            cnt = 0;
        }
    }
}
