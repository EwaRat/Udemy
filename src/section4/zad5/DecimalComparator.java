package section4.zad5;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1,double number2) {

//        number1=Math.round(number1/100);


       number1=(float) number1;
       number2=(float) number2;

        if(number1==number2) {
            return true;
        }
        else {
            return false;
        }


    }


}
