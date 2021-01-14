package com.coding;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            String longs = sc.next(); //1000자이내
            // 정규식
            Pattern regex = Pattern.compile(shorts);
            Matcher matcher = regex.matcher(longs);
            while(matcher.find()){
                cnt++;
            }
            System.out.println("#"+tc+" "+cnt);

        }
    }
}
