package foundation;

public class pattern {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
           for (int j= 1; j < 5; j++){
               System.out.print("*");
           }
            System.out.println();
        }


        String h = "Hello World";

        for (int i= 1; i <=5; i++) {
            System.out.println(h.charAt(i));
        }


        int[] a = {1, 2, 6, 7, 9, 9, 10};

        int[][] ages = {{2, 5}, {4,7}, {6,90}};

        for (int i= 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }
}
