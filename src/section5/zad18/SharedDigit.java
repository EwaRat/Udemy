package section5.zad18;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 34));
    }

    public static boolean hasSharedDigit(int a, int b) {

        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {

            int lastDigitA = a % 10;
            int lastDigitB = b % 10;
            while ((lastDigitA == lastDigitB) || (a / 10 == b / 10) || (lastDigitA == b / 10) || (lastDigitB == a / 10)) {
                return true;
            }
            return false;

        } else {
            return false;
        }

    }
}
