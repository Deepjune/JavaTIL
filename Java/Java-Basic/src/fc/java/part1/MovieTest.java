package fc.java.part1;

public class MovieTest {
    public static void main(String[] args) {
        Movie mv = new Movie();
        mv.m_title = "아이언맨";
        mv.m_day = "2022.12.14";
        mv.m_major = "로다주";
        mv.m_part = "액션";
        mv.m_time = 192;
        mv.m_level = 12;

        System.out.println(mv.m_title+"\t"+mv.m_day+"\t"+mv.m_major+"\t"+mv.m_part+"\t"+mv.m_time+"\t"+mv.m_level);
    }
}
