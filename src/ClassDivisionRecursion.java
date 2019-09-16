// Division problem implementation with Recursion
public class ClassDivisionRecursion {
    public static void main(String[] args) {
        division(13);
    }

    public static void division(int num) {
        if (num <= 100) {
            System.out.println(num);
            division(num + 13);
        }
    }
}
