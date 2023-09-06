package fc.java.part2;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // Q. 한사람의 회원 정보를 저장할 객체를 생성하세요
        PersonVO vo = new PersonVO();
        vo.setName("홍길동");
        vo.setAge(500);
        vo.setPhone("010-1111-1111");

        String name = vo.getName();
        int age = vo.getAge();
        String phone = vo.getPhone();

        System.out.println(name+"\t"+age+"\t"+phone);
    }
}
