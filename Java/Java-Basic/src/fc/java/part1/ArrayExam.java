package fc.java.part1;

public class ArrayExam {
    public static void main(String[] args) {
        // 정수 1개를 저장할 [변수를 선언] 하시오.
        int a;
        a = 10;

        // 정수 [3개]를 저장할 [변수를 선언] 하시오.
        int[] b = new int[3];
        for(int i = 0; i < b.length; i++) {
            b[i] = 10 * (i + 1);
        }
        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        // 아래 char[] 배열에 APPLE이라는 문자가 저장되어 있다. 대문자로 된 APPLE을 소문자apple로 출력하세요
        char[] c = {'A', 'P', 'P', 'L', 'E'}; // APPLE
        for(int i = 0; i < c.length; i++) {
            c[i] += 32;
        }
        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
