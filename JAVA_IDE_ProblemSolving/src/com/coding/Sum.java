package com.coding;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

//21.01.01
//1209. [S/W 문제해결 기본] 2일차 - Sum D3
public class Sum {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int t = 0; t < 10; t++) {
            // 입력

            int tc = sc.nextInt();
            int[][] arr = new int[100][100];
            for (int y = 0; y < 100; y++) {
                for (int x = 0; x < 100; x++) {
                    arr[x][y] = sc.nextInt();
                }
            }

            int max = -1;
            for (int y = 0; y < 100; y++) {
                int finalY = y;
                int sum1 = IntStream.range(0, 100).map(it -> arr[finalY][it]).sum();
                int sum2 = IntStream.range(0, 100).map(it -> arr[it][finalY]).sum();

                max = Math.max(Math.max(sum1, sum2), max);
            }
            int cross1 = IntStream.range(0, 100).map(it -> arr[it][it]).sum();
            int cross2 = IntStream.range(0, 100).map(it -> arr[99-it][99-it]).sum();

            max = Math.max(max, Math.max(cross1, cross2));
            System.out.println("#"+tc+" "+max);
        }

    }
}
