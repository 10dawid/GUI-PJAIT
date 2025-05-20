package LECTURE.No7.test;

public class MyRun implements Runnable{

    private String message = "message abc";


    @Override
    public void run() {
        System.out.println(message);
    }
}
