import java.util.Scanner;

public class Condition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();

        if (num > 0 & num % 2 == 0) {
            System.out.println("Число четное " + num);
        }  else if (num > 0 & num % 2 == 1){
            System.out.println("Число не четное " + num);
        } else {
            System.out.println("Введите натуральное  число");
        }
        scanner.close();
    }
}
