import java.util.Arrays;

public class ClassRandomArray {
    public static void main(String[] args) {
        double[] arrayNumbers = {Math.floor(Math.random() * 5), Math.floor(Math.random() * 5),
                Math.floor(Math.random() * 5), Math.floor(Math.random() * 5)};
        double maximum = 0;
        double minimum = 0;

        for (int i = 1; i < arrayNumbers.length; i++) {
            if (maximum < arrayNumbers[i]) {
                maximum = arrayNumbers[i];
            }
            if (minimum > arrayNumbers[i]) {
                minimum = arrayNumbers[i];
            }
        }
        double average = (maximum + minimum) / 2;
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(average);
    }

}
