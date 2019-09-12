//Lesson 3 Task 1 Switch-case implementation
public class SwitchStatement {
    public static void main(String[] args) {
        int numberN = 1;
        int numberA = 4;
        int numberB = 10;
        int result = 0;
        boolean isValidInput = numberB != 0;
        switch (numberN) {
            case 1:
                result = numberA + numberB;
                break;
            case 2:
                result = numberA - numberB;
                break;
            case 3:
                result = numberA * numberB;
                break;
            case 4:
                result = numberA / numberB;
                break;
            default:
                isValidInput = false;
                break;
        }
        if (isValidInput) {
            System.out.println("Указанное действие числами result = " + result);
        } else {
            System.out.println("numberN целое число в диапазоне 1–4 и В не равно 0");
        }
    }
}
