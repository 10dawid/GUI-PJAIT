package LECTURE.No3.Trening;

public class KeyValuePair <K,V>{
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValuePair{" +
                "key=" + key + " " + key.getClass() +
                ", value=" + value + " " + value.getClass() +
                '}';
    }

    public static void printArrayOfKeys(KeyValuePair<?,?>[] keyValuePairs){
        for (Object obj : keyValuePairs)
            System.out.println(obj);
    }
}
