package fc.java.part2;

import fc.java.model.StudentVO;

public class StudentArrayTest {
    public static void main(String[] args) {
        // Q. 객체배열을 이용하여 4명의 학생 데이터를 저장하고 출력하세요.
        StudentVO[] std = new StudentVO[4];

        std[0] = new StudentVO("홍길동","컴공",33,"bit@empas.com",2023110,"010-1111-1111");
        std[1] = new StudentVO("나길동","전자",43,"bit@empas.com",2023110,"010-1111-1111");
        std[2] = new StudentVO("김길동","호텔",25,"bit@empas.com",2023110,"010-1111-1111");
        std[3] = new StudentVO("이길동","컴공",51,"bit@empas.com",2023110,"010-1111-1111");

        for(int i = 0; i < std.length; i++) {
            System.out.println(std[i].toString());
        }
    }
}
