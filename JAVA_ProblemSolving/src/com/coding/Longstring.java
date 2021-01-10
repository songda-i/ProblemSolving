package com.coding;

import java.util.Scanner;

//21.01.10
//1213. [S/W 문제해결 기본] 3일차 - String D3
public class Longstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc;
        for(int i=0;i<10;i++){
            tc = sc.nextInt();
            int cnt = 0;
            String shorts = sc.next(); //10자이내
            String[] shortArr = shorts.split("");

            //System.out.println( java.util.Arrays.toString(shortArr) );
            String longs = sc.next(); //1000자이내
            String[] longArr = longs.split("");
            //System.out.println( java.util.Arrays.toString(longArr) );
            //System.out.println(longArr.length);
            // 긴 문자열 속에 작은 문자열이 일치하는 횟수 ++1
            for(int j=0;j<longArr.length-shortArr.length+1;j++){
                /*  첫 글자가 맞으면
                    작은 문자열 갯수대로 그 뒤 맞춰보기
                * */
                if(longArr[j].equals(shortArr[0])){
                    boolean go = true;
                    for(int k =1;k<shortArr.length;k++){
                        if(!longArr[j+k].equals(shortArr[k])){
                            go = false;
                            break;
                        }
                    }
                    if(go){
                        cnt++;
                        //System.out.println(j);
                    }
                }
            }
//            System.out.println(arr[0]);

            System.out.println("#"+tc+" "+cnt);

        }
    }


}
