package oop.exceptions.basic;

public class Second {
    public static void secondMethod() throws AgroColobok{
        try {
            Third third = new Third();
            third.thirdMethod();
            String str = null;
            System.out.println(str.length());
        } finally {
            veryImportant();
        }
        //} catch (NullPointerException exception){
            //System.out.println("Обработана ситуация в классе Second");
        //}
    }

    private static void veryImportant(){
        System.out.println("VeryImportant!");
    }
}
