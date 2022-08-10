package oop.storage;

import java.util.Scanner;

public class Storage {
    private Product[][] storage = {new Product[5], new Product[6], new Product[7]};
    private double capacity = 50;

    public Storage() {
        Product p = new Product("Apple", "Gold", 12.23, 45);
        storage[0][0] = p;

        Product p1 = new Product("Milk", "White", 13, 25);
        storage[0][1] = p;

        menu();
    }

    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("Выберите что-то \n1. Add");
        int option = scanner.nextInt();
        if (option == 1)
            add();
    }

    private void add() {
        System.out.println("Какой товар добавляем? Укажите название.");
        String title = scanner.next();

        System.out.println("Укажите бренд");
        String brand = scanner.next();

        System.out.println("Укажите цену");
        double price = scanner.nextDouble();

        System.out.println("Укажите количество");
        double amount = scanner.nextDouble();

        int freeShelfNumber = -1;
        int number = -1;

        for (int i = 0; i < storage.length; i++) {
            for (int j = 0; j < storage[i].length; j++) {

                if (storage[i][j] == null && freeShelfNumber == -1) {
                    freeShelfNumber = i;
                    number = j;
                }
                if (storage[i][j] != null && title.equals(storage[i][j].getTitle()) && price == storage[i][j].getPrice()) {
                    double currentAmount = storage[i][j].getAmount(); //45
                    double freeAmount = capacity - currentAmount; //50 - 45 = 5

                    if (freeAmount >= amount) {
                        double summAmount = currentAmount + amount;
                        storage[i][j].setAmount(summAmount);
                        System.out.println("В ячейке " + i + " на позиции " + j + " товаров " + storage[i][j].getAmount());

                        return;
                    }
                    storage[i][j].setAmount(capacity);
                    System.out.println("В ячейке" + i + " на позиции " + j + " товаров " + capacity);
                    amount = amount - freeAmount;
                    System.out.println("Не поместилось " + amount);
                }

                if (i == storage.length - 1 && j == storage[i].length - 1) {
                    if (freeShelfNumber == -1) {
                        System.out.println("Места свободного нет. Товара" + title + " осталось " + amount);
                        return;
                    }

                    if (amount <= capacity) {
                        Product product = new Product(brand, title, price, amount);
                        storage[freeShelfNumber][number] = product;
                        System.out.println("Товар в ячейке " + freeShelfNumber + " на позиции " + number + " в количестве " + amount);

                    } else {
                        Product product = new Product(brand, title, price, amount);
                        storage[freeShelfNumber][number] = product;

                        System.out.println("Товар в ячейке " + freeShelfNumber + " на позиции " + number + " в количестве " + capacity);

                        System.out.println("Не поместилось " + amount);
                        i = freeShelfNumber;
                        j = number;
                        freeShelfNumber = -1;
                        number = -1;
                    }


                }
            }
        }
    }


}
