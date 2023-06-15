package generics;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<Integer>();
        // var list2 = new GenericList<User>();
        list.add(1);
        list.add(2);

        // list2.add(new User(20));
        // User user = list2.get(0);

        var iterator = list.iterator();

        while(iterator.hasNext()){
            var current = iterator.next();
            System.out.println(current);
        }

        for (var item: list)
            System.out.println(item);


    }


}
