package section5.zad16;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(101));
    }

    public static int sumFirstAndLastDigit(int number) {

        int firstDigit = 0;
        int lastDigit = number % 10;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            firstDigit = number % 10;
            number = number / 10;
        }

        return (lastDigit + firstDigit);
    }
}

