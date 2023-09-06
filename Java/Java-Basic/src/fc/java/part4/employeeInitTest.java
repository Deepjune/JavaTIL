package fc.java.part4;

import java.rmi.Remote;

public class employeeInitTest {
    public static void main(String[] args) {
        RempVO vo = new RempVO("홍길동", 500, "010-1111-1111", "2022-10-10", "홍보부", true);
        System.out.println(vo.toString());
    }
}
