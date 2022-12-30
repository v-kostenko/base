package oop.lambdasExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AbstractAction development = new Development();
        development.action();

        AbstractAction coding = new AbstractAction() {
            private String language = "Java";

            @Override
            public void action() {
                System.out.println("Coding " + language);
            }
        };

        coding.action();

        new Development() {
            private int x = 0;

            @Override
            public void action() {
                System.out.println("BUILDING house");
                //preparing();
            }

            public void preparing() {
                System.out.println("Preparing...");
            }
        }.preparing();

        new Thread() {
            public void run() {
                System.out.println("First");
                System.out.println("Second");
            }
        }.start();

        new IAction() {
            public void execute() {
                System.out.println("Execute");
            }
        }.execute();

        Runnable thread = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread run...");
            }
        };

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

        new IAction() {
            public void execute() {
                System.out.println("Execute");
            }
        }.execute();

        IAction action = () -> System.out.println("vwvwv");
        action.execute();

        Flyable bee = (int height) -> height + 10;

        System.out.println(bee.fly(10));

        ICalculator calculator = new ICalculator() {

            @Override
            public int caclulate(long x) {
                return Long.toString(x).length();
            }
        };
        System.out.println(calculator.caclulate(120222));

        int result = new ICalculator() {
            @Override
            public int caclulate(long x) {
                return Long.toString(x).length();
            }
        }.caclulate(42425424);
        System.out.println(result);

        ICalculator iCalculator = (x) -> Long.toString(x).length();
        int y = iCalculator.caclulate(9000000);
        System.out.println(y);

        ICalculator sqsq = new ICalculator() {
            @Override
            public int caclulate(long x) {
                String s = Long.toString(x);
                char[] arr = s.toCharArray();
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum = sum + (arr[i] - 48);
                }
                return sum;
            }
        };
        System.out.println(sqsq.caclulate(123));

        ICalculator summ = (x) -> {
            String s = Long.toString(x);
            char[] arr = s.toCharArray();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + (arr[i] - 48);
            }
            return sum;
        };

        System.out.println("Summmmmmmmmmmm");
        System.out.println(summ.caclulate(123));

        //определить среднее положительных
        IArrayAnalizator analizator = (arr) -> {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    Wrapper.iteration++;
                    Wrapper.sum += arr[i];
                }
            }
            return Wrapper.sum / Wrapper.iteration;
        };
        System.out.println(analizator.analise(new int[]{1, 2, 3, -1, 0}));


        //подсчитать стоимость всех товаров
        List<Product> products = new ArrayList<>();
        Product product1 = new Product(10, "Milk", 2);
        Product product2 = new Product(5, "Bread", 1);
        Product product3 = new Product(1, "Water", 2);
        Collections.addAll(products, product1, product2, product3);

        double[] arr = new double[1];

        IProductController productController = new IProductController() {
            @Override
            public double countTotal(List<Product> productLilt) {
                for (Product p : productLilt) {
                    arr[0] += p.total();
                }
                return arr[0];
            }
        };
        System.out.println("Total sum: " + productController.countTotal(products));

        arr[0] = 0;
        IProductController controller = (List<Product> list) -> {
            for (Product p : list) {
                arr[0] += p.total();
            }
            return arr[0];
        };
        System.out.println(controller.countTotal(products));

        //Создать объект на основе пнонимного ксласса и лямбды

        IWalker walker = new IWalker() {
            @Override
            public void walk() {
                System.out.println("I am walking...");
            }

            @Override
            public double run() {
                return Math.PI + 2;
            }

            @Override
            public String toString(){
                return "My speed is " + getSpeed();
            }
        };

        walker.walk();
        System.out.println("Speed is " + walker.run());

        IWalker walker1 = () -> System.out.println("I am walking...");

        IWalker walker2 = new IWalker() {
            private double speed = 1;

            @Override
            public void walk() {
                System.out.println("My speed is " + speed);
            }

            @Override
            public double getSpeed() {
                return speed;
            }

            @Override
            public String toString(){
                return "My speed is " + getSpeed();
            }
        };

        List<IWalker> iWalkers = Arrays.asList(walker1, walker2, walker);
        System.out.println(IWalker.bestWalker(iWalkers));


    }
}
