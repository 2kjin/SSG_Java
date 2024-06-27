package day9.section1;

public class SbEx {

  public static void main(String[] args) {
    // StringBuffer, StringBuilder 클래스는 문자열 연산(연결, 변경, 수정)에 주로 활용된다.

    // String 클래스 + concat() : 문자열을 이어 붙어서 사용함

    StringBuffer sb = new StringBuffer();
    sb.append("hello");
    sb.append("StringBuffer");
    sb.append("Nice meet you");
    sb.append("!!!!");

    String res = sb.toString();
    System.out.println(res);
    // 내부적으로 버퍼(buffer)가 제공되어 문자열 연산을 하여 제공하여 최종 결과를 만들 때 사용 (연산속도 빠르다)

    String str1 = "ABCDEFGHIJKLMN";
    StringBuffer sb1 = new StringBuffer(str1);
    System.out.println(sb1);
    //sb1 String type 로 casting 하세요
    String str2 = sb1.toString();
    String str3 = sb1.substring(3,10);
    System.out.println(str3);
    sb1.insert(2,"OPQRSTU");
    String str4 = sb1.toString();
    System.out.println(str4);
    // 현재 sb1의 문자열에서 문자 O 부터 I 까지 삭제한 결과값 출력
    sb1.delete(2,16);
    String str5 = sb1.toString();
    System.out.println(str5);

    // 현재 sb1 문자열에 "ABJKLMN" -> "ABJKLMNOPORSTU"로 변경 연산하기
    sb1.append("OPORSTU");
    String str6 = sb1.toString();
    System.out.println(str6);

    // 현재 sb1의 문자열의 총길이 출력
    System.out.println(sb1.length());

    // 현재 sb1의 용량(capacity) 출력
    System.out.println(sb1.capacity());

    // 현재 sb의 문자열을 뒤집어 출력하기
    sb1.reverse();
    String str7 = sb1.toString();
    System.out.println(str7);


  }

}
