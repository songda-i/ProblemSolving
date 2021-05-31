class B {
    public static void main(String[] args) {
        /**
         * 중첩 for사용 구구단 2~9단 출력 시도
         *그러나 중간에 5x5를 만나면 for문 탈출 완전
         *if는 단 하나만 사용가능
         */
        // TODO : 한번에 빠져나오는 break
        outerLoop:
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 5 && j==5) {
                    break outerLoop;
                }
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
        System.out.println("END");

    }
}
