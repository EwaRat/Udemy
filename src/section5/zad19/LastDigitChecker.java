package section5.zad19;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(21,35,45));
        System.out.println(isValid(10));

    }

    public static boolean hasSameLastDigit (int numberA, int numberB, int numberC) {
        if ((numberA >= 10 && numberA <= 1000) && (numberB >= 10 && numberB <= 1000) && (numberC >= 10 && numberC <= 1000)) {

            int lastDigitA=numberA % 10;
            int lastDigitB= numberB % 10;
            int lastDigitC= numberC % 10;
          if ( lastDigitA==lastDigitB || lastDigitA==lastDigitC || lastDigitB==lastDigitC) {
                return true;
            }
        return false;
    }else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        if (number>=10 && number<=1000) {
            return true;

        } else {
            return false;
        }
    }


}
