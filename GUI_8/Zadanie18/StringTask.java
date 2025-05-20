package GUI_8.Zadanie18;

import lombok.Getter;

public class StringTask implements Runnable {
    @Getter
    private final String text;
    private final int number;
    @Getter
    private TaskState state;
    @Getter
    private String result;
    private Thread thread;

    public StringTask(String text, int number) {
        this.text = text;
        this.number = number;
        this.state = TaskState.CREATED;
        this.result = "";
    }

    @Override
    public void run() {
        state = TaskState.RUNNING;
        result = "";
        for (int i = 0; i < number; i++) {
            for (int j = text.length() - 1; j >= 0; j--) {
                result += text.charAt(j); // obowiązkowy '+'
                if (Thread.currentThread().isInterrupted()) {
                    state = TaskState.ABORTED;
                    return;
                }
            }
        }
        state = TaskState.READY;
    }

    public void start() {
        thread = new Thread(this); // użyj implementacji Runnable
        thread.start();
    }

    public void abort() {
        if (thread != null) {
            thread.interrupt();
        }
    }

    public boolean isDone() {
        return state == TaskState.ABORTED || state == TaskState.READY;
    }
}
