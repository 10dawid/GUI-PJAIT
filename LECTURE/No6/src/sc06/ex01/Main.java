package LECTURE.No6.src.sc06.ex01;

public
    class Main {

    public static void main(String[] args) {
        Main.myProcess((e, f) -> e * f);
    }

    public static void myProcess(MyInterface myi){
        myi.fun(10, 20);
    }
}
