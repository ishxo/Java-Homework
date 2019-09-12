import java.util.Arrays;

//Array reverse inplementation
public class ArrayReverse {
    public static void main(String[] args) {
        String[] array = {"first", "second", "third", "fourth", "fifth"};
        for (int i = 0; i < array.length / 2; i++) {
            String element = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = element;
        }
        System.out.println(Arrays.toString(array));
    }
}
