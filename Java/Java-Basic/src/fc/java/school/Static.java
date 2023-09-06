package fc.java.school;
class Car{
    String color;
    int speed;
    int gear;
    int id;
    static int numberOfCars = 0;

    public Car() {}

    public Car(String color, int speed, int gear) {
        this.color = color;
        this.speed = speed;
        this.gear = gear;

        numberOfCars++;
    }
    public Car(String color) {
        this.color = color;
        speed = 0;
        gear = 0;

        numberOfCars++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", gear=" + gear +
                ", id=" + id +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(color);
        numberOfCars--;
    }

    public static void print() {
        System.out.println("정적메소드");
    }
}
public class Static {
    public static void main(String[] args) {
        Car car1 = new Car();

        // 첫번째 접근법
        // System.out.println(Car.numberOfCars);

        // 두번째 접근법
        Car[] cars = new Car[10000];
        // System.out.println(car1.numberOfCars);

        // Car 객체를 10000개 생성한다
        for(int i = 0; i < 10000; i++) {
            cars[i] = new Car("빨강" + i);
        }
        System.out.println(Car.numberOfCars);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Car 객체의 개수를 출력한다.
        System.out.println(cars);

        // 객체가 소멸될때 객체의 총수를 1 감소
        // 소멸된 객체의 색깔을 출력하시오.

        // 정적메소드 호출
        Car.print();
    }
}

