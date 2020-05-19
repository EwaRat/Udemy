package section5.zad17;

// obliczanie sumy cyfr parzystych w podanej liczbie

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));

    }
            public static int getEvenDigitSum(int number) {

                if (number < 0) {
                    return -1;
                }
                int sum = 0;

                    while (number > 0) {
                        // extract the least=significant digit
                        int digit = number % 10;

                        //drop the least-significant digit
                        number /= 10; // same as number=number/10;

                        if(digit%2==0){
                            sum += digit;
                        }
                    }
                return sum;
            }
        }

