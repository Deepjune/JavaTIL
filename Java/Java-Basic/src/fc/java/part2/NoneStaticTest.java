package fc.java.part2;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NoneStaticTest nst = new NoneStaticTest();
        int sum = nst.hap(a, b);
        int sum2 = StaticTest.hap(a, b);
        System.out.println(sum);
        System.out.println(sum2);
    }
    public int hap(int a, int b) {
        int v = a + b;
        return v;
    }
}
