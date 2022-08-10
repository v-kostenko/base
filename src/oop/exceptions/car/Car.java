package oop.exceptions.car;

public class Car {
    private Accumulator accumulator = new Accumulator();
    private FuelTank fuelTank = new FuelTank();
    private CandleBox candleBox = new CandleBox();
    private Engine engine = new Engine();
    private Display display = new Display();
    private Controller controller = new Controller();

    public Car() {

    }

    public void start() {
        controller.controlProcess();
    }

    public void accelerate(int turnOvers){
        controller.accelerateEngine(turnOvers);
    }

    public void reduceEngine(int turnOvers){
        controller.reduceEngine(turnOvers);
    }

    public class Controller {

        public void controlProcess(){
            try {
                accumulator.giveEnergy();
                fuelTank.giveFuel();
                candleBox.giveSpark();
                engine.startEngine();
                display.show(engine.toString());
            } catch (AccumulatorException accumulatorException) {
                display.show(accumulatorException.getMessage());
            } catch (FuelException fuelException){
                display.show(fuelException.getMessage());
            } catch (CandleException candleException){
                display.show(candleException.getMessage());
            } catch (EngineException engineException){
                display.show(engineException.getMessage());
            }
        }

        public void accelerateEngine(int turnOvers){
            engine.increaseTurnOvers(turnOvers);
            System.out.println("TurnOvers: " + engine.getTurnOvers());
        }

        public void reduceEngine(int turnOvers){
            engine.decreaseTurnOvers(turnOvers);
            System.out.println("TurnOvers: " + engine.getTurnOvers());
        }
    }




}
