package section5.zad25;

// cos tu jest jeszcz enie tak - gdy liczba pierwsza tez powinno zwracac -1

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {
        int i = 0;

        if (number < 0) {
            return -1;
        }


        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }

        }
        return i;

    }

}






