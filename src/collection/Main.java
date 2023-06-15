package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // CollectionInterfaceDemo.show();
        // ListInterfaceDemo.show();
        // QueueInterfaceDemo.show();
        MapInterfaceDemo.show();
        List<Customer> customers = new ArrayList<>();

        Collections.addAll(customers, new Customer("Kojo", "kojo@gmail"),
                new Customer("Appiah", "kofi@gmail.com"), new Customer("Esi", "esi@gmail"));

        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}
