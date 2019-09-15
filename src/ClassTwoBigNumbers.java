//Class Two Big Numbers implementation
public class ClassTwoBigNumbers {
    public static void main(String[] args) {
        int numberFirst = 192837465;
        int numberSecond = numberFirst;
        int maxFirst = 0;
        int maxSecond = 0;
        int count = 0;
        int countFirstBig = 0;
        int countSecondBig = 0;
        while (numberFirst > 0) {
            count++;
            int digit = numberFirst % 10;
            numberFirst = (numberFirst - digit) / 10;
            if (digit > maxFirst) {
                maxFirst = digit;
                countFirstBig = count;
            }
        }
        count = 0;
        while (numberSecond > 0) {
            count++;
            int digit = numberSecond % 10;
            numberSecond = (numberSecond - digit) / 10;
            if (digit > maxSecond && maxFirst > digit) {
                maxSecond = digit;
                countSecondBig = count;
            }
        }
        int startCountFirst = count - countFirstBig + 1;
        int startCountSecond = count - countSecondBig + 1;
        System.out.println("порядковы номер 1-го максимального числа, считая от конца " + countFirstBig);
        System.out.println("порядковы номер 1-го максимального числа, считая от начала " + startCountFirst);
        System.out.println("порядковы номер 2-го максимального числа, считая от конца " + countSecondBig);
        System.out.println("порядковы номер 2-го максимального числа, считая от начала " + startCountSecond);
    }
}
