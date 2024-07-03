package day16.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

  public static void main(String[] args) {
    System.out.println("==회원 정보 입력 후 조회==");
    // 회원의 정보를 사용자 받는 기능 (static 메소드로)
    // Member 클래스(vo)
    memberInsert(id, name, job); // memberInsert(Mem member)
    memberSearch();
    System.out.println("==회원 정보 수정 후 조회==");
    memberUpdate();
    memberSearch();
    System.out.println("==회원 정보 삭제 후 조회==");
    memberDelete();
    memberSearch();
//    mySqlConnection();
//    studentJDBC();
  }

  private static void memberDelete(){}
  private static void memberUpdate(){}

  private static void memberInsert(int id, String name, String job){
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "mysql1234";
    String query = "INSERT INTO member VALUES (?,?,?)";

    Connection con = null;
    PreparedStatement pstmt = null;
    int res = 0;

    try {
      // 드라이버는 따로 설정 안해줘도자동 로딩이 된다.
      // Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url,userName,password);
      System.out.println(con);
      pstmt = con.prepareStatement(query);
      pstmt.setInt(1,4);
      pstmt.setString(2,"kss");
      pstmt.setString(3,"professor");

      res = pstmt.executeUpdate();
      if(res == 1){
        System.out.println("회원 정보가 입력되었습니다.");
      } else if (res == 0) {
        System.out.println("회원 정보 입력이 실패하였습니다.");
      }

      pstmt.close();
      con.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public static void mySqlConnection(){
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "mysql1234";
    String query = "SELECT * FROM member where id=1";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url,userName,password);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while (rs.next()){
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String job = rs.getString("job");
        System.out.printf("id : %d name : %s job : %s", id, name, job);
      }
      rs.close();
      stmt.close();
      con.close();

    }catch (Exception e){
      System.out.println(e.getMessage());

    }

  }

  public static void studentJDBC(){
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "mysql1234";
    String query = "SELECT * FROM STUDENT";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url,userName,password);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while (rs.next()){
        int sno = rs.getInt("sno");
        String name = rs.getString("name");
        int korean = rs.getInt("korean");
        int math = rs.getInt("math");
        int english = rs.getInt("english");
        int science = rs.getInt("science");
        int total = rs.getInt("total");
        float average = rs.getFloat("average");
        String grade = rs.getString("grade");
        System.out.println(sno + " " + name + " " + korean + " " + math + " " + english + " " + science + " " + total + " " + average + " " + grade);

      }
      rs.close();
      stmt.close();
      con.close();

    }catch (Exception e){
      System.out.println(e.getMessage());

    }


  }



}
