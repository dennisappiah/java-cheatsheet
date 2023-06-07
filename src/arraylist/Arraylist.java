package arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //we can only pass non-primitive data types as parameters of the ArrayList

        ArrayList<String> list = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        // adding elements in an array
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");

        // adding element at specific position
        list.add(2,"element5");

        //changing an element in an array list
        list.set(0, "New Element");

        // removing an element from an arraylist
        list.remove(0);
        list.remove("element5");
        System.out.println(list);

        //for loop
        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //for Each loop
        for (String e: list){
            System.out.println(e);
        }
        // iterator interface
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);
        //compare elements using the Comparable Interface
        System.out.println(list2.get(0).compareTo(list2.get(1)));
    }
}
