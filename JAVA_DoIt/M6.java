// import java.util.Scanner;
class A {
    public static void main(String[] args) {
        /**
         * while(true):무한루프를 사용하여 구구단 2~9단 출력 / 단 짝수 단만 출력(2,4,…)
            continue와 break를 반드시 사용하여야함
         */
        System.out.println();
        int n = 2;
        int i = 1;
        while(true) {
            if (n%2==1) {
                n++;
                continue;
            }
            System.out.println(n+"*"+i+"="+n*i++);
            // if (i == 10) 대신
            if (i%10 == 0) {
                i = 1;
                n++;
            }
            
            if (n == 9)
            break;
        }


    }
}