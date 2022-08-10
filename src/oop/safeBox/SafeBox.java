package oop.safeBox;

public class SafeBox {
    private String password;
    private String pin = "QWERTY";
    private int attempts = 3;
    private boolean isOpen = true;
    private boolean isBlocked;

    public void close(String password) {
        if (isOpen == true) {
            this.password = password;
            isOpen = false;
            System.out.println("Password is " + password);
            System.out.println("Safe is closed!");
        }
    }

    public void open(String data) {
        if (isBlocked == true) {
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
        if (isOpen == false) {
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
