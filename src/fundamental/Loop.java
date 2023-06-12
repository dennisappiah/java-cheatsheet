package fundamental;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int[] a = {1, 2, 6, 7, 9, 9, 10};

        int[][] ages = {{2, 5}, {4,7}, {6,90}};

        // for loop
        for (int i= 0; i < a.length; i++)
            System.out.println(a[i]);

        for (int i = 1; i < 5; i++) {
            for (int j= 1; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // For Each
        for (int e: a)
            System.out.println(e);

        // Write a Java Program that allows users to enter 5 numbers and give their sum
        System.out.println("Please enter the 5 numbers");

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

        // While Loop - looping through countless scenarios
        String inputText = "";

        while (!inputText.equals("quit")){
            System.out.println("input");

            inputText = scanner.next().toLowerCase();
            if (inputText.equals("pass"))
                continue;   // moves a control statement to beginning a loop
            if (inputText.equals("quit"))
                break;     // terminates a loop
            System.out.println(inputText);
        }
    }
}
