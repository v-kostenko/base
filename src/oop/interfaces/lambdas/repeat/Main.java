package oop.interfaces.lambdas.repeat;

import oop.interfaces.lambdas.Wrapper;
import oop.library.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SomeI someI = new SomeI() {
            @Override
            public String convertToInt(String str1, String str2) {

                char[] string1 = str1.toCharArray();
                int counter1 = 0;
                for (int i = 0; i < string1.length; i++) {
                    if (string1[i] >= '0' && string1[i] <= '9') {
                        counter1++;
                    }
                }

                char[] string2 = str2.toCharArray();
                int counter2 = 0;
                for (int i = 0; i < string2.length; i++) {
                    if (string2[i] >= '0' && string2[i] <= '9') {
                        counter2++;
                    }
                }
                if (counter1 >= counter2) {
                    return str1;
                }
                return str2;
            }
        };

        String strrr = someI.convertToInt("qeqeqe144", "weqeqe22");
        System.out.println(strrr);

        String str1 = "qeqeqe144";
        String str2 = "weqeqe22";


        SomeI someI1 = (w, e) -> {

            char[] string1 = w.toCharArray();
            int counter1 = 0;
            for (int i = 0; i < string1.length; i++) {
                if (string1[i] >= '0' && string1[i] <= '9') {
                    counter1++;
                }
            }

            char[] string2 = e.toCharArray();
            int counter2 = 0;
            for (int i = 0; i < string2.length; i++) {
                if (string2[i] >= '0' && string2[i] <= '9') {
                    counter2++;
                }
            }
            if (counter1 >= counter2) {
                return w;
            }
            return e;
        };

        String s = someI1.convertToInt(str1, str2);
        System.out.println(s);

        CompareI compareI = new CompareI() {
            @Override
            public double compare(double x, double y) {
                return x > y ? x : y;
            }
        };

        System.out.println(compareI.compare(2.33, 2.33));

        CompareI compareI1 = (b, n) -> b > n ? b : n;
        System.out.println(compareI1.compare(2.33, 2.33));


        final Wrapper1 wrapper1 = new Wrapper1();
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(12);
        integers.add(19);


        FinderI finderI = (x) -> {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) > wrapper1.getMax()){
                    wrapper1.setMax(x.get(i));
                }
            }
        };

        finderI.find(integers);
        System.out.println(wrapper1.getMax());


    }
}
