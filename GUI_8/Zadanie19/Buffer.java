package GUI_8.Zadanie19;

public class Buffer {
    private int[] data;
    private int putIndex = 0;
    private int getIndex = 0;
    private int count = 0;
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        System.out.println("Utworzono bufor o pojemności: " + capacity);
    }

    public synchronized void put(int value) throws InterruptedException {
        // Czekaj jeśli bufor jest pełny
        while (count == capacity) {
            System.out.println("Bufor pełny. Producent czeka...");
            wait();
        }

        data[putIndex] = value;
        System.out.println("Producent umieścił: " + value + " na pozycji " + putIndex);

        putIndex = (putIndex + 1) % capacity;
        count++;

        System.out.println("Stan bufora po dodaniu: " + count + "/" + capacity);

        // Powiadom konsumenta, że może pobrać element
        notify();
    }

    public synchronized int get() throws InterruptedException {
        // Czekaj jeśli bufor jest pusty
        while (count == 0) {
            System.out.println("Bufor pusty. Konsument czeka...");
            wait();
        }

        int value = data[getIndex];
        System.out.println("Konsument pobrał: " + value + " z pozycji " + getIndex);

        getIndex = (getIndex + 1) % capacity;
        count--;

        System.out.println("Stan bufora po pobraniu: " + count + "/" + capacity);

        // Powiadom producenta, że może dodać element
        notify();

        return value;
    }
}
