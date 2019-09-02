import java.util.Scanner;
public class Cordinate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координат x");
        double x = scanner.nextDouble();
        System.out.println("Введите координат y");
        double y = scanner.nextDouble();
        if (x <= 1 && y <= 1) {
            if (y >= 0 && y >= x && y >= -x ) {
                System.out.println("Точка попадает в заштрихованную область");
            }
             else if (y <= 0 && y <= x && y <= -x) {
                System.out.println("Точка попадает в заштрихованную область");
            } else {
                System.out.println("Точка не попадает в заштрихованную область");
            }
        } else {
            System.out.println("Введите пpaвильные координаты");
        }
        scanner.close();
    }
}