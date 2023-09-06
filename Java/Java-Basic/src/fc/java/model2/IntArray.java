package fc.java.model2;
import java.util.*;

public class IntArray {
    private static final int DEFAULT_CAPACITY = 5; // 수정불가
    private int[] elements;
    private int size = 0;
    // 생성동작
    public IntArray() {
        elements = new int[DEFAULT_CAPACITY];
    }
    // 저장하는 동작
    public void add(int element) {
        if(elements.length == size)
            ensureCapacity(); // 메모리의 크기를 2배로 늘리는 작업
        elements[size++] = element;
    }
    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    // 얻는동작
    public int get(int index) {
        if(index < 0 && index >= size)
            throw new IndexOutOfBoundsException("범위초과");

        return elements[index];
    }

    // 원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }
}
