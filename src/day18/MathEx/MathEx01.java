package day18.MathEx;

public class MathEx01 {

  public static void main(String[] args) {
    // 절대값 반환 Math.abs()
    System.out.println(Math.abs(-1));

    // 1.4, 1.6, -1.5, 1, : 반올림 Math.round()

    // 1.4, 1.6, -1.5, 1, : 올림 Math.ceil()

    // 1.4, 1.6, -1.5, 1, : 내림 Math.floor()

    // 제곱근 Math.sqrt
    System.out.println((int) Math.sqrt(9));

    // Math.random() 0.0 <= ~~ < 1.0 임의의 부동 소수점을 반환
    // 1~10까지의 숫자를 랜덤으로 얻고 싶다.

    double random = Math.floor(Math.random()*10+1);
    System.out.println((int) random);

  }

}
