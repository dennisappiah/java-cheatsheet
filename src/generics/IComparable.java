package generics;

public class IComparable {
    public static void main(String[] args) {
        var user1 = new User(20);
        var user2 = new User(30);

        if (user1.compareTo(user2) < 0)
            System.out.println("user1 < user 2");
        else if (user1.compareTo(user2) > 0)
            System.out.println("user1 > user 2");
        else
            System.out.println("user1 = user 2");

    }
}
