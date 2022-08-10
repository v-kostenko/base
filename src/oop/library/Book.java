package oop.library;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;
    private int pages;
    private String janre;

    Scanner scanner = new Scanner(System.in);

    public Book(String title, String author, int year, int pages, String janre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.janre = janre;
    }

    public Book() {
        System.out.println("Создать книгу \n Введите название");
        String title = scanner.next();
        this.title = title;

        System.out.println("Введите имя автора");
        String author = scanner.next();
        this.author = author;

        System.out.println("Укажите год издания");
        int year = scanner.nextInt();
        this.year = year;

        System.out.println("Кажите кол-во страниц");
        int pages = scanner.nextInt();
        this.pages = pages;

        System.out.println("Укажите жанр");
        String janre = scanner.next();
        this.janre = janre;
    }

    public void getInfo() {
        System.out.println("Название книги: " + title + " \nАвтор: " + author + " \nГод выпуска " + year +
                " \nКоличество страниц: " + pages + " \nЖанр " + janre);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String getJanre() {
        return janre;
    }

}
