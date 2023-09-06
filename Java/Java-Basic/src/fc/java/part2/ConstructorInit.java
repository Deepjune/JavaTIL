package fc.java.part2;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("나길동",60,"010-2222-2222");
        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());

    }
}
