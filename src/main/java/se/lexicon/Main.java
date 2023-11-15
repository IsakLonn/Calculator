package se.lexicon;

public class Main {
    public static void main(String[] args) {
        StartLoop();
    }

    private static void StartLoop() {
        boolean run = true;

        while (run)
        {
            Text.Print("Press 1 to start calculation, press any other key to stop program: ");

            var value = (int)Input.GetInputValue();

            switch (value)
            {
                case 1:
                    Math.DoMathEquations();
                    break;

                default:
                    run = false;
                    break;
            }

        }
    }
}

