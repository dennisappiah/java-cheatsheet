package collection;

import java.util.Comparator;

/*
-In situations where we have two or more fields like email, password, address, we use the Comparator Interface
in a different class as EmailComparator to sort the customer objects
*/

public class EmailComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer customer1, Customer customer2) {
        return customer1.getEmail().compareTo(customer2.getEmail());
    }
}
