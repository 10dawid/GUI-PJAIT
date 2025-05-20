package LECTURE.No7.test;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("running the thread");
        super.run();
    }


}
