package collection;

/*
- Sorting two customer objects using the Comparable Interface with a single field like the `name` field

-In situations where we have two or more fields like email, password, address, we use the Comparator Interface
in a different class as EmailComparator to sort the customer objects
*/
public class Customer implements Comparable<Customer> {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Customer other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
