package programmers;

// [21.09.20] - Lv1.연습문제 -  같은 숫자는 싫어
// [21.09.12] X
// https://programmers.co.kr/learn/courses/30/lessons/12906#

import java.util.ArrayList;
/**
 * 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수
 * 테스트케이스 : arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return
 *
 * 배열 arr의 크기 : 1,000,000 이하의 자연수 (즉 1개 이상)
 * 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수 (1~9)
 **/
public class NoSameNumber {
    public static ArrayList solution(int []arr) {
        // int[] answer = {};
        ArrayList answer = new ArrayList();
        int arrLen = arr.length;
        if(arrLen > 0) {
            answer.add(arr[0]);
            for (int i = 0; i < arrLen-1; i++) {
                if(arr[i] != arr[i+1]) {
                    answer.add(arr[i+1]);
                }
            }
        }
        return answer;
    }
    // 1 3 0 1
    public static void main(String[] args) {
        int [] arrParms = {1, 1, 3, 3, 0, 1, 1,2};
        System.out.println(solution(arrParms));
    }
}
