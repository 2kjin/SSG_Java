package day12;

class GrandFather{
  void printGrandFather(){
    System.out.println("나의 할아버지 입니다.");
  }
}

class SubFather extends GrandFather{
  String familName = "홍";
  String houseAddress = "인천";

  void printFather(){
    System.out.println("나는 아버지 입니다. 나는 할아버지로부터 상속 받습니다.");
  }
}

class Son extends SubFather{
  String name = "길동";

  void printDetails(){
    System.out.println("나의 이름은 " + super.familName+this.name);
    System.out.println("나의 아버지는 프로그래머");
    System.out.println("나의 집은 " + super.houseAddress);
  }
}

class SubSon extends SubFather{

  void printSon(){
    System.out.println("나는 아들입니다");
    System.out.println("나는 아버지로부터 상속 받습니다.");
    System.out.println("나의 아버지는 프로그래머 입니다.");
    System.out.println("나의 집은 " + super.houseAddress + " 입니다");
  }
}

public class Inheritance02{

  public static void main(String[] args) {
    Son objSon = new Son();
    objSon.printDetails();

    SubSon objSon1 = new SubSon();
    objSon1.printSon();
    objSon1.printFather();
    objSon1.printGrandFather();
  }
}
