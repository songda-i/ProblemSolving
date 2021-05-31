import java.util.Scanner;

public class M11 {
    public static void main(String[] args) {
        /**
         * Scanner로 값을 입력받고
        만약 입력한 값이 대소문자 상관없이 yo를 입력하면 YO!!를 출력하고
        그 외에는 항상 소문자로 변환하여 출력하여라.
        yo -> YO!!
        NO -> no
        no -> no
        
        OK
         */
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equalsIgnoreCase("yo")) {
            System.out.println("YO!!");
        } else {
            System.out.println(str.toLowerCase());
        }


        
    }
}
