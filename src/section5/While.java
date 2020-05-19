package section5;

//even-parzysty

public class While {

    public static void main(String[] args) {
        int number=4;
        int finishNumber=20;
        int evenNumbersFound=0;

        while(number<=finishNumber) {  // wyswietla liczby poatrzyste od 4-20
            number++;                  // na poczatku odrazu dodaje 1 wiec pierwsza liczba jest 5 - nie jest parzysta,wiec pierwsza wyswietlona to 6
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            evenNumbersFound++;   // jesli ilosc liczb parzystych wynosi 5 lub wiecej to przerwij- czyli wyswietli tylko 5 pierwszych licb parzystych z przedzialu
            if(evenNumbersFound>=5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int number) {
        while(number%2==0) {
            return true;
        }
        return false;
    }
}
