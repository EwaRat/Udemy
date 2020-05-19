package section5;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 2; i < 9; i++) {
            System.out.println("10000 at " + i + " interest= " + calculateInterest(10000.0, i));
            System.out.println("10000 at " + i + " interest= " + String.format("%.2f", calculateInterest(10000.0, i))); // zeby wszystko wyswietlilo w dobrym formacie
                                                                                                                                // tu roznica przy 700

        }
        System.out.println("********");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10000 at " + i + " interest= " + calculateInterest(10000.0, i));
        }
    }

        public static double calculateInterest ( double amount, double interestRate){
            return (amount * (interestRate / 100));
        }
    }

