package programmers;
// [21.09.12] - Lv1.연습문제 -  두 정수 사이의 합
// https://programmers.co.kr/learn/courses/30/lessons/12912#

/**
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수
 * a, b 같으면 그 수
 * a와 b는 -10,000,000 이상 10,000,000 이하인 정수
 **/

public class TwoIntegerSum {
    public static long solution(int a, int b) {
        long answer = 0;
        //int totalSum = 0;
        int bigNum = a;
        int smallNum = b;
        if (a == b) {
            return a;
        } else if (a < b) {
            bigNum = b;
            smallNum = a;
        }
        for (int i = smallNum; i < bigNum+1; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 5));
    }
}
