package patterns.singletone.twoObjects;

public class Main {
    public static void main(String[] args) {

        Ceo ceo = Ceo.getCeo("Bob", "Smith");
        System.out.println(ceo + "     " + ceo.getName());

        Ceo ceo2 = Ceo.getCeo("Bob", "Smith");
        System.out.println(ceo2 + "      " + ceo2.getName());

        Ceo ceo3 = Ceo.getCeo("Piter", "Rod");
        System.out.println(ceo3 + "     " + ceo3.getName());

        Ceo ceo4 = Ceo.getCeo("Test", "Test");
        System.out.println(ceo4 != null ? ceo4 + " " + ceo4.getName() : "Null");


    }
}
