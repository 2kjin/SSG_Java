package day11.exec;

import day11.exec.aa.A;
import day11.exec.aa.B;

public class ABMain {

  public static void main(String[] args) {
    A a = new A();
    B b = new B();

    String aa = a.aa;
    System.out.println(a.toString());
    b.bb= aa;
    System.out.println(b.toString());
  }
}
