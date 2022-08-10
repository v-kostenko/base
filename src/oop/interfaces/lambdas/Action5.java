package oop.interfaces.lambdas;

@FunctionalInterface
public interface Action5 {

    //double execute1(int x);

    void execute2(String str);

    default void test(String str){
        System.out.println(str);
    }

    static void staticMethod(int x){
        System.out.println(Math.pow(x, 2));
    }

}
