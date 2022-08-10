package oop.interfaces.lambdas;

public class Main {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void execute(int x) {
                System.out.println(Math.pow(x, 2));
            }
        };

        Action lambda = (int z) -> System.out.println(Math.pow(z, 2));

        action.execute(3);
        lambda.execute(3);

        Action2 action2 = new Action2() {
            @Override
            public String execute(int str) {
                return str + "";
            }
        };

        System.out.println(action2.execute(123));
        Action2 lambda2 = str2 -> str2 + "";
        System.out.println(lambda2.execute(123));

        Action3 action3 = new Action3() {
            @Override
            public int execute(String str) {
                char[] temp = str.toCharArray();
                int count = 0;

                for (int i = 0; i < temp.length; i++) {
                    if (temp[i] >= '0' && temp[i] <= '9')
                    count++;
                }
                return count;
            }
        };
        System.out.println(action3.execute("9qwe0"));
        Action3 lambda3 = str3 -> {
            char[] temp = str3.toCharArray();
            int count = 0;
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] >= '0' && temp[i] <= '9'){
                    count++;
                }
            }
            return count;
        };
        System.out.println(lambda3.execute("9qwe0"));

        int[] arr4 = new int[]{1, 2, 3, 4};
       final Wrapper wrapper = new Wrapper();

        Action4 lambda4 = arr -> {
            for (int i = 0; i < arr.length; i++) {
                wrapper.setSum(arr[i]);
            }
            return ( wrapper.getWarapper() * 1.0 / arr.length);
        };
        System.out.println( lambda4.execute(arr4));


        Action5 action5 = (String str101) -> {
            char[] temp = str101.toCharArray();
            int count = 0;
            for (int i = 0; i < temp.length; i++) {
                count++;
            }
            System.out.println(count);
        };

        action5.execute2("WErt");








    }
}
