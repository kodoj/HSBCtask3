package bracketPush;

public class BracketChecker {

    private String bracketString;

    public BracketChecker(String bracketString) {
        this.bracketString = bracketString;
    }

    public boolean areBracketsMatchedAndNestedCorrectly() {
        char currentChar;
        int firstIndex = 0;

        while (bracketString.length() > 0) {
            currentChar = bracketString.charAt(firstIndex);

            if(currentChar == '(') {
                if(bracketString.contains(")")) {
                    getPairAndDelete(')');
                } else {
                    return false;
                }
            } else if (currentChar == '{') {
                if(bracketString.contains("}")) {
                    getPairAndDelete('}');
                } else {
                    return false;
                }
            } else if (currentChar == '[') {
                if(bracketString.contains("]")) {
                    getPairAndDelete(']');
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    private void getPairAndDelete(char c) {
        int removingIndex;
        removingIndex = bracketString.indexOf(c);
        bracketString = bracketString.substring(1, removingIndex) + bracketString.substring(removingIndex + 1);
    }
}