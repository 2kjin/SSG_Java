package day18.objectEx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Member implements Cloneable {

  private String name;
  private int age;
  private String address;
  private Address addr;

//  @Override // 얕은 복사
//  protected Member clone() throws CloneNotSupportedException {
//    try {
//      return (Member) super.clone();
//    } catch (CloneNotSupportedException e) {
//      return null;
//    }
//  }

  @Override // 깊은 복사
  protected Member clone() throws CloneNotSupportedException {
    try {
      Object clonedAddress = addr.clone();
      Address addr = (Address) clonedAddress; // 다운캐스팅
      Member clonedMember = (Member) super.clone();
      clonedMember.setAddr(addr);
      return clonedMember;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}
