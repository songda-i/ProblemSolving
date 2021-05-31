import java.util.Scanner;

public class M12 {
    public static void main(String[] args) {
        /**
         * Scanner로 전화번호를 입력받는다.
            출력은 -가 제거된 오직 숫자만 출력되도록 하라
            010-1234-1234 -> 01012341234

         * Scanner로 숫자로만 된 전화번호를 입력받는다.
            이것을 -를 넣어 읽기 쉽게 변환하여 출력하라
            단 가운데 숫자가 3,4자리일떄도 올바르게 출력하도록 주의하라
            0101231234 -> 010-123-1234
            01012341234 -> 010-1234-1234
         */
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
    }
}
