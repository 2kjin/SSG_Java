package day11.exec.aa;

public class B {
  public String bb = "B클래스의 bb";

  public void bb(){
    System.out.println("B클래서의 bb() 메소드 실행");
  }

  @Override
  public String toString() {
    return "B{" +
        "bb='" + bb + '\'' +
        '}';
  }
}
