package oop.interfaces.computer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Computer {
    private ArrayList<IDisplay> displays = new ArrayList<>();
    private ArrayList<IPrinter> printers = new ArrayList<>();
    private ArrayList<UsbDevice> devices = new ArrayList<>();
    private int currentPrinter = -1;
    Scanner scanner = new Scanner(System.in);

    public void connectPrinter(IPrinter printer) {
        printers.add(printer);
    }

    public void connectDisplay(IDisplay display) {
        displays.add(display);
    }

    public void connectDevice(UsbDevice device) {
        try {
            devices.add(device);
            if (displays.size() == 0) {
                throw new DisplayIsNotConnectedException("Ни один диспей не подключен");
            }
            displayShowInfo(device.showInfo());
        } catch (DisplayIsNotConnectedException displayIsNotConnectedException) {
            System.out.println(displayIsNotConnectedException.getMessage());
        }
    }

    private void showAllPrinters() throws PrinterException {
        try {
            if (printers.size() == 0) {
                throw new PrinterException("Нет ни одного подключенного принтера");
            }
            for (int i = 0; i < printers.size(); i++) {
                System.out.println(i + 1 + ") " + printers.get(i));
            }
        } catch (PrinterException printerException) {
            System.out.println(printerException.getMessage());
        }
    }

    public void selectCurrentPrinter() throws PrinterException, IncorrectDataException {
        try {
            showAllPrinters();
            System.out.println("Какой принтер установить как текущий?");
            int result = scanner.nextInt();
            if (result <= 0 || result >= printers.size()) {
                throw new IncorrectDataException("Принтера с таким номером нет");
            }
            currentPrinter = result;
        } catch (IncorrectDataException incorrectDataException) {
            System.out.println(incorrectDataException.getMessage());
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Некорректное число");
            this.scanner = new Scanner(System.in);
        }
    }

    public void printText(String text) throws PrinterException {
        try {
            if (printers.size() == 0 || currentPrinter < 0) {
                throw new PrinterException("Нет ни одного подключенного принтера");
            }
            printers.get(currentPrinter).print(text);
        } catch (PrinterException printerException) {
            System.out.println(printerException.getMessage());
        }
    }

    public void disconnectPrinter() {
        currentPrinter = -1;
    }

    public void displayShowInfo(String text) {
        for (int i = 0; i < displays.size(); i++) {
            displays.get(i).display(text);
            System.out.println();
        }
    }

    private void showInfo() {
        for (int i = 0; i < devices.size(); i++) {
            devices.get(i).showInfo();
            System.out.println();
        }
    }

    public void selectDevice(){
        for (int i = 0; i < devices.size(); i++) {
            System.out.println(i + 1 + ") " + devices.get(i).showInfo());
        }
        try {
            System.out.println("Какой девайс выбрать?");
            int result = scanner.nextInt();
            if (result <= 0 || result >= devices.size()){
                throw new IncorrectDataException("Нет девайса с таким номером");
            }
            displayShowInfo(devices.get(result - 1).showInfo());
        } catch (IncorrectDataException incorrectDataException){
            System.out.println(incorrectDataException.getMessage());
            scanner = new Scanner(System.in);
            selectDevice();
        }
    }



}
