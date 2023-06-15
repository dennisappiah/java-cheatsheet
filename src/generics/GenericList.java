package generics;
import java.util.Iterator;
/*
Let's say we have a class that could store a list of integers, String, User Object
- We can use Generics to achieve that without creating separate classes for storing list of each types
*/

/* Iterable Interface allows you to iterate over private collection attributes of a class
without making the public
*/

public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count = 0;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index = 0;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return (list.items[index++]);
        }
    }
}
