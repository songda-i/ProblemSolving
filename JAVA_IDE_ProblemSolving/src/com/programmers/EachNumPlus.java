// [21.10.03]  - Lv1.연습문제 자릿수 더하기
// https://programmers.co.kr/learn/courses/30/lessons/12931

import java.util.*;

/**
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수
 * N의 범위 : 100,000,000 이하의 자연수
 */
public class EachNumPlus {
    public static int solution(int num) {
        int answer = 0;
        int restNum = num;
        int length = (int)(Math.log10(num)+1); // 자릿수 계산하기
//        System.out.println(length);
        for (int i = 0; i < length ; i++) {
            answer += restNum % 10; // 나머지 더하기
            restNum = restNum / 10; // 몫을 다시 사용 
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123));
    }
}
