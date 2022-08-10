package oop.exceptions.basic;

import java.util.Random;

public class Third {
    public void thirdMethod() throws AgroColobok{
        FourthClass fourthClass = new FourthClass();
        fourthClass.generateAgroColoboc();

        Random random = new Random();
        int x = random.nextInt(101);

        if (x > 50){
            System.out.println("Happy End");
        } else {
            ColobocException colobocException = new ColobocException("В thirdMethode меньше чем 50");
            throw colobocException;
        }
    }
}
