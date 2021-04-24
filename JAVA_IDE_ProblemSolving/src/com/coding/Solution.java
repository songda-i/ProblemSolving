package com.coding;

import java.util.Arrays;
import java.util.Scanner;
// 20.12.29
// 1206. [S/W 문제해결 기본] 1일차 - View D3
public class Solution {
    public static void main(String args[]) throws Exception {
        //System.setIn(new FileInputStream("res/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T=2; // 테스트케이스 갯수 10


        // 2 문제풀이 :
        for(int test_case = 1; test_case <= T; test_case++)
        {
            // 1 입력
            int weight; // 1000이하
            weight=sc.nextInt();
            int[] arr = new int[weight];
            for(int i=0; i<weight; i++){
                arr[i] = sc.nextInt();
            }
            int[] brr = new int[5];
            int center = 0;
            int result = 0; // 출력결과 합계
            //2-1연속된 5개 중에서 가운데 값이 제일 클 때, 두번째 큰 값을 뺀 수의 합
            /*
            5개씩 배열을 볼 수 있게 한다. 0에서5 ~ w-5에서 w까지
            brr의 가운데 값
            brr 오름차순 정렬 했을 때, 가장 큰 값이 가운데 값인지?
            첫번째 - 두 번째로 큰 값을 빼준다, 모은다
            * */
            for(int j = 0; j <= weight-5; j++) {
//                System.out.println("j = " + j);
                brr = Arrays.copyOfRange(arr, j, j+5);
//                System.out.println("정렬전 = " + brr[0] + brr[1] + brr[2] + brr[3]+ brr[4] );
                center = brr[2];
                Arrays.sort(brr); //오름차순
//                System.out.println("정렬후 = " + brr[0] + brr[1] + brr[2] + brr[3]+ brr[4]);
                if (center == brr[4]) {
//                    System.out.println("빌딩별 조망권 = " + (brr[4] - brr[3]));
                    result += brr[4] - brr[3];
                }
            }
            System.out.println("#" + test_case +" "+ result);
        }
    }
}
