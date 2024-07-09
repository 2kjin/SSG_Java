package day18.objectEqualsHashCode;

import java.lang.annotation.Target;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

  private int memberCode;
  String name;

  @Override
  public boolean equals(Object o) {

    if ( o instanceof Member m){
      if(this.memberCode == m.getMemberCode() && this.name.equals(m.getName())){
        return true;
      }
    }
    return false;

    /*if (this == o){
      return true;
    }
    if ( !(o instanceof Member)) {
      return false;
    }
    Member member = (Member) o;
    boolean res = Object.equals(this.name, member.name);*/

    /*if (this == o) {
      return true;
    }
    if ( !(o instanceof Member) ) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(this.name, member.name);*/
  }

  @Override
  public int hashCode() {
    int res = this.name.hashCode();
    return res;
  }
}
