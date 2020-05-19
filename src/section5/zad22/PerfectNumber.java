package section5.zad22;

// perfect number = czyli suma dzielnikow = licznbie np 6 dzieli sie przez 1, 2 i 3
// 1+2+3=6, wiec 6 jest perfect number

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));


    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

            int sum = 0;

        for (int i = 1; i <=number/2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                return true;
            } else
                return false;
        }
    }

    //lub:

//         if (number < 1) {
//        return false;
//        }
//
//
//        int i = 1;
//        int sum = 0;
//        while (i <= number / 2) {
//        if (number % i == 0) {
//        sum += i;
//        }
//        i++;
//        }
//        if (sum == number) {
//        return true;
//        } else
//        return false;
//        }
//
//
//        }









