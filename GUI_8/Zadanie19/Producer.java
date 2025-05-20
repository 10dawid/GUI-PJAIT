package GUI_8.Zadanie19;

import java.util.Random;

public class Producer implements Runnable{

    private Buffer buffer;
    private Random random = new Random();

    public Producer(Buffer b) {
        this.buffer = b;
    }

    @Override
    public void run() {
            while (true){
                try {
                    // Generowanie losowej liczby
                    int value = random.nextInt(100);
                    System.out.println("Producent wygenerował: " + value);

                    // Umieszczenie liczby w buforze
                    buffer.put(value);

                    // Losowy czas uśpienia (0-2s)
                    int sleepTime = random.nextInt(2000);
                    System.out.println("Producent zasypia na " + sleepTime + "ms");
                    Thread.sleep(sleepTime);

                } catch (InterruptedException e) {
                    System.out.println("Wątek producenta przerwany");
                }
            }
    }
}
