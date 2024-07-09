package day18.objectEx;

class MyObject implements Cloneable{ // clone 오버라이딩
  private String name;
  private int age;

  @Override
  protected MyObject clone() throws CloneNotSupportedException {
    try {
      return (MyObject)super.clone(); // 오브젝트 클래스의 클론을 이용할 것 이지만 마이오브젝트에서 다운캐스팅
    } catch (CloneNotSupportedException e){
      return null;
    }
  }
}

public class ObjectEx {

  public static void main(String[] args) throws CloneNotSupportedException {
    MyObject myObject = new MyObject();
    System.out.println(myObject.toString()); // myobject 객체의 자신의 정보를 문자열로 반환
    MyObject copyObject = myObject.clone();
    System.out.println(myObject.toString() );
    System.out.println(copyObject.toString() );
  }

}
