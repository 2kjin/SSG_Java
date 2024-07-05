package day17.database.dbEx;

import day17.database.dbEx.dbconf.ConnectionFactory;
import day17.database.dbEx.vo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectAllUser {

  static Connection connection = null;
  static ResultSet res = null;
  static ArrayList<User> userlist = new ArrayList<User>();

  public static void main(String[] args) {
    String query = "SELECT * " +
                    "FROM users ";

    connection = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);

      res = pstmt.executeQuery();

      while(res.next()){
        User user = new User();
        user.setUserId(res.getString("userid"));
        user.setUserName(res.getString("username"));
        user.setUserAge(res.getInt("userage"));
        user.setUserEmail(res.getString("useremail"));
        userlist.add(user);

//        System.out.println(user.toString());
//        System.out.println("회원아이디 : " + user.getUserId());
      }

      for (User u : userlist){
        System.out.println(u.getUserId() + " " + u.getUserName() );
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
