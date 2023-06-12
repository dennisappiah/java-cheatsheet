package mortgagecalculator;

import java.util.Scanner;

public class Console {
    public static double readNumber(String prompt, double min, double max) {
         /*
         For each question/prompt we want to validate the user input, for invalid responses
         we keep asking the same question
        */
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " "+ max);
        }
        return value;
    }
}
