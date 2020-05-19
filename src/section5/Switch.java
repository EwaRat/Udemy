package section5;

public class Switch {

    public static void main(String[] args) {

        char value='A';

        switch(value) {
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C': case 'D': case 'E':  // mozna tak zamiast rozposywac kazde osobno
                System.out.println("Value is C,D or E");
                System.out.println("Value is " + value);
                break;
            default:
                System.out.println("Vale is not A, B, C, D or E");
                break;
        }
    }
}
