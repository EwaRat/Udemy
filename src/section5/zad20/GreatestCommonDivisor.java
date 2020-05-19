package section5.zad20;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12, 30));

    }

    public static int getGreatestCommonDivisor( int first, int second) {

        int divisor=1;

        if(first<10 || second<10) {
            return -1;

        } else {
            for (int i = 1; i<=first&& i<=second; i++) {  // !!! mozna cos takiego zrobic &&
                if(first % i ==0 && second % i ==0) {
                    divisor=i;
                }
            }
        }
        return divisor;
    }
}
