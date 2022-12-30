package oop.multyThreading.basic;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = Thread.currentThread();
        System.out.println(thread);

        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread);

        String name = thread.getName();
        System.out.println(name);

        thread.setName("Additional");
        System.out.println(thread);
        System.out.println(thread.getName());

        String getGroupName = thread.getThreadGroup().getName();
        System.out.println("Group Name: " + getGroupName);

        try {
            Thread.sleep(5000);
            System.out.println("Stop thread");
        } catch (InterruptedException e){
            e.printStackTrace();
        }

//        PrintingThread vasia = new PrintingThread("Vasia", 7);
//        PrintingThread ivan = new PrintingThread("Ivan", 6);
//
//        Timer timer = new Timer();
//
//        Thread thread = new Thread(timer);
//        thread.start();
//
//        vasia.start();
//        ivan.start();
//
//        vasia.join(10000);
//        ivan.join();
//        thread.join();
//
//
//        System.out.println("Закончился поток main");
























    }
}
