package scrabble;

public class Scrabble {

    private String word;

    public Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    public int getScore() {
        int sum = 0;
        char currentCharacter;

        for (int i = 0; i < word.length(); i++) {
            currentCharacter = word.charAt(i);
            sum += ScrabbleSet.POINTS_PER_LETTER.get(currentCharacter);
        }

        return sum;
    }
}
