package bracketPush;

public class BracketChecker {

    private String bracketString;

    public BracketChecker(String bracketString) {
        this.bracketString = bracketString;
    }

    public boolean areBracketsMatchedAndNestedCorrectly() {
        char currentChar;
        int firstIndex = 0;
        int removingIndex;

        while (bracketString.length() > 0) {
            currentChar = bracketString.charAt(firstIndex);

            if(currentChar == '(') {
                if(bracketString.contains(")")) {
                    removingIndex = bracketString.indexOf(')');
                    bracketString = bracketString.substring(1, removingIndex) + bracketString.substring(removingIndex+1);
                } else {
                    return false;
                }
            } else if (currentChar == '{') {
                if(bracketString.contains("}")) {
                    removingIndex = bracketString.indexOf('}');
                    bracketString = bracketString.substring(1, removingIndex) + bracketString.substring(removingIndex+1);
                } else {
                    return false;
                }
            } else if (currentChar == '[') {
                if(bracketString.contains("]")) {
                    removingIndex = bracketString.indexOf(']');
                    bracketString = bracketString.substring(1, removingIndex) + bracketString.substring(removingIndex+1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}