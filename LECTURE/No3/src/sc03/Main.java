package LECTURE.No3.src.sc03;



import LECTURE.No3.src.sc03.ex02.MyStorage;
import LECTURE.No3.src.sc03.ex03.SortStudentBy;
import LECTURE.No3.src.sc03.ex04.Card;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public
    class Main {

    public static void main(String[] args) {
//        MyStorage<Student> studStorage = new MyStorage<>();
//
//        studStorage.add(
//            new Student("Jan", 1701)
//        );
//
//        System.out.println(
//            studStorage.get(0)
//        );
//
//        //===========================================================
//
//        MyStorage myStorage = new MyStorage();
//


        //===============================================

        Student[] students = new Student[]{
            new Student("Jan", 1701),
            new Student("Ola", 8764),
            new Student("tomaszew", 534)
        };

        Arrays.sort(students);

        System.out.println("========Arrays.sort below========");
        for(Student s : students)
            System.out.println(s);


        //===============================================

        Arrays.sort(
            students,
            new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.getsNumber() - o1.getsNumber();
                }
            }
        );
        System.out.println("================");
        for(Student s : students)
            System.out.println(s);

        //===============================

        Arrays.sort(
            students,
            ( o1, o2) -> o2.getsNumber() - o1.getsNumber()
        );
        System.out.println("========with lambda below========");
        for(Student s : students)
            System.out.println(s);

        //=======================================================

        mySort(SortStudentBy.NAME, students);
        System.out.println(
                Card.TWO.getValue()
        );
        for(Student s : students)
            System.out.println(s);
        //==============================
        System.out.println("\n\n\n");
        MyStorage<Student> studentMyStorage = new MyStorage<>();
        studentMyStorage.add(new Student("Jan", 1701));
        studentMyStorage.add(new Student("Ola", 8764));
        studentMyStorage.add(new Student("tomaszew", 534));

        for (Student student : studentMyStorage) System.out.println(student);

        Iterator<Student> iter = studentMyStorage.iterator();


        System.out.println("\n\n\n");
    }

    public static void mySort(SortStudentBy sortType, Student[] students){
        switch(sortType){
            case SNUMBER_D -> Arrays.sort(
                    students,
                    ( o1, o2) -> o2.getsNumber() - o1.getsNumber()
            );
            case SNUMBER_A -> Arrays.sort(
                    students,
                    ( o1, o2) -> o1.getsNumber() - o2.getsNumber()
            );
            case NAME -> Arrays.sort(
                students,
                ( o1, o2) -> o1.getName().compareTo(o2.getName())
            );
        }

    }

}
