package foundation;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // Write a Java Program that allows users to enter 10 numbers and give their sum
        System.out.println("Please enter the 10 numbers");

        Scanner scanner = new Scanner(System.in);

        int[] my_array = new int[10];

        // populating array
        for (int i= 0; i < my_array.length; i++) {
            my_array[i] = scanner.nextInt();
        }

        // finding sum
        int sum = 0;
        for(int e: my_array) {
            sum = sum + e;
        }

        System.out.println("sum= "+ sum);
        float average = (float) sum/ my_array.length;
        System.out.println("Average= "+ average);
    }
}
