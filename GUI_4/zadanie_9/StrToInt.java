package GUI_4.zadanie_9;

public class StrToInt implements Transform<String,Integer>{


    @Override
    public Integer apply(String argument) {
        return argument.length();
    }


}
