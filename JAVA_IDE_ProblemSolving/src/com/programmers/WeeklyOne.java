package programmers;
import java.util.*;
// [21.09.12] - Lv1. 위클리 챌린지 1주차_부족한 금액 계산하기
// 실패 - 다 통과가 안됨
/**
 * 놀이기구를 탈 때마다, 놀이기구 이용가격이 N번째 이용한다면 원래 이용료의 N배 올라간다.
 * return 놀이기구총금액 - 내가가진돈 = 부족한 금액을 리턴, 안 부족하면 0
 * price(놀이기구 첫 이용료), money(내가 가진돈), count(놀이기구 이용횟수)
 *
 * 놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수
 * 처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수
 * 놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수
 * **/


public class WeeklyOne {
    public static long solution(int price, int money, int count) {
        int totalEstimatePrice = 0;
        for (int i = 1; i < count+1; i++) {
            totalEstimatePrice += price * i;
            //System.out.println(totalEstimatePrice);
        }
        long answer = 0;
        if (totalEstimatePrice > money) {
            answer = totalEstimatePrice - money;
        }
        return answer;
    }
    public static void main(String []args){
        System.out.println(solution(3,20,4));
    }
}
