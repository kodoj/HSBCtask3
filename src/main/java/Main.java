import scrabble.Scrabble;

public class Main {

    public static void main(String[] args) {

        Scrabble scrabble = new Scrabble("cabbage");

        System.out.println(scrabble.getScore());
    }
}
