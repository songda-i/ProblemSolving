class Calculator {
    private int c = 0;
    // public static void add(int a, int b) {
    //     c = a+b;
    // }
    // public static int showLastCalcResult() {
    //     return c;
    // }
    public void add(int a, int b) {
        c = a+b;
    }
    public int showLastCalcResult() {
        return c;
    }
}

class WeirdCalculator {
    private int ret = 0;
    public int multiply(int a, int b) {
        Calculator cal = new Calculator();
        ret = a;
        for (int i = 0; i < b-1; i++) {
            cal.add(ret, a);
            ret = cal.showLastCalcResult();
        }
        return ret;
    }
}
class M10 {
    
    public static void main(String[] args) {
        /**
         * 계산기 클래스 Calculator를 만듬
        이 클래스는 두 정수형을 더하는 add(int, int)함수를 가지고 있음
        이 클래스는 마지막에 계산한 결과값을 출력하는 showLastCalcResult()를 가지고 있음
         */

        // static 메서드일 때, 클래스 메서드이므로
        // Calculator.add(1,2);
        // System.out.println(Calculator.showLastCalcResult());

        // 그냥 메서드일 때, 인스턴스메서드이므로
        // Calculator cal = new Calculator();
        // cal.add(1, 1);
        // cal.add(2, 2);
        // System.out.println(cal.showLastCalcResult());

        WeirdCalculator wcal = new WeirdCalculator();
        System.out.println(wcal.multiply(1,8));
    }
}
