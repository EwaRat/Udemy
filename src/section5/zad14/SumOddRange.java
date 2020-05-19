package section5.zad14;

// odd - nieparzysty

public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 11));
    }

    public static boolean isOdd(int number) {

        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            }
            return false;
        }
        return false;

    }

    public static int sumOdd(int start, int end) {

        if ((start <= end) && (start> 0) && (end > 0)) {
            int sum = 0;

            for (int i = start; i <= end; i++) {
                if(isOdd(i))
                sum += i;
            }
            return sum;
        } else {
            return -1;
        }

    }
}




