public class Lesson2Task2 {
    public static void main(String[] args) {
        int N = 50;
        int sum = 0;
        if (N > 0) {
            for (int i = 0; i <= N; i++) {
                sum += i;
            }
            System.out.println("Сумма N чисел = " + sum);
        } else System.out.println("Введите положительное число");

    }
}
