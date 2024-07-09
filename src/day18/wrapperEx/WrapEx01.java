package day18.wrapperEx;

import com.sun.jdi.ShortType;

public class WrapEx01 {

  public static void main(String[] args) {
    // 100 값을 객체로 생성해 주세요 . 박싱 (Boxing)
    Integer value = 100 ; // AutoBoxing 자동박싱 java1.5 부터 제공
    Boolean b1 = true;
    boolean b2 = b1.booleanValue();

    int v = value.intValue(); // 언박싱
    int v1 = value; // AutoUnBoxing 자동언박싱
    v = v + 100;
    // 재포장 ( 박싱 )
    value = v;
    System.out.println(value);

    Integer num1 = 10;
    Integer num2 = 20;
    Integer res1 = num1 + num2;
    System.out.println(res1);

    // 객체 값 비교 equals()로 비교해야 한다.
    System.out.println(num1.equals(num2));
    System.out.println(num1 < num2);
    System.out.println(num1 + num2);

    // String 문자를 포장객체가 언박싱할때
    String str1 = "10";
    String str2 = "10.5";
    int value2 = Integer.parseInt(str1);
    byte value7 = Byte.parseByte(str1);
    short value4 = Short.parseShort(str1);
    long value5 = Long.parseLong(str1);
    float value6 = Float.parseFloat(str2);
    double value3 = Double.parseDouble(str2);

    // AutoBoxing


  }
}
