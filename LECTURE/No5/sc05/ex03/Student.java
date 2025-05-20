package LECTURE.No5.sc05.ex03;

import java.util.Objects;

public
    class Student
    implements Comparable<Student>{

    private String name;
    private int sNumber;

    public Student(String name, int sNumber) {
        this.name = name;
        this.sNumber = sNumber;
    }

    @Override
    public String toString() {
        return "Student(" + this.name + ", " + this.sNumber+")";
    }

    @Override
    public int compareTo(Student o) {
        return this.sNumber - o.sNumber;
    }

    public String getName() {
        return name;
    }

    public int getsNumber() {
        return sNumber;
    }

//    public boolean equals(Student stud){
//        System.out.println("tu");
//        if(this == stud) return true;
//        if(stud == null) return false;
//
//        return this.sNumber == stud.sNumber
//            && this.name.equals(stud.name);
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) return true;
//        if(obj == null || this.getClass() != obj.getClass()) return false;
//
//        Student stud = (Student) obj;
//
//        return this.sNumber == stud.sNumber
//                && this.name.equals(stud.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (sNumber != student.sNumber) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + sNumber;
        return result;
    }
}
