package oop.generics.base.repeat;

public class Main {
    public static void main(String[] args) {

//        GenericImpl<String, Integer> generic1 = new GenericImpl<>("ERTyuv") {
//            @Override
//            public void method(Integer integer) {
//                System.out.println(Math.pow(integer, 2));
//            }
//        };
//        generic1.method(3);

        Product apple = new Apple(12.33, "Golden", "Green");
        Banana banana = new Banana(11.9, "Banana", "Test");

        MyGeneric<Product> myGeneric = new MyGeneric<>(apple);
        myGeneric.addToList(apple);
        myGeneric.addToList(banana);

        System.out.println(myGeneric.averagePrice());


    }
}
