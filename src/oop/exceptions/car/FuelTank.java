package oop.exceptions.car;

import java.util.Random;

public class FuelTank {
    private int fuelAmount;
    private Random random = new Random();
    private Pump pump = new Pump();

    public FuelTank(){
        fuelAmount = random.nextInt(101);
    }

    public void giveFuel() throws FuelException{
        pump.pumpingFuel();
    }



    class Pump{

        public int pumpingFuel()throws FuelException{
            if (fuelAmount <= 3){
                throw new FuelException("Fuel is not enough");
            }
            return fuelAmount - 1;
        }
    }




}
