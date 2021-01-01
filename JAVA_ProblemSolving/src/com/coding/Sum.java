package com.coding;

import java.util.Arrays;
import java.util.Scanner;

//21.01.01
//1209. [S/W 문제해결 기본] 2일차 - Sum D3
public class Sum {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int t = 0; t < 10; t++) {
            // 입력
            int result = 0;
            int tc = sc.nextInt();
            int[][] arr = new int[100][100];
            for (int y = 0; y < 100; y++) {
                for (int x = 0; x < 100; x++) {
                    arr[x][y] = sc.nextInt();
                }
            }
            int garoSum;
            int seroSum=0;
            int ltor=0;
            int rtol=0;
            // 문제풀이
            for (int y = 0; y < 100; y++) {
                //대각선
                ltor += arr[y][y];
                rtol += arr[y][99-y];
                //가로 행
                garoSum = Arrays.stream(arr[y]).sum();
                if (result < garoSum) {
                    result = garoSum;
                }
                //세로 열
                for (int x = 0; x < 100; x++) {
                    seroSum += arr[x][y];
                }
                if (result < seroSum) {
                    result = seroSum;
                }
                seroSum =0;
            }
            if (result < ltor) {
                result = ltor;
            }
            if (result < rtol) {
                result = rtol;
            }
            System.out.println("#"+tc+" "+result);
        }

    }
}
