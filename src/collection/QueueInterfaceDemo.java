package collection;

import java.util.ArrayDeque;
import java.util.Queue;

/*
-The Queue interface extends the both the Collection and List interface*/
public class QueueInterfaceDemo {

    public static void show(){
        Queue<String> queue = new ArrayDeque<>();

        queue.add("c");
        queue.add("g");
        queue.add("d");

        // d -> g -> c

        var front = queue.peek();
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(front);
    }
}
