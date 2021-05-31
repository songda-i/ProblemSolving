class Car {
    public void go() {
        System.out.println("달린다");
    }
}
class SlowCar extends Car{
    public void go() {
        System.out.println("처언처언치");
    }
}
class FastCar extends Car{
    public void go() {
        System.out.print("빠르게");
        super.go();
    }
}
class M14 {
    public static void main(String[] args) {
        /**
         * 클래스 Car가 있다. 이 Car는 go함수를 가지며 이 함수는 "달린다"를 출력한다.
            이 Car를 상속받는 클래스 SlowCar가 있다. go함수를 오버라이딩하여 "처언처언히"를 출력하게 한다.

            여기에 추가로 Car를 상속받는 FastCar 클래스를 만들라. go함수를 오버라이딩하여야 한다.
            "빠르게달린다"를 출력하도록하라. 단 FastCar의 go함수에는 "달린다"라는 글자를 적으면 안된다.

            OK
         */
        Car car = new Car();
        car.go();
        car = new SlowCar();
        car.go();
        car = new FastCar();
        car.go();

    }
}
