package GUI_5.zadanie_12;

public class Student {
    private static int count = 1;


    private String firstName;
    private String secondName;
    private int birthYear;
    private int number;
    private boolean isAssigned = false;

    public Student(String firstName, String secondName, int birthYear){
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.number = count++;
    }



    public int getNumber() {
        return number;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(number + ")");
        sb.append(" " + firstName + " " + secondName + " " + birthYear);
        return sb.toString();
    }
}
