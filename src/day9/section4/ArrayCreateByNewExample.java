package day9.section4;

import java.util.Scanner;

public class ArrayCreateByNewExample {

  public static void main(String[] args) {
    //정수형 배열 변수 arr1을 길이가 3인 배열로 생성하세요
    int[] arr1 = new int[3];

    //배열 항목의 초기값 출력
    for (Integer i : arr1){
      System.out.println(i);
    }
    System.out.println("===========================");

    // arr1 에 10,20,30 값을 차례로 입력하고 싶습니다.
    Scanner sc = new Scanner(System.in);

    for ( int i = 0; i <arr1.length; i++){
      System.out.println(i + 1 + " 번째 데이터를 입력해주세요");
      arr1[i] = sc.nextInt();
    }
    for ( Integer i : arr1){
      System.out.println(i);
    }

    String[] str = new String[4];
    str[0] = "봄";
    str[1] = "여름";
    str[2] = "가을";
    str[3] = "겨울";
    // 향상된 for 이용하여 str 배열의 값 출력하세요
    for (String s : str){
      System.out.println(s);
    }
    // 재할당
    str[2] = str[3];
    for (String s : str){
      System.out.println(s);
    }


    System.out.println();
    //배열 항목의 값 변경

    //배열 항목의 변경값 출력

    //배열 변수 선언과 배열 생성

    //배열 항목의 초기값 출력

    System.out.println();
    //배열 항목의 값 변경

    //배열 항목의 변경값 출력

    //배열 변수 선언과 배열 생성

    //배열 항목의 초기값 출력

    System.out.println();
    //배열 항목의 값 변경

    //배열 항목의 변경값 출력

  }
}
