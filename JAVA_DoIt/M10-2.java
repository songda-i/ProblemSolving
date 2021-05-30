class CCalculator {
    private int addNum = 0;
    public void add(int a, int b) {
        addNum = a+b;
    }
    public int showLastCalcResult() {
        return addNum;
    }
}

class WWeirdCalculator {
    private int mulNum = 0;
    int initNum = 0;
    WWeirdCalculator() {
        this.initNum = 0;
    }
    WWeirdCalculator(int initNum) {
        this.initNum = initNum;
    }
    public int multiply(int secondNum) {
        CCalculator cal = new CCalculator();
        mulNum = initNum;
        for (int i = 0; i < secondNum-1; i++) {
            cal.add(mulNum, initNum);
            mulNum = cal.showLastCalcResult();
        }
        return mulNum;
    }
}
class M102 {
    public static void main(String[] args) {
        /**
         * 위 WeirdCaluclator를 개조한다.
        만약 new WeirdCalculator(2).multiply(3)을 하면 6을 리턴해야하고(2x3)
        만약 new WeirdCalculator().multiply(3)을 하면 0을 리턴해야한다.(0x3)
        즉 생성자에서 넘긴값과 multiply에 넘겨진 값을 곱한 값이 리턴되는데
        만약 생성자에 아무것도 넘기지 않는다면 항상 0을 곱하도록 한다.

         */
        System.out.println(new WWeirdCalculator().multiply(3));
        System.out.println(new WWeirdCalculator(3).multiply(3));
    }
}
