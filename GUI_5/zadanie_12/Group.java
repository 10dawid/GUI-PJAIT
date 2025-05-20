package GUI_5.zadanie_12;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Group {
    private String groupName;
    private int capacity;
    private List<Student> students;


    public Group(String groupName, int capacity) {
        this.groupName = groupName;
        this.capacity = capacity;
        this.students = new ArrayList<>(this.capacity);
    }

    public void assign(Student s1) throws StudentAlreadyAssignedException {
        if (s1.isAssigned()) throw new StudentAlreadyAssignedException(s1 + "is already assigned to a group");
        else {
            if (students.size() < capacity) {
                students.add(s1);
                s1.setAssigned(true);
            }
            else throw new ArrayIndexOutOfBoundsException("No more free places in this group");
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void removeAll() {
        for(Student stud : students)
            stud.setAssigned(false);
        this.students = new ArrayList<>(this.capacity);
    }


    public void remove(Student s3) {
        if (students.contains(s3)) {
            students.remove(s3);
            s3.setAssigned(false);
        }
        else throw new ConcurrentModificationException("This student is not assigned to this group");
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
