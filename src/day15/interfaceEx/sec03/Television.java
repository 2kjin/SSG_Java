package day15.interfaceEx.sec03;

public class Television implements RemoteControl{

  //필드
  private int volume;

  @Override
  public void turnOn() {
    System.out.println("tv를 켜다");
  }

  @Override
  public void turnOff() {
    System.out.println("tv를 끄다");

  }

  @Override
  public void setVolume(int volume) {
    System.out.println("tv를 켜다");
  }

  //turnOn() 추상 메소드 오버라이딩

  //turnOff() 추상 메소드 오버라이딩

  //setVolume() 추상 메소드 오버라이딩

}	