import java.util.ArrayList;

public class M13 {
    public static void main(String[] args) {
        /**
         * 구구단 2~9단을 담는 배열을 만들고 출력하라(이중배열을 사용하라)
            위 구구단문제를 배열을 사용하지말고 List로 만들고 출력하라(이중리스트)
            위 구구단문제를 이중 Map을 사용하여 만들고 출력하라
            예시) result.get(2).get(3) -> 6이 출력
         */

        // 이중배열 
        int[][] gugudan = new int[10][10];
        for (int i = 2; i < gugudan.length; i++) {
            for (int j = 1; j < gugudan.length; j++) {
                gugudan[i-2][j-1] = i*j;
                // System.out.println(gugudan[i-2][j-1]);
            }
        }
        // 이중리스트
        ArrayList<Integer>[][] myList = new ArrayList[10][10];
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                myList[i][j].add(i*j);
                // System.out.println(myList[i][j]);
                
            }
        }

    }
}
