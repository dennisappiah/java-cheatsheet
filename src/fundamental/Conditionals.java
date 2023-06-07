package foundation;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // Ternary operator in Java
        int income = 20_000;
        String classname = (income > 30_000) ? "First" : "economy";
        System.out.println(classname);

        // switch case
        String role = "admin";

        switch (role){
            case "admin":
                System.out.println("You are admin");
                break;
            case "moderator":
                System.out.println("You are moderator");
                break;
            default:
                System.out.println("Not assigned a role");
        }

        // FizzBuzz
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();


        if (number % 3 == 0 && number % 5 == 0 )
            System.out.println("FizzBuzz");
       else if (number % 5 == 0)
           System.out.println("Fizz");
       else if (number % 3 == 0)
           System.out.println("Buzz");
       else System.out.println(number);

    }
}
