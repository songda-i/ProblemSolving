package com.coding;

import java.util.Scanner;

// 20.12.31
// 1208. [S/W 문제해결 기본] 1일차 - Flatten D3
public class Flatten {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int tc = 10;
        for(int t = 1; t<= tc; t++){ // 10개 테스트케이스
            //1 입력
            int[] arr = new int[100];
            int dump = sc.nextInt(); 
            for(int i=0;i<100;i++) {
                arr[i] = sc.nextInt();
            }
            //test
//            System.out.println();
//            for(int i=0;i<100;i++) {
//                System.out.print(arr[i]);
//                System.out.print(" ");
//            }
//            System.out.println();
            /*
            while dump 0 이거나 평탄화(차이가 0이나 1) break
            arr의 가장 큰 것의 인덱스 / 값 --1
            arr의 가장 작은 것 인덱스 / 값 ++1
            if 큰 - 작 = 0 / 1
            큰 - 작 결과 리턴
            * */
//            //2 문제풀이
            int big = 0;
            int sml = 100;
            int bigIdx = 0;
            int smlIdx = 0;
            int ret = big-sml;
            while(dump!=0){
                for(int x=0; x<100; x++){
                    if(big < arr[x]){
                        big = arr[x];
                        bigIdx = x;
                    }
                    if(sml > arr[x]){
                        sml = arr[x];
                        smlIdx = x;
                    }
                }
                big = --arr[bigIdx];
                sml = ++arr[smlIdx];
                ret = big-sml;
                //테스트
//                System.out.println(dump+" 덤프.big: "+big+" bigIdx: "+bigIdx+"| small: "+sml+" smlIdx: "+smlIdx+"||차이: "+ret);

                if(ret==0 || ret==1){ //덤프 그만
                    //System.out.println("덤프 그만 ret = " + ret);
                    break;
                }
                --dump;
            }
            //3 최종 형태에서 진짜 max랑 min 찾기
            for(int x=0; x<100; x++){
                if(big < arr[x]){
                    big = arr[x];
                }
                if(sml > arr[x]){
                    sml = arr[x];
                }
            }
            ret = big-sml;
//            System.out.println();
//            for(int i=0;i<100;i++) {
//                System.out.print(arr[i]);
//                System.out.print(" ");
//            }
//            System.out.println("dump = " + dump);
//            System.out.println("big : "+big+" small : "+sml);
            System.out.println("#"+t+" "+ret);
        }
    }
}
