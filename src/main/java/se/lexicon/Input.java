package se.lexicon;

import java.util.Scanner;

/**
 Class for getting input-related functions
 */
public class Input {

    static float GetInputValue()
    {
        float value = 0;
        boolean inputError = false; // to save try catch for later
        while(true)
        {
            inputError = false;
            Text.Print("Input a value");
            try {
                value = Float.parseFloat(GetInput());
            } catch (Exception e) {
                Text.Print("invalid value");
                inputError = true;
            }
            if(!inputError)
            {
                if(value == 0) Text.Print("Values of zero can not be computed");
                else return value;
            }

        }
    }

    static char GetInputOperator()
    {
        while(true)
        {
            Text.Print("Input a operator");
            var input = GetInput();
            if(input.length() != 1) Text.Print("invalid input");
            else if(ValidCheck.IsValidOperator(input.charAt(0))) return input.charAt(0);
        }
    }

    static String GetInput()
    {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}
