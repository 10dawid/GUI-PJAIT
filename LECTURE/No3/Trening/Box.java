package LECTURE.No3.Trening;

import java.util.Arrays;

public class Box {
    private int num;
    private char sign;
    private double dnum;


    public Box(int num, char sign, double dnum) {
        this.num = num;
        this.dnum = dnum;
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "{" +
                "num=" + num +
                ", sign=" + sign +
                ", dnum=" + dnum +
                '}';
    }

    public static void sortBoxes(Box[] boxes, SortBoxBy sortBoxBy){
        switch (sortBoxBy){
            case NUM_A -> Arrays.sort(boxes, ((o1, o2) -> o1.num - o2.num) );
            case NUM_D -> Arrays.sort(boxes, ((o1, o2) -> o2.num -  o1.num));
            case SIGN_A -> Arrays.sort(boxes, ((o1, o2) -> o1.sign - o2.sign));
            case SIGN_D -> Arrays.sort(boxes,((o1, o2) -> o2.sign - o1.sign));
            case DNUM_A -> Arrays.sort(boxes, ((o1, o2) -> (int)(o1.dnum - o2.dnum)));
            case DNUM_D -> Arrays.sort(boxes, ((o1, o2) -> (int)(o2.dnum - o1.dnum)));
            case SUM_A -> Arrays.sort(boxes, ((o1, o2) -> (int)(
                    o1.num + o1.dnum + o1.sign - o2.num - o2.dnum - o2.sign
                    )));
            case SUM_D -> Arrays.sort(boxes, ((o1, o2) -> (int)(
                    o2.num + o2.dnum + o2.sign - o1.num - o1.dnum - o1.sign
                    )));
        }
    }


}
