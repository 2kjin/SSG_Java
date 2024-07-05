package day17.exception;

public class ExceptionEx01 {

  public static void main(String[] args) {

    printLengthString("JavaDATABASE_PROGRAMMING");
    printLengthString("null");

  }

  public static void printLengthString(String data){
    int res = 0;
    try {
      res = data.length();
      System.out.println("문자 수 = " + res);

      Class.forName("java.lang.String");
      System.out.println("String 클래스가 존재합니다.");

    } catch (NullPointerException e) {
//      System.err.println(e.getMessage());
//      System.out.println(e.toString());
      e.printStackTrace();
      System.out.println("예외 처리 완료");
    } catch (ClassNotFoundException e){
      e.printStackTrace();
    } finally {
      System.out.println("마무리 하렴");
    }
  }
}
