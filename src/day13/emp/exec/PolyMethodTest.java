package day13.emp.exec;

import day13.emp.vo.Animal;
import day13.emp.vo.Cat;
import day13.emp.vo.Dog;

public class PolyMethodTest {

  public static void main(String[] args) {

  Dog d = new Dog();
  Cat cat = new Cat();
    display(cat);
    display(d);

  }

  public static void display1(Cat cat){
  }

  public static void display(Animal animal){
    animal.eat();
  }

}
