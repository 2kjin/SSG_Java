package day15.interfaceEx.sec10.exam01;

import day15.interfaceEx.sec09.exam01.C;

public class CarExample {

  public static void main(String[] args) {
    Tire tire = new HankookTire();
    Tire tire2 = new KumhoTire();

    //자동차 객체 생성
    Car car = new Car();

    //run() 메소드 실행
    car.run();

    //타이어 객체 교체
    car.tire1 = tire2;

    //run() 메소드 실행(다형성: 실행 결과가 다름)
    car.run();
  }
}