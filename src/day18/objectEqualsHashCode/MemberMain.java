package day18.objectEqualsHashCode;

public class MemberMain {

  public static void main(String[] args) {

    Member m1 = new Member(111,"ssg");
    Member m2 = new Member(111,"ssg");

//    System.out.println(m1 == m2); // == 주소값을 비교
    System.out.println(m1.equals(m2)); // 동명이인
  }
}
