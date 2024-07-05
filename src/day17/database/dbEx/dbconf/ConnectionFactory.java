package day17.database.dbEx.dbconf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

  // ConnectionFactory 에 Mysql server로 부터 Connection을 얻어오는 open()메소드를 작성하세요
  // 조건 : 싱글톤 패턴을 적용하여 만들어 주세요
  private static Connection connection = null;
  private static String url = "jdbc:mysql://127.0.0.1:3306/ssgdatabase";
  private static String id = "root";
  private static String pwd = "mysql1234";

  // 싱글톤 패턴 3단계
  // 1단계
  private static final ConnectionFactory instance = new ConnectionFactory();
  // 2단계
  private ConnectionFactory(){
  }
  // 3단계
  public static ConnectionFactory getInstance(){
    return instance;
  }

  public Connection open(){
    try {
      connection = DriverManager.getConnection(url,id,pwd);
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return connection;
  }

  public void close() {
    try {
      connection.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }
}
