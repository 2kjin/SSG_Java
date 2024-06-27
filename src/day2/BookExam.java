package day2;

public class BookExam {
    public static void main(String[] args) {

        Book book = new Book();
        book.title = "자바프로그래밍";
        book.price = 30000;
        book.company = "한빛미디어";
        book.author = "김자바";
        book.totalpage = 1000;
        book.isbn = "ISBN-1990011";

        Book book2 = new Book();
        book2.title = "파이썬";
        book2.price = 23000;
        book2.company = "한빛미디어";
        book2.author = "김파이";
        book2.totalpage = 900;
        book2.isbn = "ISBN-1990099";

        book.bookInfo();
        int price = book.bookPrice();
        System.out.println("해당 도서의 가격은 " + price);
        book.setBookPrice(33000);
        price = book.bookPrice();
        System.out.println("해당 도서의 가격은 " + price);



        System.out.println("제목 : " + book.title);
        System.out.println("가격 : " + book.price);
        System.out.println("출판사 : " + book.company);
        System.out.println("저자 : " + book.author);
        System.out.println("페이지 수 : " + book.totalpage);
        System.out.println("isnb : " + book.isbn);

    }
}
