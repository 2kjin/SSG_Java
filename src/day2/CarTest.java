package day2;

public class CarTest {
    public static void main(String[] args) {

        Car bmw = new Car();

//        car1.model = "BMW528I";
//        car1.distance = 100000;
//        car1.price = 90000000;
        bmw.company = "BMW";
        bmw.type = 'A';
        bmw.auto = true;
        bmw.year = 2010;
        bmw.gasmi = 12.5f;

        System.out.println(bmw.type);
        System.out.println(bmw.auto);
        bmw.setModel("BMW528I");
        System.out.println(bmw.getModel());
        String model = bmw.getModel();
        System.out.println("현재 모델은" + model);

    }
}
