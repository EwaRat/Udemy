package section5.zad15;

// sprawdzenie czy dana liczba jest palindromem

public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int num = number; // num - jakas zmienna uzyta dalej zamiast number !!! przyrownana do number


        while (num != 0) {
            int lastDigit = num % 10;

            reverse = reverse * 10 + lastDigit;

            num /= 10;

        }
        if (number == reverse) { // tu juz porownujemy number i reverse


            return true;

        } else {
            return false;
        }
    }
}

