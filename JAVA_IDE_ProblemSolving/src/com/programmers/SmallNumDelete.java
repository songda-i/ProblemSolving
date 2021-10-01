import java.util.ArrayList;

public class SmallNumDelete {
    public static ArrayList solution(int[] arr) {
        ArrayList answer = new ArrayList();

        if(arr.length == 1) {
            answer.add(-1);
            return answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {10,3,7};
        System.out.println(solution(arr));
    }
}
