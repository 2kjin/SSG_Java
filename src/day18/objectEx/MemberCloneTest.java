package day18.objectEx;

public class MemberCloneTest {

  public static void main(String[] args) {
    Member member1 = new Member("ssg",20, "서울서울",new Address(101,"서울시 영등포구"));

    try {

      Member member2 = member1.clone();
      Address address1 = member1.getAddr();
      Address address2 = member2.getAddr();
      address2.setAddr("부산 해운대");

      System.out.printf("address1 hashcode : %s, addr : %s\n",address1,address1.getAddr());
      System.out.printf("address1 hashcode : %s, addr : %s\n",address2,address2.getAddr());
      System.out.printf("Member1 hashcode : %s, addr : %s\n",member1,member1.getAddr());
      System.out.printf("Member2 hashcode : %s, addr : %s\n",member2,member2.getAddr());



      /*System.out.println(member1);
      System.out.println(member2);

      Address address1 = new Address(231,"서울시 광진구");
      String addr = address1.getAddr();
      System.out.println(addr);
      member2.setAddr(address1);
      System.out.println(member2);*/

    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }

  }
}
