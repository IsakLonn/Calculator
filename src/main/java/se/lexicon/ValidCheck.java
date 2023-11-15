package se.lexicon;
/**
 Class for boolean checks
 */
public class ValidCheck {
    static boolean IsValidOperator(char operator)
    {
        return switch (operator) {
            case '+', '-', '*', '/', '=', '%'-> true;
            default -> false;
        };
    }
}
