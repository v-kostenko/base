package oop.safeInteractive;

import java.util.Scanner;

public class SafeInteractive {

        private String password;
        private String pin = "QWERTY";
        private int attempts = 3;
        private boolean isOpen = true;
        private boolean isBlocked;

        private Scanner scanner = new Scanner(System.in);

        public SafeInteractive() {
            for (; ; ) {
                if (isOpen) {
                    close();
                } else {
                    open();
                }
            }
        }

//        private void menu() {
//            for (; ; ) {
//                if (isOpen) {
//                    close();
//                } else {
//                    open();
//                }
//            }
////            System.out.println("Menu: \n 1 - close \n2 - open \n3 - Exit");
////            int result = scanner.nextInt();
//
//        }

        private void close() {
            if (isOpen) {
                System.out.println("Enter password");
                String password = scanner.next();
                this.password = password;
                isOpen = false;
                System.out.println("Password is " + password);
                System.out.println("Safe is closed!");
            }
        }

        private void open() {
            if (isBlocked) {
                System.out.println("To open safe enter PIN");
                String data = scanner.next();

                if (pin.equals(data)) {
                    System.out.println("Safe is opened");
                    isOpen = true;
                    attempts = 3;
                    isBlocked = false;
                } else {
                    System.out.println("Wrong pin!");
                }
                return;
            }
            if (!isOpen) {
                System.out.println("Enter password");
                String data = scanner.next();

                if (data.equals(password)) {
                    System.out.println("Safe is opened");
                    attempts = 3;
                    isOpen = true;
                } else {
                    System.out.println("Wrong password!");
                    attempts--;
                    if (attempts == 0) {
                        isBlocked = true;
                        System.out.println("Safe is blocked!");
                    }
                }
            }
        }


    }

