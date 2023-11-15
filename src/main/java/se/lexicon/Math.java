package se.lexicon;

/**
 Class for math functions
 */
public class Math {

    static float Calculate(float a, float b, char operator)
    {
        return switch (operator) {
            case '+', '=' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            default -> 0;
        };
    }

    static void DoMathEquations()
    {
        float value = 0;
        char operator = '+';
        float sum = Input.GetInputValue();
        boolean loop = true;
        while(loop)
        {
            operator = Input.GetInputOperator();
            if(operator == '=')
            {
                loop = false;
                value = 0; // so final calculation won't be wrong
            }
            else value = Input.GetInputValue();

            sum = Calculate(sum,value,operator);

        }
        Text.Print(sum);
    }
}
