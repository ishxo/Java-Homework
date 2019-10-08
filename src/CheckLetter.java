public class CheckLetter {
    public static void main(String[] args) {
        String firstWord = "Tailand";
        String secondWord = "Dacota";
        String firstWordLower = firstWord.toLowerCase();
        if (firstWordLower.charAt(0) == secondWord.charAt(secondWord.length() - 1)) {
            System.out.println("первое слово начинается на ту же букву, на которую заканчивается второе слово");
        } else {
            System.out.println("первое слово не начинается на ту же букву, на которую заканчивается второе слово");
        }
    }
}
