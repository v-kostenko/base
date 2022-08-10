package oop.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    private Scanner scanner = new Scanner(System.in);
    private Map<Integer, ArrayList<Book>> library = new HashMap<>();


    public Library() {
        System.out.println("Сколько полок?");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            System.out.println("Сколько ячеек на полке " + (i + 1) + " ?");
            int boxes = scanner.nextInt();

            ArrayList<Book> shelf = new ArrayList<>();
            for (int j = 0; j < boxes; j++) {
                shelf.add(null);
            }

            library.put(i + 1, shelf);
        }

        for (Integer shelfNumber : library.keySet()) {
            System.out.println(shelfNumber);

            ArrayList<Book> shelf = library.get(shelfNumber);

            for (int i = 0; i < shelf.size(); i++) {
                System.out.print(shelf.get(i) + " ");
            }
            System.out.println();
        }

        menu();

    }

    private void menu() {
        System.out.println("Что делавем? \n1. Add book");

        int result = scanner.nextInt();

        switch (result) {
            case 1:
                add();
                break;
        }
    }

    public void add() {

        for (Integer integer : library.keySet()) {
            ArrayList<Book> shelf = library.get(integer);
            for (int i = 0; i < shelf.size(); i++) {
                if (shelf.get(i) == null){
                    shelf.set(i, new Book());
                }
            }


        }


    }


}
