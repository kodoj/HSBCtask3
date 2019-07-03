package scrabble;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScrabbleTest {

    @Test
    public void return14IfWordIsCabbage() {
        Scrabble scrabble = new Scrabble("cabbage");
        int expectedResult = 14;

        assertEquals(scrabble.getScore(), expectedResult);
    }

    @Test
    public void return0IfWordIsEmpty() {
        Scrabble scrabble = new Scrabble("");
        int expectedResult  =0;

        assertEquals(scrabble.getScore(), expectedResult);
    }

    @Test void returnExpectedOutputWhileCamelcase() {
        Scrabble scrabble = new Scrabble("aAaAa");
        int expectedResult = 5;

        assertEquals(scrabble.getScore(), expectedResult);
    }

}
