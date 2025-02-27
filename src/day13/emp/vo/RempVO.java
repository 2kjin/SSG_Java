package day13.emp.vo;

public class RempVO extends Employee {

  public RempVO() {
    super();
  }

//  private로 접근할땐 밑의 구조처럼
  public RempVO(String name, int age, String phone, String empDate, boolean marriage, String dept) {
    super(name, age, phone, empDate, marriage, dept);
  }

//    protected로 접근할땐 this로 밑의 구조처럼
//  public RempVO(String name, int age, String phone, String empDate, boolean marriage, String dept) {
//    super();
//    this.name = name;
//    this.age = age;
//    this.phone = phone;
//    this.empDate = empDate;
//    this.marriage = marriage;
//    this.dept = dept;
//  }

  public RempVO(String name, int age, String phone) {
  super(name, age, phone);
  }
}
