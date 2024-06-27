package day8.bookMarket;

public class User { // VO (value Object)

  //아이디
  private String id;
  //이름
  private String name;
  //폰번호
  private String mobilNumber;
  //주소
  private String address;
  //비밀번호
  private String password;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMobilNumber() {
    return mobilNumber;
  }

  public void setMobilNumber(String mobilNumber) {
    this.mobilNumber = mobilNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", mobilNumber='" + mobilNumber + '\'' +
        ", address='" + address + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
