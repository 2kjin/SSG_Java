package day2;

//책(Object) : 제목, 가격, 출판사, 저자, 페이지수, isbn ...
// class : 새로운 자료형을 설계하는 도구 (Modeling)

public class Book {

    public String title;
    public int price;
    public String company;
    public String author;
    public int totalpage;
    public String isbn;

    public void bookInfo(){ // void : return값은 없다, 되돌려주는 값은 없다는 뜻.
        System.out.println("야옹서점 책 정보 입니다.");
        System.out.println(this.title + "\t" + this.author);
    }

//    public int bookPrice(){
//        int price = (int) (this.price * 0.1);
//        return price;
//    }

    public int bookPrice(){
        return this.price;
    }


    public void setBookPrice(int price){
        this.price = price;
    }

}
