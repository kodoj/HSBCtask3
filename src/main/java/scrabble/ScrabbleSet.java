package scrabble;

import java.util.HashMap;
import java.util.Map;

public class ScrabbleSet {

    public static final Map<Character, Integer> POINTS_PER_LETTER = new HashMap<>();

    static {
        POINTS_PER_LETTER.put('A', 1);
        POINTS_PER_LETTER.put('E', 1);
        POINTS_PER_LETTER.put('I', 1);
        POINTS_PER_LETTER.put('O', 1);
        POINTS_PER_LETTER.put('U', 1);
        POINTS_PER_LETTER.put('L', 1);
        POINTS_PER_LETTER.put('N', 1);
        POINTS_PER_LETTER.put('R', 1);
        POINTS_PER_LETTER.put('S', 1);
        POINTS_PER_LETTER.put('T', 1);
        POINTS_PER_LETTER.put('D', 2);
        POINTS_PER_LETTER.put('G', 2);
        POINTS_PER_LETTER.put('B', 3);
        POINTS_PER_LETTER.put('C', 3);
        POINTS_PER_LETTER.put('M', 3);
        POINTS_PER_LETTER.put('P', 3);
        POINTS_PER_LETTER.put('F', 4);
        POINTS_PER_LETTER.put('H', 4);
        POINTS_PER_LETTER.put('V', 4);
        POINTS_PER_LETTER.put('W', 4);
        POINTS_PER_LETTER.put('Y', 4);
        POINTS_PER_LETTER.put('K', 5);
        POINTS_PER_LETTER.put('J', 8);
        POINTS_PER_LETTER.put('X', 8);
        POINTS_PER_LETTER.put('Q', 10);
        POINTS_PER_LETTER.put('Z', 10);
    }
}
