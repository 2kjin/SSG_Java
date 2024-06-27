package day11.dao;

import day11.dto.CarVo;
import java.sql.SQLOutput;

public class CarDao {

  public void carInsert(CarVo car){
    // DB 연결, insert SQL
    System.out.println("car 정보가 DB에 저장되었습니다.");
  }

  public void carSelect(){
    // DB 연결, select SQL
    System.out.println("car 정보가 조회 되었습니다. 모든 car 객체 조회");
  }

}
