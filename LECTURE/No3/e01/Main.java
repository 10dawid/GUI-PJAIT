package LECTURE.No3.e01;

public class Main {
    public static void main(String[] args) {
        MyBox<Boolean> myBox = new MyBox<>();
        myBox.add(true);
        myBox.add(true);
        myBox.add(true);
        myBox.add(false);

        int index = 0;
        while(myBox.get(index) != null)
            System.out.println(myBox.get(index++));
    }
}
