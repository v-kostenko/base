package oop.exceptions.car;

import java.util.ArrayList;

public class CandleBox {
    private ArrayList<Candle> candles = new ArrayList<>();

    public CandleBox() {
        for (int i = 0; i < 4; i++) {
            Candle candle = new Candle();
            candles.add(candle);
        }
    }

    public void giveSpark() throws CandleException {
        int counter = 0;
        for (int i = 0; i < candles.size(); i++) {
            try {
                candles.get(i).giveSpark();
            } catch (CandleException candleException) {
                System.out.println("Candle " + i + " is not working");
                counter++;
                if (counter == 2) {
                    throw new CandleException("Candlebox is not working");
                }
            }
        }
    }

}




