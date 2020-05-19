package section5;

public class ForLoopChallenge {

    //liczby pierwsze

    public static void main(String[] args) {

        int count=0;
        for (int i = 10; i <50 ; i++) {
            if(isPrime(i)) {
                count ++;
                System.out.println("Number " + i + " is a prime number");
                if(count==10) {
                    System.out.println("Exiting for loop");
                    break; // wyjscie z petli
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }
        for (int i = 2; i <=n/2 ; i++) { // lub: for( int i=2;i<=(long) Math.sqrt(n); i++); //szybciej
            if(n % i==0) {
                return false;
            }
        }
        return true;
    }
}
