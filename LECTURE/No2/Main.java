package LECTURE.No2;

import LECTURE.No2.p01.Computer;
import LECTURE.No2.p01.Mouse;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        computer.connect(mouse);
    }
}
