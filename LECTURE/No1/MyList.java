package LECTURE.No1;

public class MyList {
    private IntElement head;

    public void addAtEnd(int val){
        IntElement element = new IntElement(val);

        if (this.head == null) this.head = element;
        else{
            IntElement tmp = this.head;
            while(tmp.getNext() != null)
                tmp = tmp.getNext();

            tmp.setNext(element);
        }
    }
    public void show(){
        IntElement tmp = this.head;
        while(tmp != null){
            System.out.print( tmp.getValue() + " -> ");
            tmp = tmp.getNext();
        }
    }

    private class IntElement {
        private IntElement next;
        private int value;

        public IntElement(int value) {
            this.value = value;
        }

        public IntElement getNext() {
            return next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(IntElement next) {
            this.next = next;
        }
    }

}
