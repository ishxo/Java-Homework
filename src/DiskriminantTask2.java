import java.util.Scanner;
public class DiskriminantTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  переменное  a");
        int a = scanner.nextInt();
        System.out.println("Введите  переменное  b");
        int b = scanner.nextInt();
        System.out.println("Введите  переменное  c");
        int c = scanner.nextInt();
        if (a != 0) {
            double D = b * b - 4 * a * c;
            if (D > 0) {
                double  x1 = (-b - Math.sqrt(D)) / 2 * a;
                double  x2 = (-b + Math.sqrt(D)) / 2 * a;
                System.out.println("Квадратное уравнение имеет два корня x1 = " + x1 + " , " + "x2 = " + x2);
                //System.out.println("Корень квадратного уравнения x2 = " + x2);
            } else if (D == 0) {
                double x = -b / 2 * a;
                System.out.println("Корень квадратного уравнения x = " + x);
            } else if (D < 0) {
                System.out.println("Вещественных корней нет");
            }
        } else {
            System.out.println("a не может быть равен 0");
        }
        scanner.close();
    }
}
