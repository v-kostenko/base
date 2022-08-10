package oop.exceptions.basic;

import java.util.Random;

public class FourthClass {

    public void generateAgroColoboc() throws AgroColobok{
//        try {
            Random random = new Random();
            int x = random.nextInt(7);

            if (x < 5) {
                System.out.println("x < 5");
            } else {
                AgroColobok agroColobokException = new AgroColobok("Agrocoloboc exception/ x > 5");
                throw agroColobokException;
            }
//        } catch (AgroColobok agr) {
//            System.out.println(agr.getMessage());
//        }
    }
}
