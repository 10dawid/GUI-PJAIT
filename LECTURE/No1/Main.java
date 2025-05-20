package LECTURE.No1;


import LECTURE.No1.food.Pizza;

public class Main {
    public static void main(String[] args) {
        new LECTURE.No1.pack.subPack01.A();
        new LECTURE.No1.pack.subPack02.A();
        System.out.println("in main class");

        MyList myList = new MyList();
        myList.addAtEnd(1);
        myList.addAtEnd(2);
        myList.addAtEnd(3);
        myList.addAtEnd(4);
        myList.addAtEnd(5);
        myList.addAtEnd(6);
        myList.show();
        System.out.println();
        Pizza pizza = new Pizza.PizzaBuilder().setCiasto("cienkie").setSos("pomidor").setSkladniki("ser").build();
        System.out.println(pizza);
    }
}
class Outer{
    int counter = 10;
    public class Inner{
        public int getCount(){return counter;}
    }
}
