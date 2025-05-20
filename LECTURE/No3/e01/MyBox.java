package LECTURE.No3.e01;

public class MyBox <T> {
    private T[] arrayOfObjects = (T[])new Object[10];
    private int count = 0;


    public void add(T elem){
        this.arrayOfObjects[count++] = elem;
    }
    public T get(int index){
        return this.arrayOfObjects[index];
    }

}
