package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        // 일반사원 한명의 객체를 생성하고 데이터를 저장후 출력을 하세요
        RempVO vo = new RempVO("홍길동", 35, "010-1111-1111", "2022-10-10", "홍보부", true);

        System.out.println(vo.toString());
    }
}
