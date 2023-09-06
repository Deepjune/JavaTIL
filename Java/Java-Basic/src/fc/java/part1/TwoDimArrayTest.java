package fc.java.part1;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        // Q. 2행 4열의 [정수형] 배열을 생성하세요
        int count = 1;
        int[][] arr = new int[2][4];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length;j++) {
                arr[i][j] = count;
                count++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        int[][] b = new int[5][];
        b[0] = new int[1];
        b[1] = new int[2];
        b[2] = new int[3];
        b[3] = new int[4];
        b[4] = new int[5];
        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].length;j++) {
                b[i][j] = '*';
                System.out.print((char)b[i][j]);
            }
            System.out.println();
        }
    }
}
