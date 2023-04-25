package patterns.momento;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Editor {
    private MomentoHolder momentoHolder = new MomentoHolder();
    private EditorData editorData;
    private Scanner scanner = new Scanner(System.in);

    public Editor() {
        this.editorData = new EditorData("First line.", Color.BLACK, Type.UNDERSCORE, Alightment.CENTER);
        menu();
    }

    private void menu() {
        System.out.println("Menu: \n1. Add text \n2. Replace \n3. Change color \n4. Change type \n5. Alight text \n6. Undo \n7. Exit");
        int result = Integer.parseInt(scanner.nextLine());
        switch (result) {
            case 1 -> addText();
            case 2 -> replaceText();
            case 3 -> changeColor();
            case 4 -> changeType();
            case 5 -> alightText();
            case 6 -> undo();
            case 7 -> System.exit(0);
        }
        menu();
    }

    private void addText() {
        System.out.println("Input text");
        String text = scanner.nextLine();
        editorData.addText(text);
        print();
    }

    private void replaceText() {
        System.out.println("Input text");
        String replacedText = scanner.nextLine();
        momentoHolder.addMomento(editorData.createMomento());
        editorData.setText(replacedText);
        print();
    }

    private void changeColor() {
        System.out.println("Select color: \nRed \nBlack \nYellow \nGreen");
        Color color = Color.valueOf(scanner.nextLine().toUpperCase());
        momentoHolder.addMomento(editorData.createMomento());
        editorData.setColor(color);
        print();
    }

    private void changeType() {
        System.out.println("Select type: \nBold \nUnderscore \nCursiv");
        Type type = Type.valueOf(scanner.nextLine().toUpperCase());
        momentoHolder.addMomento(editorData.createMomento());
        editorData.setType(type);
        print();
    }

    private void alightText() {
        System.out.println("Select alightment: \nRight \nLeft \nCenter");
        Alightment alightment = Alightment.valueOf(scanner.nextLine().toUpperCase());
        momentoHolder.addMomento(editorData.createMomento());
        editorData.setAlightment(alightment);
        print();
    }

    private void undo() {
        try {
            editorData.setMomento(momentoHolder.getMomento());
            print();
        } catch (EmptyStackException exception) {
            System.out.println("Nothing to undo. It is origin state.");
        }
    }

    private void print(){
        editorData.printData();
    }


}
