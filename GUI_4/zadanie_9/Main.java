package GUI_4.zadanie_9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] sin = {"Alice", "Sue", "Janet", "Bea"};
        System.out.println(Arrays.toString(sin) + '\n');

        Integer[] iout = new Integer[sin.length];

        transform(sin, iout, new StrToInt());
        System.out.println(Arrays.toString(iout));

        Character[] cout = new Character[sin.length];
        transform(sin, cout, argument -> argument.charAt(0));
        System.out.println(Arrays.toString(cout));

        String[] sout = new String[sin.length];
        transform(sin, sout, argument -> argument.toUpperCase());
        System.out.println(Arrays.toString(sout));

    }

    private static <T,R> void transform(T[] in, R[] out, Transform<T,R> trans){
        for(int i = 0; i < out.length; i++){
            out[i] = trans.apply(in[i]);
        }
    }
}
