package bracketPush;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BracketCheckerTest {

    @Test
    public void returnTrueIfStringContainsCorrectBrackets() {
        BracketChecker bc = new BracketChecker("{}()[]");

        assertTrue(bc.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    public void returnTrueIfBracketsAreMixed() {
        BracketChecker bc = new BracketChecker("{([)]}");

        assertTrue(bc.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    public void returnTrueIfWordIsEmpty() {
        BracketChecker bc = new BracketChecker("");

        assertTrue(bc.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    public void returnFalseIfBracketsAreInvalid() {
        BracketChecker bc = new BracketChecker("{(");

        assertFalse(bc.areBracketsMatchedAndNestedCorrectly());
    }
}
