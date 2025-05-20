package LECTURE.No6.src.sc06.ex04;

public
    class Main {

    public static void main(String[] args) {
        A ifMeth = new A() {
            @Override
            public int fun(int a, int b) {
                return a * b;
            }
        };

        ifMeth = Main::myFun;

        ifMeth.fun(10, 20);
    }

    public static int myFun(int a, int b){
        return a / b;
    }
}

interface A{
    int fun(int a, int b);
}
