package com.coding;

import java.util.Arrays;
import java.util.Scanner;

//21.01.02
//2005. 파스칼의 삼각형 D2
public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i=0; i<tc; i++){

            int num = sc.nextInt();
            System.out.println("#"+(i+1));
            int[] arr = new int[10]; // 이전배열
            arr[0] = 1;
            int[] brr = new int[10]; // 현재배열
            brr[0] = 1;
            int[] crr = new int[10]; // 빈배열
            crr[0] = 1;
            /**
             *첫번째 arr[10] 1
             *두번째 brr[10] 1
             * 왼쪽위(위 -1)+오른쪽위(위 0) = 나
             * 배열 계산 및 출력은 0이면 하지 않는다
             */
            System.out.println("1"); // 첫째줄 1
            if(num != 1) { //파스칼 행만큼
                for(int z=1; z<num; z++){

                    for(int j=1; j<num; j++){
                        //한 줄 배열 계산
                        brr[j] = arr[j-1]+arr[j];
//                    System.out.println("brr[j] = " + brr[j]+" == arr[j-1] = " + arr[j-1]+"+arr[j] = " + arr[j]);
                    }
                    for(int k=0; k<num; k++){
                        //배열 출력
                        if(brr[k]!=0){
                            if(k!=0){
                                System.out.print(" ");
                            }
                            System.out.print(brr[k]);
                        }else{
                            break;
                        }
                    }
                    System.out.println();
                    System.arraycopy(brr,1,arr,1,9);
                    System.arraycopy(crr,1,brr,1,9);
                }
            }
            // 테스트케이스마다
        }
    }
}
