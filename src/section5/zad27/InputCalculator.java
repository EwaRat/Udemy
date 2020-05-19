package section5.zad27;

import java.util.Scanner;
// zadanie do dokonczenia - cos tu jeszcze jest nie tak


public class InputCalculator {
    public static void main(String[]args){
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner= new Scanner (System.in);


        int sum=0;
        long avq=0;
       int avg=0;
        int counter =0;
        while(true) {

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                counter++;
                sum += number;
                avq =sum/number;
                avg=(int) Math.round(avq);

            }else {

            break;
        }
            scanner.nextLine();



    }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }


}
