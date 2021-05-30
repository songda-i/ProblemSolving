class C {
    public static int add(int a, int b) {
        return a+b;
    }
    public static double add(double a, double b) {
        return a+b;
    }
    public static void main(String[] args) {
        /**
         * 8, 같은 이름의 함수 add를 구현
         * int + int도 되고 double + double도 되도록 구현
         */
        // int c = C.add(3,3);
        System.out.println(C.add(3,3.5));
    }
}
