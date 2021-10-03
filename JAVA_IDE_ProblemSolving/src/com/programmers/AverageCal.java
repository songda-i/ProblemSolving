// [21.10.03]  - Lv1.연습문제 평균구하기
// https://programmers.co.kr/learn/courses/30/lessons/12944
// OK
/**
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다
 */
public class AverageCal {
    public static double solution(int[] arr) {
        double answer = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            answer += arr[i];
        }
        answer = answer / length;
        return answer;
    }
    // 답 2.5
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(solution(arr));
    }
}
