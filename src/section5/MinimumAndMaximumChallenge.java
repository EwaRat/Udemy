package section5;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min=Integer.MAX_VALUE; // tu wlasni tak odwrotnie ze min=max value, zebyu bralo min i max z zakresu liczb ktore podajemy
        int max=Integer.MIN_VALUE;


        while(true) {
            System.out.println("Enter number:");
            boolean isAnInt=sc.hasNextInt();

            if(isAnInt) {
                int number=sc.nextInt();

                if(number>max) {
                    max=number;
                }
                if(number<min) {
                    min=number;
                }

            } else {
                break;

            }
            sc.nextLine();
        }
        System.out.println("min= " + min + ", max=" + max);
        sc.close();
    }


}
