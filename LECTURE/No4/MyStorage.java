package LECTURE.No4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class MyStorage<T> implements  Iterable<T> {
    private T[] data = (T[]) new Object[20];
    private int count;

    public MyStorage(){
        this.count = 0;
    }

    public void add(T type) {this.data[count++] = type;}

    public T get(int index) {return this.data[index];}

    //implementacja iterable


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int iterCount = 0;
            private final int onCreationCount = count;
            @Override
            public boolean hasNext() {
                if (onCreationCount != count)
                    throw new ConcurrentModificationException();
                return iterCount < count;
            }

            @Override
            public T next() {
                if (iterCount < count)
                    return data[iterCount++];
                else throw new NoSuchElementException("there is no element in this place");
            }
        };
    }
}
