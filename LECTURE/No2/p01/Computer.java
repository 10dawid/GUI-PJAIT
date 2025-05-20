package LECTURE.No2.p01;

public class Computer {

    public void connect(USB usb){
        System.out.println(usb.hello());

        int id = usb.getClassID();
        System.out.println("dev. class id = " + id);

    }
}
