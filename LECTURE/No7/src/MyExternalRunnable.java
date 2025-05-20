package LECTURE.No7.src;

public class MyExternalRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("MyExternalRunner" + this);
        }
    }
}
