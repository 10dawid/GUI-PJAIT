package LECTURE.No8.ex01;

public
    class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        synchronized (myThread) {
            try {
                myThread.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
