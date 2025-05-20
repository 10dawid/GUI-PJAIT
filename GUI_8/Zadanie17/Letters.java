package GUI_8.Zadanie17;

import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

public class Letters {

    private final List<Thread> threads = new ArrayList<>();

    public Letters(String name) {
        for (char letter : name.toCharArray()){
            Thread thread = new Thread(
                    ()->{
                        try{
                            while (!Thread.currentThread().isInterrupted()) {
                                System.out.print(letter);
                                Thread.sleep(1000);
                            }
                        } catch (InterruptedException ie){
//                            System.out.println("\nwątek " + letter + " kończy działanie");
                        }
                    },
                    "Thread " + letter);
            threads.add(thread);
        }
    }

    public List<Thread> getThreads() {
        return threads;
    }
}

