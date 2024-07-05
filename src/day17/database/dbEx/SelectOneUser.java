package day17.database.dbEx;

import day17.database.dbEx.dbconf.ConnectionFactory;
import day17.database.dbEx.vo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOneUser {

  static Connection connection = null;
  static ResultSet res = null;

  public static void main(String[] args) {
    String query = "SELECT userid,username,userage,useremail " +
                    "FROM users " +
                      "WHERE userid = ?";
    connection = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setString(1,"winter");

      res = pstmt.executeQuery();

      //만약 값이 있다면 객체에서 읽어와라
      if(res.next()){
        User user = new User();
        user.setUserId(res.getString("userid"));
        user.setUserName(res.getString("username"));
        user.setUserAge(res.getInt("userage"));
        user.setUserEmail(res.getString("useremail"));
        System.out.println(user.toString());
        System.out.println("회원아이디 : " + user.getUserId());
      }else {
        System.out.println("해당 회원은 존재하지 않습니다.");
      }

      res.close();
      pstmt.close();

    } catch (SQLException e) {
      System.err.println(e.getMessage());

    } finally {
      ConnectionFactory.getInstance().close();
    }
  }
}
