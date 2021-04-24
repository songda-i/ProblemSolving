package com.coding;

import java.util.Arrays;
import java.util.Scanner;

//21.01.03
//4751. 다솔이의 다이아몬드 장식 D3
public class Diamond {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0;i<tc;i++){
            String word = sc.next();
            String[] result = word.split("");
            int len = result.length;
            //System.out.println(Arrays.toString(result));
            String oneFive = "..#.";
            String twoFour = ".#.#";
            // 출력
            for(int j=0;j<len;j++){
                System.out.print(oneFive);
            }
            System.out.println(".");
            for(int j=0;j<len;j++){
                System.out.print(twoFour);
            }
            System.out.println(".");
            for(int j=0;j<len;j++){
                System.out.print("#.");
                System.out.print(result[j]);
                System.out.print(".");
            }
            System.out.println("#");
            for(int j=0;j<len;j++){
                System.out.print(twoFour);
            }
            System.out.println(".");
            for(int j=0;j<len;j++){
                System.out.print(oneFive);
            }
            System.out.println(".");
        }

    }
}
