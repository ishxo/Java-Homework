//Determine digits in number

public class ClassDetermineDigits {
    public static void main(String[] args) {
        long number = 9099009099999999999L;
        int count = 0;
        while (number > 0) {
            long digit = number % 10;
            number = (number - digit) / 10;
            if (digit == 9) {
                count++;
            } else {
                count--;
            }
        }
        if (count > 0) {
            System.out.println("цифра 9 встречается в числе чаще");
        } else {
            System.out.println("цифра 0 встречается в числе чаще");
        }
    }
}
