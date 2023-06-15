package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionInterfaceDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();

        Collections.addAll(collection, "a", "b", "c");

        collection.remove("a");
        // collection.clear();

        System.out.println(collection);
        // System.out.println(collection.isEmpty());
        for (var item: collection)
            System.out.println(item);
    }
}
