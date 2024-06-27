package day9.section3;

public class IndexOfContainsExample {

  public static void main(String[] args) {
    String subject = "자바 객체 프로그래밍 과목입니다.";
    String res = "";

    //1. 문제에서 "객체 프로그래밍" 문자열을 추출하여 저장하여 출력하세요
    for ( int i = 3; i < 11; i++){
      char ch = subject.charAt(i);
      res = res.concat(String.valueOf(ch));
    }
    System.out.println(res);
    //1
    System.out.println(subject.substring(3, 11));


    //2. subject 문자열에서 "프로그래밍" 문자열의 첫인덱스를 저장하여 "프로그래밍 과목입니다." 문자열을 추출하여 출력하세요.
    int str2 = subject.indexOf("프로그래밍");
    System.out.println(subject.substring(str2));

    //3. subject 문자열에서 "자바" 문자열이 있으면 "자바 관련 과목이군요!" 출력, 없으면 " 자바와 관련 없는 과목이군요" 출력
    if(subject.contains("자바")){
      System.out.println("자바 관련 과목이군요!");
    }else {
      System.out.println("자바와 관련 없는 과목이군요");
    }

    //3
    String java = "자바";
    String[] arr = subject.split(" ");
    boolean isJava = checkJava(java, arr);
    System.out.println(isJava ? "자바 관련 과목이군요!" : "자바와 관련 없는 과목이군요!");

    //4. subject 에서 "자바" 문자열이 포함되어 있는지 검사하고, 해당 문자열이 있으면 "자바 관련 과목이군요!" 출력, 없으면 "자바와 관련 없는 과목이군요" 출력
    System.out.println(subject.contains(java) ? "자바 관련 과목이군요!" : "자바와 관련 없는 과목이군요!");
    
  }

  public static boolean checkJava(String java, String arr[]) {
    for (String s : arr) {
      if (java.equals(s)) {
        return true;
      }
    }
    return false;
  }
}
