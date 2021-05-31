import java.util.ArrayList;
import java.util.List;

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
        // 이중리스트 - 괴멸
        // ArrayList<Integer>[][] myList = new ArrayList[10][10]; 
        // for(int i=0;i<10;i++) { 
        //     for(int j=0;j<10;j++) { 
        //         myList[i][j] = new ArrayList<Integer>(); 
        //         myList[i][j].add(i*j);

        //     }
        // } for(int i=0;i<10;i++) { 
        //     for(int j=0;j<10;j++) { 
        //         System.out.printf("%d ",myList[i][j]); 
        //     } System.out.printf("\n"); 
        // }

        // 이중리스트 ^=^
        List<List<Integer>> myList = new ArrayList<>();
        for (int i = 2; i < 10; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 1; j < 10; j++) {
                arr.add(i*j);
            }
            myList.add(arr);
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
