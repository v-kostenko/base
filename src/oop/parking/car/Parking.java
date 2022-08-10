package oop.parking.car;

import oop.parking.car.Car;

import java.util.Scanner;

public class Parking {
    Scanner scanner = new Scanner(System.in);
    private Car[][] floors;

    public Parking() {
        System.out.println("Сколько этажей?");
        int amountFloors = scanner.nextInt();
        floors = new Car[amountFloors][];

        for (int i = 0; i < amountFloors; i++) {
            System.out.println("Сколько паркомест на этаже " + i);
            int amountPlaces = scanner.nextInt();
            Car[] places = new Car[amountPlaces];
            floors[i] = places;
        }
        floors[0][0] = new Car("Audi", "Q7", "Black", "AA1111AA");
        floors[0][1] = new Car("Audi", "Q10", "Black", "AA2222AA");
        floors[1][0] = new Car("Audi", "Q10", "Black", "AA2224AA");
        floors[1][1] = new Car("Mersedes", "GLE", "White", "AA3333AA");
        //floors[2][0] = new Car("Mersedes", "GLE", "Black", "AA4444AA");

        // System.out.println(Arrays.deepToString(floors));
        menu();
    }

    private void menu() {
        System.out.println("Выбрать из меню: \n1. Припароваться \n2. Очистить парко. место \n3. Найти");
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> pakrCar();
            case 2 -> takeCar();
            case 3 -> find();

        }
        menu();
    }

    private void pakrCar() {
        for (int i = 0; i < floors.length; i++) {
            for (int j = 0; j < floors[i].length; j++) {

                if (floors[i][j] == null) {
                    floors[i][j] = new Car();
                    System.out.println("Припарковался на \nЭтаж: " + i + " \nМесто: " + j);
                    return;
                }
            }
        }
        System.out.println("Свободных мест нет");
    }

    private void takeCar() {
        System.out.println("Ввести номер авто");
        String carPlate = scanner.next();

        for (int i = 0; i < floors.length; i++) {
            for (int j = 0; j < floors[i].length; j++) {
                if (floors[i][j] != null && carPlate.equals(floors[i][j].getCarPlate())) {
                    floors[i][j] = null;
                    System.out.println("Паркоместо " + j + " На этаже " + i + " свободно");
                }
            }
        }
    }

    private void find() {
        System.out.println("1. Поиск по бренду и по модели ");
        int result = scanner.nextInt();

        if (result == 1) {
            findByBrandAndModel();
        }


    }

    private void findByBrandAndModel() {
        boolean isFind = false;
        System.out.println("Введи бренд");
        String brand = scanner.next();
        System.out.println("Введи модель");
        String model = scanner.next();

        for (int i = 0; i < floors.length; i++) {
            for (int j = 0; j < floors[i].length; j++) {

                if (floors[i][j] != null) {

                    String brendFind = floors[i][j].getBrand();
                    String modelFind = floors[i][j].getModel();

                    if (brand.equals(brendFind) && model.equals(modelFind)) {
                        isFind = true;
                        System.out.println("Авто находится на этаже " + i + " на месте " + j);
                    }
                }
            }
        }
        if (isFind == false)
        System.out.println("Такого Авто нет на парковке");
    }


}
