package day5_6.section1;

import java.util.Scanner;

public class IfNestedExample {
    public static void main(String[] args) {

        //입력단은 scanner ,BufferedReader 선택도 가능합니다.
        //81~100 사이의 점수가 랜덤하게 할당된다.
		/*입력된 score 점수를 확인하여 95~100 A+, 90~94 A,85~89 B+, 80~84 B,

        75~79 c+, 70~74 c 70 미만은 F 처리하는 프로그램 작성하시고,
		최종결과 C이상의 학점은 "당신의 학점은 0 입니다. 출력"
        C미만의 학점은 "재수강 하세요!" 출력*/

        Scanner sc = new Scanner(System.in);
//        int score = (int) (Math.random() * 20) + 81;
        int score = sc.nextInt();
        String grade = "";

        if (score >= 90) {
            grade = "A";
            if (score >= 95) {
                grade += "+";
            }
        } else if (score >= 80) {
            grade = "B";
            if (score >= 85) {
                grade += "+";
            }
        } else if (score >= 70) {
            grade = "C";
            if (score >= 75) {
                grade += "+";
            }
        } else {
            grade = "F";
        }
        if (grade.equals("F")) {
            System.out.println("당신의 점수는 " + score + "입니다. 재수강 하세요.");
        }else {
            System.out.println("당신의 점수는 " + score + "이고, 당신의 학점은 " + grade + "입니다.");
        }
    }
}
