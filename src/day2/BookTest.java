package day2;

public class BookTest {
    public static void main(String[] args) {
        // Q1. 한 권의 책 데이터를 저장하고 출력하세요. 기준은 Book 변수를 참조하세요.
        // 책 제목 : 자바프로그래밍   가격 : 30,000   출판사 : 한빛미디어   저자 : 김자바   페이지 수 : 1000   isbn : ISBN-1990011

        String title = "자바프로그래밍";
        int price = 30000;
        String company = "한빛미디어";
        String author = "김자바";
        int totalpage = 1000;
        String isbn = "ISBN-1990011";

        System.out.println("제목 : " + title);
        System.out.println("가격 : " + price);
        System.out.println("출판사 : " + company);
        System.out.println("저자 : " + author);
        System.out.println("페이지 수 : " + totalpage);
        System.out.println("isnb : " + isbn);

    }
}
