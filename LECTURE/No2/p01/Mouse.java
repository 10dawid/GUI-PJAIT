package LECTURE.No2.p01;

public class Mouse implements USB{

    @Override
    public String hello() {
        return "It's mouse here";
    }

    @Override
    public int getClassID() {
        return 120;
    }
}
