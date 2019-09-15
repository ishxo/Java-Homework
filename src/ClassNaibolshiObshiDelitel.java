//Evclide Algoritm implementation
public class ClassNaibolshiObshiDelitel {
    public static void main(String[] args) {
        int bigNumber = 165;
        int smallNumber = 45;
        while (bigNumber % smallNumber != 0) {
            int digit = bigNumber % smallNumber;
            bigNumber = smallNumber;
            smallNumber = digit;
            if (bigNumber % smallNumber == 0) {
                System.out.println("Наибольший общий делитель двух заданных натуральных чисел " + smallNumber);
            }
        }
    }
}
