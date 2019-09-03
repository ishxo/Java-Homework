public class Lesson2Task1 {

        public static void main(String[] args) {
            int A = 1;
            int B = 10;
            System.out.println("Количество целых чисел N = " + (B - 2));
            System.out.println("Все целые числа, расположенные между A и B ");
            for (int N = B - 1; N > A; N--) {
                System.out.println(N);
            }
    }
}
