package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//list interface uses the index of the collection to access elements
public class ListInterfaceDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");

        list.set(0, "a+");
        list.remove(0);

        System.out.println(list);
        System.out.println(list.indexOf("a"));
        System.out.println(list.subList(0, 2));
        for (var item : list)
            System.out.println(item);

    }
}
