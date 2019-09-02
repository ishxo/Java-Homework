import java.util.Arrays;

public class Lesson2Task3 {
    public static void main(String[] args) {
        int [] array = {1, 9, 2, 5, 8, 3};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int element = array[j];
                    array[j] = array[i];
                    array[i] = element;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
