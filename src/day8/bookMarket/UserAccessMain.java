package day8.bookMarket;

public class UserAccessMain { // 실행 클래스

  public static void main(String[] args) {

    User user1 = new User();
    user1.setId("ssg01");
    user1.setName("신세계");
    user1.setAddress("서울시 강남구 봉은대로");
    user1.setMobilNumber("010-2345-3463");
    user1.setPassword("9321");

    System.out.println(user1.getId() + " " + user1.getPassword());
    System.out.println(user1.toString());
  }

}
