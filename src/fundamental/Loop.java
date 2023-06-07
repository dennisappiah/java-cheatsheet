package foundation;

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

        // While Loop - looping through countless scenarios

    }
}
