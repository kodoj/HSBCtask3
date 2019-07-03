import bracketPush.BracketChecker;
import scrabble.Scrabble;

public class Main {

    public static void main(String[] args) {

        BracketChecker bc = new BracketChecker("[]{}{(})");

        System.out.println(bc.areBracketsMatchedAndNestedCorrectly());
    }
}
