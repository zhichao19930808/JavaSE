package Collection;

/**
 * Created by Administrator on 2017/4/8.
 */

public class MyVector {

    private static final int DEFAULT_CAPACITY = 10;
    private String[] strings;
    private int size;
    private int capacity;
    private int capacityIncrement;

    // MyVector()
    public MyVector() {
        strings = new String[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    // MyVector(int initCapacity)
    public MyVector(int initCapacity) {
        strings = new String[initCapacity];
        capacity = initCapacity;
    }

    // MyVector(int initCapacity, int capacityIncrement)
    public MyVector(int initCapacity, int capacityIncrement) {
        strings = new String[initCapacity];
        capacity = initCapacity;
        this.capacityIncrement = capacityIncrement;
    }

    // void add(String element)
    public void add(String element) {
        if (size == capacity) {
            capacity = (capacityIncrement > 0) ? capacity + capacityIncrement : capacity * 2;
            String[] newStrings = new String[capacity];
            System.arraycopy(strings, 0, newStrings, 0, strings.length);
            strings = newStrings;
        }
        strings[size++] = element;
    }

    // int size()
    public int size() {
        return size;
    }

    // String get(int index)
    public String get(int index) {
        if (index >= size || index < 0) {
            System.out.println("error.");
            System.exit(0);
//            throw new ArrayIndexOutOfBoundsException(index);
        }
        return strings[index];
    }

    // int capacity()
    public int capacity() {
        return capacity;
    }

    // String remove(int index)
    public String remove(int index) {
        String removedElement = strings[index];
        System.arraycopy(strings, index + 1, strings, index, size - index - 1);
        strings[(size--) - 1] = null;
        return removedElement;
    }

    // String set(int index, String element)
    public String set(int index, String element) {
        String setElement = strings[index];
        strings[index] = element;
        return setElement;
    }
}
