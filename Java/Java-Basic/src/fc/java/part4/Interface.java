package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.TV;
import fc.java.poly.Remocon;

public class Interface {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 TV를 동작시켜보자.
        // 다형성이 100%보장이된다.
        // 부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬수가 있다.
        // Remocon remo = new Remocon(); 객체생성 불가
        // 부모의 역할을 할수있다.
        Remocon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();

        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
    }
}
