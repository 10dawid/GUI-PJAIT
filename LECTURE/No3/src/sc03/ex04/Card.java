package LECTURE.No3.src.sc03.ex04;

public
    enum Card {

    TWO(2), THREE(3), JACK(11), QUEEN(12), KING(13), ACE(14);

    private int value;

    Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
