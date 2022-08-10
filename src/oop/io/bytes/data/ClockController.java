package oop.io.bytes.data;

import arrays.Arr;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClockController {

    private static boolean saveAll(List<Clock> list) {
        File file = new File("clock.dat");
        file.delete();

        try {
            DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(
                    new FileOutputStream("clock.dat", true)));

            for (int i = 0; i < list.size(); i++) {
                outputStream.writeUTF(list.get(i).getBrand());
                outputStream.writeUTF(list.get(i).getMaterial());
                outputStream.writeLong(list.get(i).getDate().getTime());
                outputStream.writeInt(list.get(i).getBattery().getCapacity());
                outputStream.writeDouble(list.get(i).getPrice());
                outputStream.writeBoolean(list.get(i).isNew());
                outputStream.writeLong(list.get(i).getSerNumb());
            }
            return true;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return false;
    }

    public static boolean save(Clock clock) {

        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream("clock.dat", true)))) {
            dataOutputStream.writeUTF(clock.getBrand());
            dataOutputStream.writeUTF(clock.getMaterial());
            dataOutputStream.writeLong(clock.getDate().getTime());
            dataOutputStream.writeInt(clock.getBattery().getCapacity());
            dataOutputStream.writeDouble(clock.getPrice());
            dataOutputStream.writeBoolean(clock.isNew());
            dataOutputStream.writeLong(clock.getSerNumb());
            return true;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return false;
    }

    public static Clock find(long serNumb) {
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("clock.dat")));
            while (true) {
                String clockBrand = dataInputStream.readUTF();
                String clockMaterial = dataInputStream.readUTF();
                long clockDate = dataInputStream.readLong();
                Date clockDate1 = new Date(clockDate);
                int clockBatteryCapacity = dataInputStream.readInt();
                double clockPrice = dataInputStream.readDouble();
                boolean clockIsNew = dataInputStream.readBoolean();
                long clockSerNumb = dataInputStream.readLong();
                if (clockSerNumb == serNumb) {
                    Battery battery = new Battery(clockBatteryCapacity);
                    return new Clock(clockBrand, clockMaterial, battery, clockPrice, clockSerNumb, clockDate1, clockIsNew);
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (EOFException eofException) {

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        return null;
    }

    public static boolean remove(Clock clock) {
        List<Clock> clocks1 = find();

        if (clocks1 == null) {
            return false;
        }

        boolean result = clocks1.remove(clock);

        if (result == false) {
            return false;
        }

        return saveAll(clocks1);
    }

    private static List<Clock> find() {
        ArrayList<Clock> clocks = new ArrayList<>();
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(
                new FileInputStream("clock.dat")))) {
            try {
                while (true) {
                    String clockBrand = dataInputStream.readUTF();
                    String clockMaterial = dataInputStream.readUTF();
                    long clockDateLong = dataInputStream.readLong();
                    Date clockDate = new Date(clockDateLong);
                    int clockBatteryCapacity = dataInputStream.readInt();
                    double clockPrice = dataInputStream.readDouble();
                    boolean clockIsNew = dataInputStream.readBoolean();
                    long clockSerNumber = dataInputStream.readLong();
                    Battery battery = new Battery(clockBatteryCapacity);

                    Clock clock = new Clock(clockBrand, clockMaterial, battery, clockPrice, clockSerNumber,
                            clockDate, clockIsNew);

                    clocks.add(clock);
                }
            } catch (EOFException eofException) {

            }
            return clocks;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }

    public static List<Clock> find(String brand) {
        List<Clock> filteredByBrand = new ArrayList<>();
        for (Clock clock: find()) {
            if (clock.getBrand().equalsIgnoreCase(brand)){
                filteredByBrand.add(clock);
            }
        }
        return filteredByBrand;
    }

    public static List<Clock> find(double priceFrom, double priceTo) {
        List<Clock> filteredByPriceList = new ArrayList<>();

        for (Clock clock: find()) {
            if (clock.getPrice() >= priceFrom && clock.getPrice() <= priceTo){
                filteredByPriceList.add(clock);
            }
        }
        return filteredByPriceList;
    }


    public static boolean update(Clock clock) {
        return remove(clock) ? save(clock) : false;
    }


}
