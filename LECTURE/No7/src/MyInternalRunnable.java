package LECTURE.No7.src;

public class MyInternalRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("MyInternalRunnable" + this);
        }
    }

    public MyInternalRunnable() {
        new Thread(new MyInternalRunnable()).start();
    }
}
