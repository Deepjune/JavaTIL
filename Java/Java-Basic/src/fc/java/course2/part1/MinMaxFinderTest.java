package fc.java.course2.part1;
import fc.java.model2.MinMaxFinder;
public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        int max = MinMaxFinder.findMax(arr);
        int min = MinMaxFinder.findMin(arr);

        System.out.println("최대값 : " + max + "\n최소값 : " + min);
    }
}
