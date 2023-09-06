package fc.java.part2;

import fc.java.model.CarDTO;
import fc.java.model.CarUility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Q. Car 정보를 출력하는 동작을 가지고있는 Utility클래스를 설계하세요.
        CarDTO car = new CarDTO();
        car.carSn = 1110;
        car.carName = "BMW828i";
        car.carPrice = 300000000;
        car.carOwner = "정00";
        car.carYear = 2015;
        car.carType = "D";

        CarUility carUtil = new CarUility();
        carUtil.carPrint(car);
    }
    // 매개변수로 자동차의 정보를 입력받아서 출력하는 메서드를 정의 하세요.
}
