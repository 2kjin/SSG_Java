package day4.section7;

import java.util.Scanner;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode1 = 'A';
		int charCode2 = 'a';
		int charCode3 = '5';

		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 숫자 한 자를 입력하세요!");
//        int res0 = Integer.parseInt(sc.next());
		int res = sc.next().charAt(0);

		//1. 입력받은 문자가 대문자인지 소문자인지 구분하여 대문자이면 "대문자 입력값" , "소문자 입력값"

		if (Character.isUpperCase(res) ){
			System.out.println("대문자 입력값");
		} else if (Character.isLowerCase(res) ){
			System.out.println("소문자 입력값");
		}

		//2. 입력받은 문자가 숫자인지, 알파벳 대문자 또는 소문자인지 구분하여 숫자이면 숫자, 대문자이면 대문자, 소문자이면 소문자

		System.out.println("문자(알파벳, 숫자0-9) 하나를 입력하세요!");
		int res2 = sc.next().charAt(0);
		if (Character.isUpperCase(res2) ){
			System.out.println("대문자");
		} else if (Character.isLowerCase(res2) ){
			System.out.println("소문자");
		} else{
			System.out.println("숫자");
		}

		//3. 입력받은 숫자가 2의 배수 또는 3의 배수인지 검사하여 2의배수 또는 3의 배수이면 "ok" , 아니면 "Oops.."

		int res3 = Integer.parseInt(sc.next());
		if (res3 % 2 == 0 && res3 % 3 == 0){
			System.out.println("ok");
		}else {
			System.out.println("Oopss..");
		}
	}
}