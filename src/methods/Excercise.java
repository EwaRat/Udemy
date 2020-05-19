package methods;

// methods - 49.more on methods and a challenge

public class Excercise {

    public static void main(String[] args) {

        int position= calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", position);

        position= calculateHighScorePosition(900);
        displayHighScorePosition("Bob", position);

        position= calculateHighScorePosition(400);
        displayHighScorePosition("Percy", position);

        position= calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", position);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }

        // lub:
//        int position =4;  //ustawione na 4, czyli jesli zadne z ponizszych nie bedzie prawda zwroci 4
//
//        if(playerScore>=1000) {
//            position = 1;
//        } else if(playerScore>=500) {
//            position = 2;
//        } else if(playerScore>=100) {
//            position=3;
//        }
//        return position;
    }
}
