package LECTURE.No7.src;

public class Main {
    public static void main(String[] args) {

        new Runner().start();
        new Runner().start();
        new Runner().start();



        System.out.println("\n========================\n");

        new Thread(new MyExternalRunnable()).start();
        new Thread(new MyExternalRunnable()).start();
        new Thread(new MyExternalRunnable()).start();


        System.out.println("\n========================\n");


//        new MyInternalRunnable();
//        new MyInternalRunnable();
//        new MyInternalRunnable();



    }
}
