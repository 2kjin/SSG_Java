package day17.database.dbEx;

import day17.database.dbEx.dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUserInfo {
  static Connection connection = null;

  public static void main(String[] args) {

  // DELETE FROM 테이블명 WHRER userid = 1
  connection = ConnectionFactory.getInstance().open();
  String query = new StringBuffer()
      .append("DELETE FROM ")
      .append("user WHERE userid = ? ").toString();

    try {
    PreparedStatement pstmt = connection.prepareStatement(query);
    pstmt.setString(1,"win");

    int rows = pstmt.executeUpdate();
    System.out.println("삭제된 행의 수 " + rows);
    pstmt.close();

  } catch (SQLException e) {
    System.err.println(e.getMessage());
  } finally {
    ConnectionFactory.getInstance().close();
  }
  }
}
