package collection;


import java.util.HashMap;
import java.util.Map;

/* Assuming we want to find a customer whose name is Esi from a list of trillion customers
using forEach loop will cost us performance as O(n) -> n
- However using hashmap, O(n) is constant -> O(1)
* */

public class MapInterfaceDemo {
    public static void show() {
        var customer1 = new Customer("Kojo", "kojo@gmail");
        var customer2 = new Customer("Appiah", "kofi@gmail.com");
        var customer3 = new Customer("Esi", "esi@gmail");

        Map<String, Customer> map = new HashMap<>();
        map.put(customer1.getEmail(), customer1);
        map.put(customer2.getEmail(), customer2);
        map.put(customer3.getEmail(), customer3);

        var customer = map.get("Esi");

        System.out.println(customer);

        for (var item: map.values())
            System.out.println(item);

        for (var item: map.entrySet())
            System.out.println(item.getKey());
    }
}
