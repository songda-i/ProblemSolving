// [21.09.20] - Lv1.연습문제 나누어 떨어지는 수
// https://programmers.co.kr/learn/courses/30/lessons/12910
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;

/**
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1
 * */
public class DivArrNumber {
    static class Solution {
        public static ArrayList solution(int[] arr, int divisor) {
//            int[] answer = {};
            ArrayList answer = new ArrayList();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]%divisor == 0) {
                    answer.add(arr[i]);
                }
            }
            // -1
            if (answer.size() == 0) {
                answer.add(-1);
            }
            // 오름차순
            Collections.sort(answer);
            return answer;
        }
    }
    // arr: [5, 9, 7, 10]
    // divisor : 5
    // 답 [5, 10]
    public static void main(String[] args) {
        int [] arr = {15,5,9,7,10};
        int divisor = 5;
        System.out.println(Solution.solution(arr,divisor));
    }

}
