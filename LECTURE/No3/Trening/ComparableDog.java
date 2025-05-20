package LECTURE.No3.Trening;

public class ComparableDog extends Dog implements Comparable<Dog>{
    public ComparableDog(String name, int age) {
        super(name, age);
    }

    @Override
    public int compareTo(Dog o) {
        return getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
