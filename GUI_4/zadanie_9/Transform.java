package GUI_4.zadanie_9;

@FunctionalInterface
public interface Transform <T,R>{
    public R apply(T argument);
}
