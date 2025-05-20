package LECTURE.No7.src;

public class Runner extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("This is runner: " + this);
        }
    }
}
