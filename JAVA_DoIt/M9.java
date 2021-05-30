class D {
    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        /**
         * 피보나치 함수 구현 - 2가지방법으로 구현
         * 1, 1, 2, 3, 5, 8, 13
         * 1.재귀적으로 만들어보기
         * 2.비재귀적으로 만들어보기
         */
        System.out.println(fibonacci(7));
    }    
}
