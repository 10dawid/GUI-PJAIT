package GUI_8.Zadanie19;

import java.util.Random;

public class Consumer implements Runnable {
    private Buffer buffer;
    private Random random = new Random();

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
        System.out.println("Utworzono konsumenta");
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Pobranie liczby z bufora
                int value = buffer.get();

                // Konsumpcja (wyświetlenie)
                System.out.println("Konsument skonsumował: " + value);

                // Losowy czas uśpienia (0-2s)
                int sleepTime = random.nextInt(2000);
                System.out.println("Konsument zasypia na " + sleepTime + "ms");
                Thread.sleep(sleepTime);
            }
        } catch (InterruptedException e) {
            System.out.println("Wątek konsumenta przerwany");
        }
    }
}
