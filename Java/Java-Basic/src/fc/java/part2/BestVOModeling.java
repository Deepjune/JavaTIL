package fc.java.part2;

import fc.java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO m = new MovieVO("아바타", 20221214, "제이크 설리", "액션", 192.0f, 12);
        System.out.println(m.toString());
    }
}
