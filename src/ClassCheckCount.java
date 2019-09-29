/*Check Count of mark */

public class ClassCheckCount {
    public static void main(String[] args) {
        int[] numbers = {10, -4, 12, 56, -4, -89};
        int count = 0;
        for (int i = 1; i < numbers.length; i++) {
            if ((numbers[i] > 0 && numbers[i - 1] < 0) || (numbers[i] < 0 && numbers[i - 1] > 0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
