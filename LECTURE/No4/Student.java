package LECTURE.No4;

public class Student implements Comparable<Student>{
    private String name;
    private int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Student o) {
        return this.number - o.number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return this.number == ((Student) obj).number && this.name.equals(((Student) obj).name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return name + " -> " + number;
    }
}
