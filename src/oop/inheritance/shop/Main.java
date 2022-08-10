package oop.inheritance.shop;

public class Main {
    public static void main(String[] args) {
        Milk almondMilk = new Milk("Almond milk", 5.95, "20.05.2022", true);
        Milk coconutMilk = new Milk("Coconut milk", 7.77, "21.07.2022", true);
        Banana banana = new Banana(true);

        Robot robotToy = new Robot("Robot", 7, 12.99, "Plastic", "USB");
        Ball ball = new Ball("Ball", 3, 49.99, "Leather", 4);
        Ball ballPingpong = new Ball("Ball for ping pong", 10, 1.99, "Plastic", 1.5);

        Ring weddingRing = new Ring(Material.GOLD_585, 2.04, 100.99, 1.05);
        Chain chainSilver = new Chain(Material.SILVER_925, 3.12, 14.55, 10.75);
        Chain chainPlatinum = new Chain(Material.PLATINUM_900, 4.44, 33.55, 15.84);
        Constructor constructor = new Constructor("Constructor LEGO", 5, 100);
        constructor.addPart("Wheel", 4);
        constructor.addPart("Panel", 24);
        constructor.addPart("Scrow", 123);


        Shop shop = new Shop();
        shop.addProduct(almondMilk);
        shop.addProduct(coconutMilk);
        shop.addProduct(banana);
        shop.addProduct(robotToy);
        shop.addProduct(ball);
        shop.addProduct(ballPingpong);
        shop.addProduct(weddingRing);
        shop.addProduct(chainSilver);
        shop.addProduct(chainPlatinum);
        shop.addProduct(constructor);

        System.out.println(shop);


    }
}
