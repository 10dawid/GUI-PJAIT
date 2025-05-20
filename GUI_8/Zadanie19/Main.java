package GUI_8.Zadanie19;

public class Main {
    public static void main(String[] args) {
        // Utworzenie bufora o pojemności 5
        Buffer buffer = new Buffer(5);

        // Utworzenie i uruchomienie wątku producenta
        Thread producerThread = new Thread(new Producer(buffer));
        producerThread.start();

        // Utworzenie i uruchomienie wątku konsumenta
        Thread consumerThread = new Thread(new Consumer(buffer));
        consumerThread.start();

        System.out.println("Program będzie działał przez 15 sekund...");

        try {
            // Zakończenie programu po 15 sekundach
            Thread.sleep(15000);

            // Przerwanie wątków
            producerThread.interrupt();
            consumerThread.interrupt();

            // Oczekiwanie na zakończenie wątków
            producerThread.join();
            consumerThread.join();

            System.out.println("Program zakończył działanie");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
