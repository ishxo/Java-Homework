public class MinDigitCount {
    public static void main(String[] args) {
        int number = 520103050;
        int minimum = number % 10;
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            number = (number - digit) / 10;
            if (digit < minimum) {
                minimum = digit;
                count = 0;
            }
            if (digit == minimum) {
                count++;
            }
        }
        System.out.println("минимальная цифра встречается " + count + " раза");
    }
}


